package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Web page testing class.
 * @version 1.0.1
 * @autor albnsp
 */
public class Test1 {

    /**
     * The method opens the page and adds the assortment to the cart
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://cafe-matreshka.ru/");
        WebElement corzina =
                driver.findElements(By.xpath("/html/body/div[6]/div/div[2]/div/span[2]")).get(0);
        corzina.click();

        WebElement zarkoe =
                driver.findElements(By.xpath("/html/body/main/div/div[16]/div[4]/div[4]/div/a[1]")).get(0);
        zarkoe.click();
        zarkoe.click();

        driver.get("https://cafe-matreshka.ru/");

        WebElement  beefStroganoff =
                driver.findElements(By.xpath("/html/body/main/div/div[16]/div[1]/div[4]/div/a[1]")).get(0);
        beefStroganoff.click();

        driver.get("https://cafe-matreshka.ru/");

        WebElement  free  =
                driver.findElements(By.xpath("/html/body/main/div/div[18]/div[1]/div[4]/div/a[1]")).get(0);
        free.click();

        driver.get("https://cafe-matreshka.ru/cart/");

        WebElement searchField =
                driver.findElement(By.id("coupon_code"));

        searchField.sendKeys("TOP");
    }
}
