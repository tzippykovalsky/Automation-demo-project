package pageObject.githubSerach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.WebBasePage;
//להעביר את כל הpackage לmain
public class SearchFilterPage extends WebBasePage {
    public SearchFilterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "UnstyledTextInput__ToggledUnstyledTextInput-sc-14ypya-0")
    private WebElement searchFilterInput;

    public void sendTextToSearch(String filterText) {
       elementAction.typeText(searchFilterInput,filterText);
    }
    public void enterSearchKey(){
        elementAction.enter(searchFilterInput);
    }

    public void searchAction(String filterText){
        sendTextToSearch(filterText);
        enterSearchKey();
    }
}
