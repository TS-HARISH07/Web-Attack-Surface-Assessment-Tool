package scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class RobotsChecker {
    public static void checkRobots(String targetUrl) {
        try {
            URL robotsUrl = new URL(targetUrl + "/robots.txt");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(robotsUrl.openStream())
            );

            System.out.println("\n[+] robots.txt Found:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (Exception e) {
            System.out.println("\n[-] robots.txt Not Found.");
        }
    }
}
