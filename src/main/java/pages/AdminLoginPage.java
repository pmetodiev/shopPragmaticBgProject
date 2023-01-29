package pages;

import org.openqa.selenium.By;
import utils.BrowserActions;
import static org.testng.Assert.*;

public class AdminLoginPage {
    private static final String ADMIN_LOGIN_PAGE_URL= "http://shop.pragmatic.bg/admin/";

    private static final By LOC_USERNAME= By.id("input-username");
    private static final By LOC_PASSWORD= By.id("input-password");
    private static final By LOC_LOGIN_BUTTON= By.xpath("//button[@class='btn btn-primary']") ;
    private static final By LOC_ERROR_VALIDATION_MESSAGE=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
    /**
     * Method which takes you to admin login  page
     */
    public static void goTo() {
        BrowserActions.driver.get(ADMIN_LOGIN_PAGE_URL);
    }

    /**
     * Method that logs in a user by username and password!
     * @param username the name of the user
     * @param password the password of the user
     */
    public static void login(String username, String password) {
        BrowserActions.driver.findElement(LOC_USERNAME).sendKeys(username);
        BrowserActions.driver.findElement(LOC_PASSWORD).sendKeys( password);
        BrowserActions.driver.findElement(LOC_LOGIN_BUTTON).click();
    }

    public static void verifyErrorValidationMessageInCaseOffUnssuccesfulLogin(String expectedErrorMessage, String messageInCaseOfIncorrectValidationMessage) {
   String actualErrorValidationMessage=BrowserActions.driver.findElement(LOC_ERROR_VALIDATION_MESSAGE).getText();
   assertTrue(actualErrorValidationMessage.contains(expectedErrorMessage),messageInCaseOfIncorrectValidationMessage);
    }
}
