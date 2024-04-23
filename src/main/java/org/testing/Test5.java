// о нас бар
package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://cafe-matreshka.ru/");
        WebElement corzina =
                driver.findElements(By.xpath("/html/body/div[6]/div/div[2]/div/span[2]")).get(0);
        corzina.click();

        WebElement aboutUs =
                driver.findElements(By.xpath("/html/body/header/div[1]/div/div[1]/div/ul/li[2]/a")).get(0);
        aboutUs.click();

        WebElement bar =
                driver.findElements(By.xpath("/html/body/main/div/section/article[1]/div/div[3]/div/div[1]/a[2]")).get(0);
        bar.click();

    }
}