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
    private final WebDriver driver;
    private final WebDriverWait wait;

    // Кнопка Город в шапке сайта
    private final By buttonCity = xpath(".//span[@class='hidden-sm hidden-md']");
    // Кнопка Оплата и доставка в шапке сайта
    private final By buttonPaymentDelivery = xpath(".//a[@title='Оплата и доставка']");
    // Кнопка Контакты и схема проезда в шапке сайта
    private final By buttonContactsDirections = xpath(".//a[@title='Контакты и схема проезда']");
    // Кнопка Бонусная программа в шапке сайта
    private final By buttonBonusProgramm = xpath(".//a[@title='Бонусная программа']");
    // Кнопка выпадающего меню в шапке сайта
    private final By buttonMenuHeader = xpath(".//a[@title='Бонусная программа']");
}
