package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.By.*;
public class HeaderPage {
    private  WebDriver driver;
    private  WebDriverWait wait;
    public HeaderPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    // Кнопка город Северодвиснк в шапке сайта
    public final By cityLocationSeverodvinsk = xpath(".//span[text()='Северодвинск']");
    // Кнопка город Архангельск в шапке сайта
    public final By cityLocationArchangelsk = xpath(".//span[text()='Архангельск']");
    // Кнопка город Новодвинск в шапке сайта
    public final By cityLocationNovodvinsk = xpath(".//span[text()='Новодвинск']");
    // Кнопка Оплата и доставка в шапке сайта
    public final By buttonPaymentDelivery = xpath(".//a[@title='Оплата и доставка']");
    // Кнопка Контакты и схема проезда в шапке сайта
    public final By buttonContactsDirections = xpath(".//a[@title='Контакты и схема проезда']");
    // Кнопка Бонусная программа в шапке сайта
    public final By buttonBonusProgramm = xpath(".//a[@title='Бонусная программа']");
    // Кнопка выпадающего меню в шапке сайта
    public final By buttonMenuHeader = xpath("//button[contains(@class, 'top-menu__btn') and contains(@class, 'dropdown-toggle')]");
    // Окно выбора города в шапке сайта
    public final By windowCitySelection = xpath(".//div[@class='modal-dialog modal-lg']");
    // Окно выбора города для неавторизированных пользователей при первичном заходе на сайт
    public final By firstWindowCitiesSelection = xpath(".//div[@class='modal-content']");
    // Кнопка выбора города Северодвинск
    public final By buttonCitySeverodvinsk = xpath("//a[text()='Северодвинск']");
    // Кнопка выбора города Архангельск
    public final By buttonCityArchangelsk = xpath("//a[text()='Архангельск']");
    // Кнопка выбора города Новодвинск
    public final By buttonCityNovodvinsk = xpath("//a[text()='Новодвинск']");
    // Кнопка закрытия окна выбора города
    public final By buttonCityCLose = xpath("//button[text()='×']");
    //Кнопка Мне больше 18 лет в окне подтверждения возраста
    public final By buttonMoreEighteen = xpath("//button[text()='Мне больше 18 лет']");
    //Кнопка Мне меньше 18 лет в окне подтверждения возраста
    public final By buttonLessEighteen = xpath("//button[text()='Мне меньше 18 лет']");
    //Кнопка закрытия крестик в окне подтверждения возраста
    public final By buttonCloseAge = xpath("//button[text()='×']");

}
