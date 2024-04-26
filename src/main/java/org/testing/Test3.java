package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Web page testing class.
 * @version 1.0.3
 * @autor albnsp
 */
public class Test3 {
    /**
     * The method opens the banquet page and fills in the dialog box
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

        WebElement banket =
                driver.findElements(By.xpath("/html/body/header/div[1]/div/div[1]/div/ul/li[6]/a")).get(0);
        banket.click();

        WebElement ubiley =
                driver.findElements(By.xpath("/html/body/main/div/section/article[3]/div[2]/div[2]/a")).get(0);
        ubiley.click();

        WebElement searchField1 =
                driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/div/form/p[2]/span/input")).get(0);
        searchField1.click();
        searchField1.sendKeys("Альбина");

        WebElement searchField2 =
                driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/div/form/p[4]/span/input")).get(0);
        searchField2.click();
        searchField2.sendKeys("89271112233");

        WebElement searchField3 =
                driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/div/form/p[6]/span/select/option[2]")).get(0);
        searchField3.click();

        WebElement send =
                driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/div/form/p[7]/input")).get(0);
        send.click();

    }
}