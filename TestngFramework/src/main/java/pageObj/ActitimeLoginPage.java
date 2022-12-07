package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class ActitimeLoginPage extends Base{
	
	public ActitimeLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;

	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginBtn;

	public void singInToActitime(String username, String pass) {
		userName.sendKeys(username);
		password.sendKeys(pass);
		loginBtn.click();
	}
}