package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class ScreenShotAsgn extends BaseClass {

	@Test
	public void screenShot() throws IOException {
		TakesScreenshot t=(TakesScreenshot) driver;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShot/asg1.png");
		FileUtils.copyFile(src, dest);
	}
	
}
