package scanner;

import java.net.HttpURLConnection;
import java.net.URL;

public class DirectoryChecker {
    public static void checkDirectories(String targetUrl) {

        String [] dirs = {"/Admin/", "/Backup/", "/Test/"};

        System.out.println("\n[+] Checking Common Directories:");
        for (String dir : dirs) {
            try {
                URL url = new URL(targetUrl + dir);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                if (conn.getResponseCode() == 200) {
                    System.out.println("[!] Open Directory Found: " + dir);
                }

            } catch (Exception ignored) {}
        }
    }
}

