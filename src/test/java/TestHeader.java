import SupportClasses.Browser;
import io.qameta.allure.junit4.DisplayName;
import jdk.jfr.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import PageObject.HeaderPageSteps;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class TestHeader {
    private WebDriver driver;
    private HeaderPageSteps headerPageSteps;
    @Before
    public void setUp(){
        // Создаем WebDriver через класс SupportClasses.Browser
        driver = Browser.createWebDriver();
        driver.manage().window().maximize();
        driver.get("https://shop.garant21.ru/");
        headerPageSteps = new HeaderPageSteps(driver);
    }
    @Test
    @DisplayName("Тест 1: Выбор города при входе на сайт незарегистрированным пользователем")
    @Description("Проверка отображения выбранного города в шапке сайта: Северодвинск")
    public void testDisplayCitySeverodvinsk(){
        headerPageSteps.waitButtonCitySeverodvinsk();
        headerPageSteps.clickButtonCitySeverodvinsk();
        headerPageSteps.waitCitySeverodvinsk();
        assertEquals(headerPageSteps.displayCitySeverodvinsk(), true);
    }
    @Test
    @DisplayName("Тест 2: Выбор города при входе на сайт незарегистрированным пользователем")
    @Description("Проверка отображения выбранного города в шапке сайта: Архангельск")
    public void testDisplayCityArchangelsk(){
        headerPageSteps.waitButtonCityArchangelsk();
        headerPageSteps.clickButtonCityArchangelsk();
        headerPageSteps.waitCityArchangelsk();
        assertEquals(headerPageSteps.displayCityArchangelsk(), true);
    }
    @Test
    @DisplayName("Тест 3: Выбор города при входе на сайт незарегистрированным пользователем")
    @Description("Проверка отображения выбранного города в шапке сайта: Новодвинск")
    public void testDisplayCityNovodvinsk(){
        headerPageSteps.waitButtonCityNovodvinsk();
        headerPageSteps.clickButtonCityNovodvinsk();
        headerPageSteps.waitCityNovodvinsk();
        assertEquals(headerPageSteps.displayCityNovodvinsk(), true);
    }
    @Test
    @DisplayName("Тест 4: Закрытие окна выбора города")
    @Description("Проверка на закрытие окна выбора города при нажатии на крестик")
    public void testCloseSelectCity(){
        headerPageSteps.waitButtonCitySeverodvinsk();
        headerPageSteps.clickButtonCityCLose();
        headerPageSteps.waitFirstWindowCitiesSelection();
        assertFalse("Окно выбора города должно быть закрыто", headerPageSteps.displayFirstWindowCitiesSelection());
    }
    @After
    public void rearDown(){
        driver.quit();
    }
}
