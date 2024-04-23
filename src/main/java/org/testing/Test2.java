package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://cafe-matreshka.ru/");
        WebElement corzina =
                driver.findElements(By.xpath("/html/body/div[6]/div/div[2]/div/span[2]")).get(0);
        corzina.click();

        WebElement soup =
                driver.findElements(By.xpath("/html/body/main/div/div[8]/div[2]/div[4]/div/a")).get(0);
        soup.click();
        soup.click();

        driver.get("https://cafe-matreshka.ru/");

        WebElement zepechenP =
                driver.findElements(By.xpath("/html/body/main/div/div[12]/div[1]/div[4]/div/a[1]")).get(0);
        zepechenP.click();

        driver.get("https://cafe-matreshka.ru/");

        WebElement sous =
                driver.findElements(By.xpath("/html/body/main/div/div[26]/div[1]/div[4]/div/a[1]")).get(0);
        sous.click();
        sous.click();

        driver.get("https://cafe-matreshka.ru/cart/");

        WebElement searchField =
                driver.findElement(By.id("coupon_code"));

        searchField.sendKeys("HIPE_TOP_3");
    }
}