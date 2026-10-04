# 📱 Mobile Automation Framework

A scalable and reusable Mobile Test Automation Framework built using **Java, Appium, Selenium, Cucumber, TestNG, and Maven**, supporting both **Android and iOS** platforms through Appium.

---

## 🚀 Features

- Android Automation (UiAutomator2)
- iOS Automation (XCUITest)
- Real Device Support
- Android Emulator Support
- iOS Simulator Support
- Cucumber BDD Framework
- TestNG Execution
- Page Object Model (POM)
- Excel Data-Driven Testing
- Screenshot Capture on Failures
- HTML Reporting
- Jenkins CI/CD Integration
- Reusable Utilities and Components

---

## 🛠 Tech Stack

- Java
- Appium
- Selenium WebDriver
- Cucumber
- TestNG
- Maven
- Apache POI
- Extent Reports
- Jenkins
- Android (UiAutomator2)
- iOS (XCUITest)

---

## 📂 Project Structure

```text
TestAutomate
│
├── ExecutionReports
│   ├── FailedScreenshots
│   ├── HTMLReports
│   └── Logs
│
├── src
│   └── test
│       ├── java
│       │   ├── mobileutil
│       │   ├── pageobjects
│       │   │   └── BaseClass.java
│       │   ├── Pages
│       │   │   └── SwagLabs.java
│       │   ├── step_definitions
│       │   └── RunCukesTest.java
│       │
│       └── resources
│           ├── APK
│           ├── ExcelFiles
│           ├── features
│           └── testData
│
├── pom.xml
├── testng.xml
└── jenkinsfile
```

---

## ⚙️ Prerequisites

### Android

- Android Studio
- Android SDK
- Appium Server
- Android Device / Emulator

### iOS

- macOS
- Xcode
- iOS Simulator / Real Device
- Appium Server
- XCUITest Driver

### Common

- Java 17+
- Maven
- Node.js

Verify Installation:

```bash
java -version
mvn -version
node -v
appium -v
adb devices
```

---

## 📦 Installation

```bash
git clone <repository-url>
cd TestAutomate

mvn clean install
```

Start Appium:

```bash
appium
```

---

## 📱 Platform Support

| Platform | Automation Engine |
|-----------|------------------|
| Android | UiAutomator2 |
| iOS | XCUITest |

The framework is designed to execute the same business scenarios across Android and iOS with minimal platform-specific changes.

---

## ▶️ Test Execution

```bash
mvn clean test
```

or

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## 📊 Reports

Generated under:

```text
ExecutionReports/HTMLReports
```

Screenshots:

```text
ExecutionReports/FailedScreenshots
```

---

## 🔄 CI/CD

Jenkins pipeline execution supported via:

```text
jenkinsfile
```

---

## 👨‍💻 Author

**Thirumalesu Yadlapalli**

Senior QA Automation Engineer

**Skills:** Java • Appium • Selenium • Cucumber • TestNG • Maven • Jenkins • Android • iOS