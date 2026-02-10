package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import driver.Navegador;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends Navegador {

	public static void abrirNavegador() {
	    String site = "https://www.saucedemo.com/";
	    String navegador = "Chrome";
	    
	    if (navegador.equalsIgnoreCase("Chrome")) {
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
	   } else {
		   WebDriverManager.firefoxdriver().setup();
		   driver = new FirefoxDriver();
	   }
	   driver.get(site);
	   driver.manage().window().maximize();
	   
	}

	public static void fecharNavegador() {
		driver.quit();
	}


}