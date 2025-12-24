package scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class XSSChecker {
    public static void checkReflectedXSS(String targetUrl) {

        String payload = "<script>alert('XSS')</script>";

        try {
            String testUrl = targetUrl + "?q=" + payload;

            URL url = new URL(testUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );

            String line;
            boolean reflected = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(payload)) {
                    reflected = true;
                    break;
                }
            }
            reader.close();

            System.out.println("\n[+] Testing For Reflected XSS:");
            if (reflected) {
                System.out.println("[!] Potential Reflected XSS Detected!");
            } else {
                System.out.println("[-] No Reflected XSS Detected.");
            }

        } catch (Exception e) {
            System.out.println("[-] XSS Test Could Not Be Completed.");
        }
    }
}
