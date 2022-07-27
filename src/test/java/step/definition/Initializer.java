package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;
import io.cucumber.java.*;

public class Initializer extends Base{

	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario "+ scenario.getName() + " Started");
		browser(); //this line will launch our browser
		openBrowser(); //this line will launch the url for us
	}
	
	
	@After
	public void afterHooks(Scenario scenario) {
		tearDown();
		logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
		// we can also write code to capture screenshot if our test fails
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot,"image/png", "Failed Test");
		}else {
			logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
		}
	}
}
