import SupportClasses.Browser;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import PageObject.HeaderPageSteps;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestProofAgeWindow {
    private WebDriver driver;
    private HeaderPageSteps headerPageSteps;
    @BeforeEach
    public void setUp(){
        // Создаем WebDriver через класс SupportClasses.Browser
        driver = Browser.createWebDriver();
        driver.manage().window().maximize();
        driver.get("https://shop.garant21.ru/");
        headerPageSteps = new HeaderPageSteps(driver);
    }
    @Test
    @DisplayName("Тест 1: ")
    @Description("Проверка отображения выбранного города в шапке сайта: Северодвинск")
    public void testDisplayCitySeverodvinsk(){
        headerPageSteps.waitButtonCitySeverodvinsk();
        headerPageSteps.clickButtonCitySeverodvinsk();
        headerPageSteps.waitCitySeverodvinsk();
        assertEquals(headerPageSteps.displayCitySeverodvinsk(), true);
    }
    @AfterEach
    public void rearDown(){
        driver.quit();
    }
}
