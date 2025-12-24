package scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HeaderAnalyzer {
    public static void checkHeaders(String targetUrl) {
        try {
            URL url = new URL(targetUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            Map<String, List<String>> headers = con.getHeaderFields();

            String [] securityHeaders = {
                    "Content-Security-Policy",
                    "X-Frame-Options",
                    "X-Content-Type-Options",
                    "Strict-Transport-Security"
            };

            System.out.println("\n[+] Checking Security Headers:");
            for (String header : securityHeaders) {
                if (!headers.containsKey(header)) {
                    System.out.println("[-] Missing: " + header);
                }
            }

        } catch (Exception e) {
            System.out.println("Error checking headers: " + e.getMessage());
        }
    }
    }

