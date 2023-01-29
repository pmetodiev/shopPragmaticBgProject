package utils;
import static org.testng.Assert.*;
public class CommonVerifications {
    /**
     * Method witch verifies the title based on the provided expected title and logs a message in case of assert failure.
     * @param expectedTitle the expected title
     * @param messageInCaseTitleIsIncorrect error message in case the assert fails
     */
    public static void verifyTitle(String expectedTitle, String messageInCaseTitleIsIncorrect) {
        String actualTitle=BrowserActions.driver.getTitle();
        assertEquals(actualTitle,expectedTitle,messageInCaseTitleIsIncorrect);

    }
}
