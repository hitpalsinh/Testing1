package com.Login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPrority {
		
	@Test(priority=2)
		public void OpenBrowser {
		ChromeDriver driver = new ChromeDriver();
	}
	@Test(priority=1)
		public void Login {
		System.out.println(500);		

	}

}
