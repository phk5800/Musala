Java-Junit-Selenium

Environment Setup needed:
-Java 8.
(To install it, follow the JDK Installation Guide.https://docs.oracle.com/en/java/javase/19/install/overview-jdk-installation.html)
-Maven https://maven.apache.org/install.html
-Git https://git-scm.com/downloads
Selenium  www.selenium.dev/downloads
 ->Junit 5
 ->chromedriver.exe
(The major version numbers of Chrome and ChromeDriver must be the same.)



*Instructions
Clone the repo:

Git:
$ git clone git@github.com:testdouble/java-testing-example.git

Svn:
$ svn co https://github.com/testdouble/java-testing-example
Or download a ZIP of main manually and expand the contents someplace on your system


*Defining the browser
By default, the project will default to ChromeLocal (running a local Chrome instance) if no browser is specified.
To express a specific browser type, at runtime or through VM options in your IDE, pass the following property.
To run Chrome, you'll need chromedriver on your path. A Windows executable has been included in this project's bin/ directory.

To change the browser Selenium will launch, edit our configs/configuration.properties there you can set the url, the browser and the driver desired.
Default browser -> Chrome - chromedriver.exe
->Firefox - geckodriver.exe


*Writing tests
To write tests, you can call any WebDriver methods by calling:

DriverManager.getDriver()

This will allow you access all the available methods to all WebDrivers as outlined by the W3C standard.

- To enable parallel testing "@Execution(CONCURRENT)" must be set as annotation at the Tests.java

- TestCase1 method is reading from file src/main/resources/data.csv file. Running 5 different scenarios with the data from the file.

*Installing the dependencies
The example project uses Apache Maven for package management. All dependencies are listed in the project's pom.xml file. 
If you are using a Java IDE, then the IDE should install the dependencies and build the project for you. 
However, you may also install dependencies from the command line using the following command:

