package PageObject;

import PageObject.HeaderPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderPageSteps {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final HeaderPage headerPage;

    public HeaderPageSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.headerPage = new HeaderPage(driver); // Инициализация локаторов
    }
    @Step("Клик по копке выбора города Северодвиснк")
    public void clickButtonCitySeverodvinsk(){
        driver.findElement(headerPage.buttonCitySeverodvinsk).click();
    }
    @Step("Клик по копке выбора города Архангельск")
    public void clickButtonCityArchangelsk(){
        driver.findElement(headerPage.buttonCityArchangelsk).click();
    }
    @Step("Клик по копке выбора города Новодвинск")
    public void clickButtonCityNovodvinsk(){
        driver.findElement(headerPage.buttonCityNovodvinsk).click();
    }
    @Step("Клик по копке закрытия окна выбора города")
    public void clickButtonCityCLose(){
        driver.findElement(headerPage.buttonCityCLose).click();
    }

    // Отображение
    @Step("Отображение всплывающего окна выбора города")
    public boolean displayFirstWindowCitiesSelection() {
        // Проверяем, есть ли элемент на странице
        //Метод возвращает true, если элемент существует, и false, если его нет
        return !driver.findElements(headerPage.firstWindowCitiesSelection).isEmpty();
    }
    @Step("Отображение выбранного города Северодвинск")
    public boolean displayCitySeverodvinsk(){
        return driver.findElement(headerPage.cityLocationSeverodvinsk).isDisplayed();
    }
    @Step("Отображение выбранного города Архангельск")
    public boolean displayCityArchangelsk(){
        return driver.findElement(headerPage.cityLocationArchangelsk).isDisplayed();
    }
    @Step("Отображение выбранного города Новодвинск")
    public boolean displayCityNovodvinsk(){
        return driver.findElement(headerPage.cityLocationNovodvinsk).isDisplayed();
    }

    //Ожидания
    @Step("Ожидание, что окно выбора города станет видимым")
    public void waitFirstWindowCitiesSelection() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerPage.firstWindowCitiesSelection));
    }
    @Step("Ожидание, что кнопка выбора города Северодвинск станет видимой")
    public void waitButtonCitySeverodvinsk() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerPage.buttonCitySeverodvinsk));
    }
    @Step("Ожидание, что кнопка выбора города Архангельск станет видимой")
    public void waitButtonCityArchangelsk() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerPage.buttonCityArchangelsk));
    }
    @Step("Ожидание, что кнопка выбора города Новодвинск станет видимой")
    public void waitButtonCityNovodvinsk() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerPage.buttonCityNovodvinsk));
    }

    @Step("Ожидание, что выбранный город Северодвинск станет видимым")
    public void waitCitySeverodvinsk() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerPage.cityLocationSeverodvinsk));
    }
    @Step("Ожидание, что выбранный город Архангельск станет видимым")
    public void waitCityArchangelsk() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerPage.cityLocationArchangelsk));
    }
    @Step("Ожидание, что выбранный город Новодвинск станет видимым")
    public void waitCityNovodvinsk() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerPage.cityLocationNovodvinsk));
    }
}
