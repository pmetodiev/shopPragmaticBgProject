package pages;

import org.openqa.selenium.By;
import utils.BrowserActions;

public class AdminDashboardPage {

    private static final By LOC_LOGOUT_BUTTON=By.xpath("//a[contains(@href, 'logout')]");

    /**
     * log out the admin user
     */
    public static void logOut() {
        BrowserActions.driver.findElement(LOC_LOGOUT_BUTTON).click();
    }
}
