package scanner;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target URL including (http/https): ");
        String targetUrl = sc.nextLine();

        System.out.println("\n[+] Starting Web Attack Surface Scan....");
        HeaderAnalyzer.checkHeaders(targetUrl);
        RobotsChecker.checkRobots(targetUrl);
        DirectoryChecker.checkDirectories(targetUrl);
        XSSChecker.checkReflectedXSS(targetUrl);


        System.out.println("\n[+] Scan Completed.");
    }
}
