package JUNIT.base;

import enums.BrowserType;
import org.junit.jupiter.api.Test;
import pageObject.githubSerach.SearchFilterPage;
import pageObject.githubSerach.SidebarPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GithubSearchTest extends BaseTest {
    public void setBrowserName() {
        this.browserName = BrowserType.CHROME;
    }

    /**
     * This test verifies that the search functionality on GitHub works as expected.
     * It performs a search for the term "kovalsky" and checks if the current URL matches
     * the expected search URL, confirming that the search action redirects to the correct
     * results page with the correct query parameters.
     * <p>
     * The expected URL after the search should be:
     * https://github.com/search?q=kovalsky&type=repositories
     */
    @Test
    public void testSearchActionUrl() {
        // Create an instance of the SearchFilterPage to interact with the search functionality
        SearchFilterPage searchFilterPage = new SearchFilterPage(driver.getWebDriver());

        // Navigate to GitHub search page
        driver.navigateTo("https://github.com/search");

        // Perform the search action with the term "kovalsky"
        searchFilterPage.searchAction("kovalsky");

        // Assert that the current URL is as expected
        assertEquals("https://github.com/search?q=kovalsky&type=repositories",
                driver.getWebDriver().getCurrentUrl());
    }

//    @Test
//    public void checkNumUsersAfterSearch() throws InterruptedException {
//        SearchFilterPage searchFilterPage = new SearchFilterPage(driver.getWebDriver());
//        SidebarPage sidebarPage = new SidebarPage(driver.getWebDriver());
//        // driver.navigateTo("https://github.com/search?q=kovalsky&type=repositories");
//        driver.navigateTo("https://github.com/search");
//        searchFilterPage.searchAction("tzippykovalsky");
//        wait(1000);
//        sidebarPage.clickOnUsers();
////        assertEquals(1,sidebarPage.getNumUsers());
//    }

//    @Test
//    public void checkNumUsersAfterSearch22() throws InterruptedException {
//        SearchFilterPage searchFilterPage = new SearchFilterPage(driver.getWebDriver());
//        SidebarPage sidebarPage = new SidebarPage(driver.getWebDriver());
//        driver.navigateTo("https://github.com/search");
//        searchFilterPage.searchAction("tzippykovalsky");
//        Thread.sleep(5000);
//        sidebarPage.clickOnUsers();
////    assertEquals(1,sidebarPage.getNumUsers());
//    }
    //מסקנות
    //גם אם משהו לא נראה על המסך זה בסדר לשים אותו בפייגאובגקט

    @Test
    public void checkSidebarAfterSearch() throws InterruptedException {
        SidebarPage sidebarPage=new SidebarPage(driver.getWebDriver());
        driver.navigateTo("https://github.com/search?q=kovalsky&type=repositories");
        Thread.sleep(5000);
        String classAttribute = sidebarPage.getRepositories().getAttribute("class");
        assertTrue(classAttribute.contains("dqUEFM"),"The span should have the class 'dqUEFM' but was: "+classAttribute);

    }
}

