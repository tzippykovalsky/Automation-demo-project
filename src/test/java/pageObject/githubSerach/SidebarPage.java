package pageObject.githubSerach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.WebBasePage;

public class SidebarPage extends WebBasePage {
    public SidebarPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id=":rh:")
    private WebElement users;

    @FindBy(id=":r6h:--trailing-visual")
    private WebElement numUsers;

    @FindBy(id=":r6:--label")
    private WebElement repositories;

    public WebElement getNumUsers() {
        return numUsers;
    }
    public WebElement getRepositories() {
        return repositories;
    }
    public void clickOnUsers() {
        users.click();
    }
}
