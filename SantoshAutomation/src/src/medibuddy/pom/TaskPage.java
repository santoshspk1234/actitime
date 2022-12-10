package src.medibuddy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustBtn;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custNameTbx;
	
	@FindBy (xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDescTbx;
	
	@FindBy (xpath = "//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDd;
					
	@FindBy(xpath = "//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']")
	private WebElement actualCustCrtd;
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setAddNew() {
		addNewBtn.click();
	}
	public void setNewCust() {
		newCustBtn.click();
	}
	public void setCustDetails() {
		custNameTbx.sendKeys("HDFC_0012");;
		custDescTbx.sendKeys("Banking Project");
		selectCustDd.click();
		ourCompany.click();
		createCustBtn.click();
	}
	public WebElement getCreatedCustomer() {
		return actualCustCrtd;
	}
	
	
}
