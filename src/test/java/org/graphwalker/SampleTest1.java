package org.graphwalker;

import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.condition.VertexCoverage;
import org.graphwalker.core.generator.CombinedPath;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.core.model.Edge;
import org.graphwalker.java.test.TestBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sample.common.base.BaseTest;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SampleTest1 extends ExecutionContext {
	BaseTest baseTest = new BaseTest();
	public final static Path MODEL_PATH = Paths.get("org/graphwalker/SampleTest_Amazon.graphml");
	WebDriver driver;

	/*
	 * @BeforeTest public void setup() { baseTest.openBrowser();
	 * //ChromeDriverManager.getInstance().setup(); }
	 */

	// @AfterTest
	public void quit() {
		baseTest.quit();
	}

	public void e_StartBrowser() {
		driver = baseTest.openBrowser();
	}

	public void v_SearchResult() {
		// TODO Auto-generated method stub

	}

	public void v_VerifyProductName() {
		// TODO Auto-generated method stub

	}

	public void e_EnterBaseURL() {
		// TODO Auto-generated method stub
		driver.get("http://www.amazon.com");
	}

	public void e_ProductDetailPage() {
		// TODO Auto-generated method stub

	}

	public void v_BaseURL() {
		WebDriverWait waiter = new WebDriverWait(driver, 3);
		// TODO Auto-generated method stub
		// waiter.until(ExpectedConditions.titleContains("Amazon.com: Online Shopping
		// "));
		waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))).clear();
		waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")))
				.sendKeys("Model-based testing" + Keys.ENTER); //

	}

	public void v_BrowserStarted() {
		// TODO Auto-generated method stub
		// Assert.assertNotNull(driver);
	}

	public void e_SearchBook() {
		// TODO Auto-generated method stub

	}


	@Test
	public void runFuncTest() {
		try {
			SampleTest1 context = new SampleTest1();
			CombinedPath combinedPath = new CombinedPath();
			combinedPath.addPathGenerator(new RandomPath(new EdgeCoverage(100)));
			combinedPath.addPathGenerator(new RandomPath(new VertexCoverage(100)));
			new TestBuilder().addContext(context.setPathGenerator(combinedPath)
					.setNextElement(new Edge().setName("e_StartBrowser").build()), MODEL_PATH).execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
