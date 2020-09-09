# cloud-web-automation-test

## Getting Started
This code was developed to demonstrate how to run web automation tests in thousands of combinations devices running at cloud.\
These tests are executed at real devices on browserStack cloud.

## Project structure

The project structure could be viewed bellow.

```
.
└── src
   └── main
       └── java
           ├── core
           │   └── BasePage.java
           │   └── BaseTest.java
           │   └── Constants.java
           │   └── BrowserFactory.java
           │   └── Constants.java
           ├── page
           │   └── CreateAccountPage.java
           │   └── HomePage.java
           │   └── LoginPage.java
           │── rules
           │   └── CreateAccountRules.java
           │   └── LoginRules.java
           │── util
           │   └── DataGenerator.java
           │   └── ExtentManager.java
           │   └── ExtentTestManager.java
           │   └── MessagesAndLogs.java
           │   └── TestListener.java
└── src
   └── test
       └── java
           ├── test
           │   └── CreateAccountTest.java
           │   └── LoginTest.java
           │   └── RecoveryPasswordTest.java
└── src
   └── test
       └── resources
           ├── suite
           │   └── createAccount.xml
           │   └── logim.xml
           │   └── recoveryPassword.xml
└── screenshots
       └── Failures
       └── Success
└── TestReport
       └── Test-Automation-Report.html
└── pom.xml
```

### core

**BasePage** is the DSL of project, all the main methods are here and used by anothers classes.

**BaseTest** it is this class that receives the device parameters for the creation of the selenium driver.

**BrowserFactory** is the heart of the project, where the Driver Selenium for the defined system is instantiated.\
The other classes extend the base page and the test page, which in turn extend the DriverFactory, giving access to the entire project by the driver instantiated here.

**Constants** class where are the browserStack credentials.

### page

**CreateAccountPage** class where business rules and flows are defined.

**HomePage** class where home page methods are mapped.

**LoginPage** class where login methods are mapped.

### rules

**CreateAccountRules** class where business rules and flows for creating accounts are defined.

**LoginRules** class where business rules and flows for login are defined.

### util

**ExtentManager**
**ExtentTestManager**
**TestListener**

classes that implement the listeners and reports used in the project.

**DataGenerator** class that generated user and email.

**MessagesAndLogs** class where the strings are storeged to used on validations and logs for another's classes.

### test

**CreateAccountTest** class that contains account creation test methods.

**LoginTest** class that contains login test methods.

**RecoveryPasswordTest** class that contains recovery password test methods.

### suite

**createAccount.xml** file where parameters for running account creation tests are entered.

**login.xml** file where parameters for running login tests are entered.

**recoveryPassword.xml** file where parameters for running recovery password tests are entered.


### Screenshots

**Failures** folder containing screenshots of failed tests.

**Success** folder containing screenshots of success tests.

#### TestReport

**Test-Automation-Report.html** file containing the test execution report.

### pom.xml

dependency manager

### Design Pattern

The below design patterns are used at this project

```
DSL
```

```
Factory
```

```
Singleton
```

```
Strategy
```

```
page object model
```

## Running the tests

### NOTICE 1: 
#### The tests will be running at BrowserStack data centers!
### NOTICE 2: 
#### The account used is TRIAL and has a usage limit!

To run the suite test, you could execute manually the files located at folder `src/test/resources/suite`.\
You can also run by command line through maven commands.

## Test parameters

Tests can be performed on various operating systems and versions.\
To modify the parameters follow the instructions below.

1. The OS to test on
   - [available operating systems](https://www.browserstack.com/list-of-browsers-and-platforms/automate)
     - example: `<parameter name="os" value="Windows" />`
     
2. Version of the OS to test on
   - [available operating systems versions](https://www.browserstack.com/list-of-browsers-and-platforms/automate)
     - example: `<parameter name="os_version" value="10" />`
         
3. Browser you want to test on
   - [available browsers](https://www.browserstack.com/list-of-browsers-and-platforms/automate)
     - example: `<parameter name="browser" value="Chrome" />`
     
4. Browser version you want to test on
   - [available browsers versions](https://www.browserstack.com/list-of-browsers-and-platforms/automate)
     - example: `<parameter name="browser_version" value="84" />`
    
5. Set the resolution of your VM before beginning your test
   - [supported resolutions](https://www.browserstack.com/docs/automate/selenium/change-screen-resolution)
     - ex: `<parameter name="resolution" value="1280x800" />`

### Maven commands

```
open the terminal.
```

```
navigate to the pom.xml file folder.
```

```
run the command: mvn clean test.
```

## Accessing the browserStack

After or during the execution of the tests, you can check the resources available in the browserstack.
Among which I can cite:

```
Text logs.
```

```
Visual logs.
```

```
Console logs.
```

```
Recorded video.
```

```
Network logs.
```

### To access all the features, do the following steps.

```
Access BrowserStack site: https://automate.browserstack.com/dashboard/v2/.
```

```
Sign in: user: mannautomationtest@gmail.com, password: Zenvia@2020
```

```
Access the option: DASHBOARD
```

```
The results of all executions will be displayed, you could use filters like: project, user, build.
```

## Docker hub
1. Docker image jenkins
   - [andersonmann/missao-devops-jenkins](https://hub.docker.com/repository/docker/andersonmann/missao-devops-jenkins)

2. Docker image Sonarqube
   - [andersonmann/integracao-continua](https://hub.docker.com/repository/docker/andersonmann/integracao-continua)
     
## Versioning

Was used [Sourcetree](https://www.sourcetreeapp.com//) for versioning. 

## Built With

* [SELENIUM WEBDRIVER](http://seleniumwebdriver.org/selenium-webdriver/) - The automation framework used
* [TestNG](https://testng.org/doc/documentation-main.html/) - The test framework used
* [MAVEN](https://maven.apache.org/) - Dependency Management
* [JAVA](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html/) - Programing language
* [SonarLint](https://www.sonarlint.org/eclipse/) - Linter
* [BrowserStack](https://www.browserstack.com/) - BrowserStack is a cloud and mobile testing platform.
* [Jenkins](https://www.jenkins.io/) - Automation server
* [Docker](https://www.docker.com/) - Virtualization service
* [Sonarqube](https://www.sonarqube.org/) - Continuous Code Inspection

## Authors

* **Anderson Mann** - *Sr. QA Engineer* - [GitHub](https://github.com/andersonmann)

## License

This project is licensed under the GNU License.
