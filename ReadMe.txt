
Project Name: IDENTIFY COURSES

----------------------------------------------------------------------------------------------------------------------------------------------------
 
Problem Statement: Find the Interest Amount for current year
 
Search and display all web development courses 

1. Should be for beginners level.
2. Courses offered in English language
3. Display first two courses with name, total learning hours and rating.
(Suggested Site: coursera.org however  you are free to choose any other legitimate  site)

----------------------------------------------------------------------------------------------------------------------------------------------------
 
Detailed Description: Main Project
 
1. Search for web development courses for Beginners level & English Language and extract the course names, total learning hours & rating for first 2 courses
2. Look for Language Learning; Extract all the languages and different levels with its total count & display them
3. In Home page, go to "For Business"; Look into Courses for Campus under Product; Fill the form with any one input invalid (example: email); Capture the error message & display
(Suggested Site: coursera.org however  you are free to choose any other legitimate  site)

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Key Automation Scope

Handling different browser windows, search option
Extract multiple drop down list items & store in collections
Navigating back to home page
Filling form (in different objects in web page)
Capture warning message
Scrolling down in web page

----------------------------------------------------------------------------------------------------------------------------------------------------
 
Output: 

==================

[INFO] Scanning for projects...
[INFO]
[INFO] [1m-----------------< [0;36msindhu_hackathon:sindhu_hackathon[0;1m >------------------[m
[INFO] [1mBuilding sindhu_hackathon 0.0.1-SNAPSHOT[m
[INFO]   from pom.xml
[INFO] [1m--------------------------------[ jar ]---------------------------------[m
[INFO]
[INFO] [1m--- [0;32mresources:3.3.1:resources[m [1m(default-resources)[m @ [36msindhu_hackathon[0;1m ---[m
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO]
[INFO] [1m--- [0;32mcompiler:3.11.0:compile[m [1m(default-compile)[m @ [36msindhu_hackathon[0;1m ---[m
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] [1m--- [0;32mresources:3.3.1:testResources[m [1m(default-testResources)[m @ [36msindhu_hackathon[0;1m ---[m
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource from src\test\resources to target\test-classes
[INFO]
[INFO] [1m--- [0;32mcompiler:3.11.0:testCompile[m [1m(default-testCompile)[m @ [36msindhu_hackathon[0;1m ---[m
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] [1m--- [0;32msurefire:3.2.5:test[m [1m(default-test)[m @ [36msindhu_hackathon[0;1m ---[m
[INFO] Using auto detected provider org.apache.maven.surefire.testng.TestNGProvider
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running [1mTestSuite[m
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.


Scenario: Search for Web Development      [90m# Features/01HomePage.feature:5[0m
Coursera page is loaded and popup is clicked
  [32mGiven [0m[32mTo load the coursera page[0m         [90m# stepDefinition.HomePageTest.to_load_the_coursera_page()[0m
  [32mWhen [0m[32msearch the Web Development Courses[0m [90m# stepDefinition.HomePageTest.search_the_web_development_courses()[0m
Search page is loaded
  [32mThen [0m[32mThe search results are loaded[0m      [90m# stepDefinition.HomePageTest.the_search_results_are_loaded()[0m


Scenario: Printing Courses    [90m# Features/02CoursePage.feature:2[0m
Data is going to be filtered and result is printed
  [32mGiven [0m[32mSearch page is loaded[0m [90m# stepDefinition.CoursePageTest.search_page_is_loaded()[0m
  [32mWhen [0m[32mFilter is added[0m        [90m# stepDefinition.CoursePageTest.filter_is_added()[0m
Course Name:Meta Front-End Developer Professional Certificate
Rating of the course:4.7
Total Hours of the Course:212
Course Name:Web Design for Everybody: Basics of Web Development & Coding Specialization
Rating of the course:4.8
Total Hours of the Course:74
  [32mThen [0m[32mResult is printed[0m      [90m# stepDefinition.CoursePageTest.result_is_printed()[0m


Scenario: Print language and levels                    [90m# Features/03LanguageLearningPage.feature:2[0m
Page is loaded and Language is going to print
  [32mGiven [0m[32mPage is loaded and filter is appiled[0m           [90m# stepDefinition.LanguageLearningPageTest.page_is_loaded_and_filter_is_appiled()[0m
English (2,574)
Spanish (1,684)
Arabic (1,526)
French (1,520)
Portuguese (Brazil) (1,468)
Japanese (1,456)
Korean (1,444)
Chinese (China) (1,442)
German (1,440)
Indonesian (1,432)
Ukrainian (1,414)
Hindi (1,413)
Italian (1,412)
Swedish (1,410)
Dutch (1,409)
Greek (1,409)
Polish (1,409)
Thai (1,409)
Turkish (1,409)
Russian (1,373)
Kazakh (1,303)
Hungarian (1,014)
Chinese (Traditional) (10)
Hebrew (2)
Portuguese (1)
Beginner (1,573)
Intermediate (1,230)
Advanced (114)
Mixed (259)
  [32mWhen [0m[32mAll language and different levels are printed[0m   [90m# stepDefinition.LanguageLearningPageTest.all_language_and_different_levels_are_printed()[0m
Printed Successfully
  [32mThen [0m[32mPrinted Successfully and clicking For Bussiness[0m [90m# stepDefinition.LanguageLearningPageTest.printed_successfully_and_clicking_for_bussiness()[0m


Scenario: Filling the form                          [90m# Features/04FormFilling.feature:3[0m
Form is loaded
  [32mGiven [0m[32mPage is loaded and form is viewed[0m           [90m# stepDefinition.FormFillingTest.page_is_loaded_and_form_is_viewed()[0m
Must be valid email.
example@yourdomain.com
example@yourdomain.com
  [32mWhen [0m[32mForm is filled and error message is captured[0m [90m# stepDefinition.FormFillingTest.form_is_filled_and_error_message_is_captured()[0m
Error message is captured and the website is closed successfully
  [32mThen [0m[32mThe page is successfully closed[0m              [90m# stepDefinition.FormFillingTest.the_page_is_successfully_closed()[0m
Browser is launched
Web Development Course is searched
Course Name:Meta Front-End Developer Professional Certificate
Rating of the course:4.7
Total Hours of the Course:212
Course Name:Web Design for Everybody: Basics of Web Development & Coding Specialization
Rating of the course:4.8
Total Hours of the Course:74
Courses printed
English (2,574)
Spanish (1,684)
Arabic (1,526)
French (1,520)
Portuguese (Brazil) (1,468)
Japanese (1,456)
Korean (1,444)
Chinese (China) (1,442)
German (1,440)
Indonesian (1,432)
Ukrainian (1,414)
Hindi (1,413)
Italian (1,412)
Swedish (1,410)
Dutch (1,409)
Greek (1,409)
Polish (1,409)
Thai (1,409)
Turkish (1,409)
Russian (1,373)
Kazakh (1,303)
Hungarian (1,014)
Chinese (Traditional) (10)
Hebrew (2)
Portuguese (1)
Beginner (1,573)
Intermediate (1,230)
Advanced (114)
Mixed (259)
Languages and levels are printed
Must be valid email.
example@yourdomain.com
example@yourdomain.com
Error Message is captured
Page is closed
[INFO] [1;32mTests run: [0;1;32m8[m, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 135.9 s -- in [1mTestSuite[m
[INFO]
[INFO] Results:
[INFO]
[INFO] [1;32mTests run: 8, Failures: 0, Errors: 0, Skipped: 0[m
[INFO]
[INFO] [1m------------------------------------------------------------------------[m
[INFO] [1;32mBUILD SUCCESS[m
[INFO] [1m------------------------------------------------------------------------[m
[INFO] Total time:  02:20 min
[INFO] Finished at: 2024-04-19T07:28:50+05:30
[INFO] [1m------------------------------------------------------------------------[m
----------------------------------------------------------------------------------------------------------------------------------------------------
 
Dependencies and Plugins:
 
<dependencies>

			<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>sindhu_hackathon</groupId>
  <artifactId>sindhu_hackathon</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>3.2.5</version>
<configuration>
<suiteXmlFiles>
<suiteXmlFile>testngcucu.xml</suiteXmlFile>
<suiteXmlFile>testng.xml</suiteXmlFile>
</suiteXmlFiles>
</configuration>
</plugin>
</plugins>
</build>
<dependencies>
  <!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.18.1</version>
</dependency>
 
  <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java  -->    
    <dependency>
		    <groupId>io.cucumber</groupId>
		    <artifactId>cucumber-java</artifactId>
		    <version>7.14.1</version>
		</dependency>
 
 
       <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
	
<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.15.1</version>
</dependency>
 
	<dependency>
		    <groupId>io.cucumber</groupId>
		    <artifactId>cucumber-junit</artifactId>
		    <version>7.14.1</version>
		    <scope>test</scope>
		</dependency>
 
	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-testng</artifactId>
			<version>7.15.0</version>
		</dependency>
		
			<!-- https://mvnrepository.com/artifact/tech.grasshopper/extentreports-cucumber7-adapter -->
	<!-- https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot -->
		<dependency>
		<groupId>ru.yandex.qatools.ashot</groupId>
		<artifactId>ashot</artifactId>
		<version>1.5.4</version>
		</dependency>
		  <dependency>
<groupId>com.aventstack</groupId>
<artifactId>extentreports</artifactId>
<version>5.1.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports-cucumber4-adapter -->
		<dependency>
		<groupId>tech.grasshopper</groupId>
		<artifactId>extentreports-cucumber7-adapter</artifactId>
		<version>1.14.0</version>
		</dependency>
		
		
		<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-core</artifactId>
			<version>2.22.1</version>
		</dependency>
 
		<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-api</artifactId>
			<version>2.22.1</version>
		</dependency>
		
	
<!-- https://mvnrepository.com/artifact/com.relevantcodes/extentreports -->
 
<!-- https://mvnrepository.com/artifact/org.freemarker/freemarker -->
 
 
  </dependencies>
</project>


----------------------------------------------------------------------------------------------------------------------------------------------------