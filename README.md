# cloud-web-automation-test

## Getting Started
This code was developed to the technical challenge at the Plataforma Digital Sicredi.(enjoy)
The tests are executed at real devices on browserStack cloud.

These instructions will get you a copy of the project up and running on your local machine for development and testing 
purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

* Java JRE
* Java JDK
* Apache Maven
* BrowserStack account


## Estrutura do projeto

A estrutura do projeto pode ser visualizada abaixo.

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
           ├── login
           │   └── RechargeGooglePlayTest.java
└── src
   └── test
       └── resources
           ├── recarga.xml
└── screenshots
       └── Failures
       └── Success
└── TestReport
       └── Test-Automation-Report.html
└── pom.xml
```

## Devices
Are used the following real devices to execute the tests:

```
iPhone XS
```

```
Samsung Galaxy S10
```

Are possible use hundreds of devices, you just need change the parameter of single.conf.json file, located at folder src/test/resources.

## Running the tests

NOTICE 1: The tests are running at BrowserStack datacenters!!
NOTICE 2: The account used is free and has a usage limit!!
To run the suite test, you should execute the file suite.multiplatform.xml, located at folder src/main/resources.
You can also run by command line through maven commands.

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
