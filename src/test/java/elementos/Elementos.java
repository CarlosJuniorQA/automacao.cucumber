package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By username = By.xpath("//input[@id='user-name']");
	private By password = By.xpath("//input[@name='password']");
	private By login = By.xpath("//input[@id='login-button']");
	private By homeTxT = By.xpath("//span[@data-test='title']");
	private By errorPass = By.xpath("//div[@class='error-message-container error']");
	private By errorUser = By.xpath("//div[@class='error-message-container error']");

	public By getUsername() {
		return username;
	}

	public By getPassword() {
		return password;
	}

	public By getLogin() {
		return login;
	}

	public By getHomeTxT() {
		return homeTxT;
	}

	public By getErrorPass() {
		return errorPass;
	}

	public By getErrorUser() {
		return errorUser;
	}
	
	

} 
     