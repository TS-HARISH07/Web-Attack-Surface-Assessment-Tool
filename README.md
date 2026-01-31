# Web Attack Surface Assessment Tool

Author: T S Harish  
Domain: Cybersecurity – Ethical Hacking  

---

## 📌 Overview
The Web Attack Surface Assessment Tool is a Java-based command-line security
tool designed for authorized web reconnaissance and basic vulnerability
analysis.

The tool focuses on identifying common web security misconfigurations and
potential reflected input behavior aligned with OWASP Top 10 principles.
It performs non-intrusive checks and does not exploit vulnerabilities or
modify target systems.

---

## 🎯 Target Users
- Cybersecurity students
- Ethical hacking learners
- Entry-level security analysts
- Authorized security testing environments

---

## ⚙️ Features
- HTTP security header analysis
- robots.txt reconnaissance
- Common directory enumeration
- Reflected XSS detection
- Console-based output reporting

---

## 🛠 Technology Stack
- Java (Core)
- HttpURLConnection
- Modular CLI architecture

---

## 🔍 How the Tool Works
1. Accepts a target URL from the user
2. Performs attack surface reconnaissance
3. Analyzes HTTP response security headers
4. Checks for exposed configuration files
5. Tests for reflected input behavior
6. Displays findings in the terminal

---

## ▶️ Usage

### Compile
```bash
javac scanner/*.java
