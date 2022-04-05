# API Demos application testing suite with Appium and Cucumber

This testing suite test different functionality of API Demos application.


## How to Run Tests

- To run the suite from command line in the project folder.

```bash
  mvn clean test
```
- To run the suite from batch file open the project in system explorer and double click on `TestRunner.bat` file.

## How to Run Tests in Headless Mode

- Step 1- Change `Headless = False` to `Headless = True` in `config.properties` file
- Step 2- Run `emulator -list-avds` in CMD
- Step 3- Run `emulator -avd <AVD_NAME> -no-audio -no-window &`


>**Note:**  If emulator is not recognized. Goto C:\Users\YourUserName\AppData\Local\Android\Sdk\tools> and run the command


## How to Run Tests in Group

 To run test in group use those tag given below in `Runner.java` class
 
- `@activity` - To test activity functionality
- `@alert` - To test alert functionality
- `@animation` - To test animation functionality
- `@smoke` - To test all functionality

##	Integrate Test Suite with Jenkins and GitHub for CI/CD
To build this test suite in Jenkins use this github repository `https://github.com/ArnabSau/APIDemosQA`

## `src.main.java` Packages Description
 
- `base`
 - `BaseClass.java` - Setup driver
- `helper`
 - `AppiumServerManager.java` - Manage the Appium server like start and close server
 - `ExcelReaderManager.java` - Read data from excel file 
- `screens.home`
 - `HomeScreen.java` - Home screen locator and action method
- `screen.app` 
 - `ActivityScreen.java` - Activity screen locator and action method
 - `AlertDialogsScreen.java` - Alert dialogs screen locator and action method
 - `AppScreen.java` - App screen locator and action method
 - `CustomTitleScreen.java` - Custom title screen locator and action method
- `screens.animation`
 - `AnimationScreen.java` - Animation screen locator and action method
 - `HideShowAnimation.java` - Hide show animation screen locator and action method
- `utils`
 - `TouchManager.java` - Basic touch action like scroll and tap 
 - `ConfigReader.java` - Read data from `config.properties` file
 - `TestDataReader.java` - Have method to provide test data 



### `src.test.java` Packages Description :
- `features` - Has all the feature file 
- `hooks` - Has all the hooks file
- `runner` - Has all the runner file
- `steps` - Has all the steps file



### Other File Description :

- `config.properties` - Has all the data regarding driver configuration
- `log4j2.properties` - Has all the properties related to logging 
- `TestData.xlsx` - Has all test data
- `extent.properties` - Has all the properties related to extent report
- `pom.xml` - Has all required dependency

### Reports and Logs :
- Extent report gets generated after the run under `\test-output\ExtentReport\report.html`
- Screenshots gets placed under `\test-output\screenshots` folder 
- TestNG report as `emailable-report.html` gets generated under `\test-output` folder
- Logs generate as `Mylogs.log` under `\logs\Mylogs.log` folder
