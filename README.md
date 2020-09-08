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

#### core

**BasePage** is the DSL of project, all the main methods are here and used by anothers classes.

**BaseTest** it is this class that receives the device parameters for the creation of the selenium driver.

**BrowserFactory** is the heart of the project, where the Driver Selenium for the defined system is instantiated.\
The other classes extend the base page and the test page, which in turn extend the DriverFactory, giving access to the entire project by the driver instantiated here.

**Constants** class where are the browserStack credentials.

#### page

**CreateAccountPage** class where business rules and flows are defined.

**HomePage** class where home page methods are mapped.

**LoginPage** class where login methods are mapped.

#### rules

**CreateAccountRules** class where business rules and flows for creating accounts are defined.

**LoginRules** class where business rules and flows for login are defined.

#### util

**ExtentManager**
**ExtentTestManager**
**TestListener**

classes that implement the listeners and reports used in the project.

**DataGenerator** class that generated user and email.

**MessagesAndLogs** class where the strings are storeged to used on validations and logs for another's classes.

#### test

**CreateAccountTest** class that contains account creation test methods.

**LoginTest** class that contains login test methods.

**RecoveryPasswordTest** class that contains recovery password test methods.

#### suite

**createAccount.xml** file where parameters for running account creation tests are entered.

**login.xml** file where parameters for running login tests are entered.

**recoveryPassword.xml** file where parameters for running recovery password tests are entered.


#### Screenshots

**Failures** folder containing screenshots of failed tests.

**Success** folder containing screenshots of success tests.

#### TestReport

**Test-Automation-Report.html** file containing the test execution report.

#### pom.xml

dependency manager

## Running the tests

# NOTICE 1: 
#### The tests are running at BrowserStack datacenters!!\
# NOTICE 2: 
#### The account used is free and has a usage limit!!\
To run the suite test, you should execute the file suite.multiplatform.xml, located at folder src/main/resources.
You can also run by command line through maven commands.

## Devices
Are used the following real devices to execute the tests:

```
iPhone XS
```

```
Samsung Galaxy S10
```

Are possible use hundreds of devices, you just need change the parameter of single.conf.json file, located at folder src/test/resources.

### Maven commands

```
open the terminal.
```

```
navigate to root folder of the project.
```

```
run the command: mvn clean.
```

```
run the command: mvn compile.
```

```
run the command: mvn test.
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

```
Appium logs.
```

### To access all the features, do the following steps.

```
Access BrowserStack site: https://www.browserstack.com/.
```

```
Sign in: user: testesicredi2019@gmail.com, password: woop2019
```

```
Access the menu: Products/Automate
```

```
Done, the results of all executions will be displayed.
```

### Purpose of the tests

```
The tests created simulate an finance invest.
Were explored different types of locators and strategies.
```

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
page object
```

## Deployment

You just must execute the suite test (suite.multiplatform.xml).

## Built With

* [SELENIUM WEBDRIVER](http://seleniumwebdriver.org/selenium-webdriver/) - The automation framework used
* [TestNG](https://testng.org/doc/documentation-main.html/) - The automation framework used
* [MAVEN](https://maven.apache.org/) - Dependency Management
* [JAVA](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html/) - Programing language
* [APPIUM](http://appium.io/) - The automation framework to mobile connection
* [SonarLint](https://www.sonarlint.org/eclipse/) - Lint
* [BrowserStack](https://www.browserstack.com/) - BrowserStack is a cloud and mobile testing platform.


## Versioning

Was used [Sourcetree](https://www.sourcetreeapp.com//) for versioning. 

## Authors

* **Anderson Mann** - *Sr. QA Engineer* - [GitHub](https://github.com/andersonmann)

## License

This project is licensed under the GNU License.
