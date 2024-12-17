import SupportClasses.Browser;
import io.qameta.allure.junit4.DisplayName;
import jdk.jfr.Description;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import PageObject.HeaderPage;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
public class TestHeader {
    private WebDriver driver;
    private HeaderPage headerPage;
    @Before
    public void setUp(){
        // Создаем WebDriver через класс SupportClasses.Browser
        driver = Browser.createWebDriver();
        driver.manage().window().maximize();
        driver.get("https://shop.garant21.ru/");
        headerPage = new HeaderPage(driver);
    }
    @Test
    @DisplayName("Окно выбора города")
    @Description("Проверка отображения окна выбора города при нажатии на город")
    public void testDisplayWindowCitySelect(){
        headerPage.clickButtonCitySeverodvinsk();

    }
}
