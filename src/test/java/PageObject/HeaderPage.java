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
    private final By cityLocationSeverodvinsk = xpath(".//span[text()='Северодвиснк']");
    // Кнопка город Архангельск в шапке сайта
    private final By cityLocationArchangelsk = xpath(".//span[text()='Архангельск']");
    // Кнопка город Новодвинск в шапке сайта
    private final By cityLocationNovodvinsk = xpath(".//span[text()='Новодвинск']");
    // Кнопка Оплата и доставка в шапке сайта
    private final By buttonPaymentDelivery = xpath(".//a[@title='Оплата и доставка']");
    // Кнопка Контакты и схема проезда в шапке сайта
    private final By buttonContactsDirections = xpath(".//a[@title='Контакты и схема проезда']");
    // Кнопка Бонусная программа в шапке сайта
    private final By buttonBonusProgramm = xpath(".//a[@title='Бонусная программа']");
    // Кнопка выпадающего меню в шапке сайта
    private final By buttonMenuHeader = xpath("//button[contains(@class, 'top-menu__btn') and contains(@class, 'dropdown-toggle')]");
    // Окно выбора города в шапке сайта
    private final By windowCitySelection = xpath(".//div[@class='modal-dialog modal-lg']");
    // Кнопка выбора города Северодвинск
    private final By buttonCitySeverodvinsk = xpath("//a[text()='Северодвинск']");
    // Кнопка выбора города Архангельск
    private final By buttonCityArchangelsk = xpath("//a[text()='Архангельск']");
    // Кнопка выбора города Новодвинск
    private final By buttonCityNovodvinsk = xpath("//a[text()='Новодвинск']");
    @Step("Клик по копке выбора города Северодвиснк")
    public void clickButtonCitySeverodvinsk(){
        driver.findElement(buttonCitySeverodvinsk).click();
    }
    @Step("Клик по копке выбора города Архангельск")
    public void clickButtonCityArchangelsk(){
        driver.findElement(buttonCityArchangelsk).click();
    }
    @Step("Клик по копке выбора города Новодвинск")
    public void clickButtonCityNovodvinsk(){
        driver.findElement(buttonCityNovodvinsk).click();
    }
    @Step("Отображение выбранного города Северодвинск")
    public void displayCitySeverodvinsk(){
        driver.findElement(cityLocationSeverodvinsk).isDisplayed();
    }
    @Step("Отображение выбранного города Архангельск")
    public void displayCityArchangelsk(){
        driver.findElement(cityLocationSeverodvinsk).isDisplayed();
    }
    @Step("Отображение выбранного города Новодвинск")
    public void displayCityNovodvinsk(){
        driver.findElement(cityLocationSeverodvinsk).isDisplayed();
    }

}
