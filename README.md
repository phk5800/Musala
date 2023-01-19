<h3 align="left">Musala project with Java & Selenium </h3>
<p align="left">
</p>

<h3 align="left">1. Environment Setup needed: </h3>
<p align="left">
</p>
-Java 8.
(To install it, follow the JDK Installation Guide.https://docs.oracle.com/en/java/javase/19/install/overview-jdk-installation.html) <br/>
-Maven https://maven.apache.org/install.html <br/>
-Git https://git-scm.com/downloads <br/>
-Selenium  www.selenium.dev/downloads <br/>
-Junit 5 <br/>
-chromedriver.exe and geckodriver.exe <br/>
(The major version numbers of the browser and the driver must be the same.)


<h3 align="left">2. Instructions </h3>
<p align="left">
</p>

Clone the repo:

<b>Git</b>:
$ git clone [git@github.com:testdouble/java-testing-example.git](https://github.com/phk5800/Musala.git)

<b>Svn</b>:
$ svn co [https://github.com/testdouble/java-testing-example](https://github.com/phk5800/Musala.git)
Or download a ZIP of main manually and expand the contents someplace on your system

<h3 align="left">3. Defining the browser and config properties </h3>
<p align="left">
</p>

- By default, the project will default to ChromeLocal (running a local Chrome instance) if no browser is specified.
To run Chrome, you'll need chromedriver on your path.

- To change the browser Selenium will launch, edit the file "configs/configuration.properties" there you can set the url, the browser and the driver desired. <br/>
Default browser is Chrome - chromedriver.exe but can be changed to Firefox - geckodriver.exe

<h3 align="left">4. Writing tests </h3>
<p align="left">
</p>

- To write tests, you can call any WebDriver methods by calling: DriverManager.getDriver()
This will allow you access all the available methods to all WebDrivers as outlined by the W3C standard.

- To enable parallel testing "@Execution(CONCURRENT)" must be set as annotation in the Tests.java

- TestCase1 method is reading from file src/main/resources/data.csv file. Running 5 different scenarios with the data from the file.

<h3 align="left">5. Installing the dependencies </h3>
<p align="left">
</p>

The example project uses Apache Maven for package management. All dependencies are listed in the project's pom.xml file. 
If you are using a Java IDE, then the IDE should install the dependencies and build the project for you. 
However, you may also install dependencies from the command line

