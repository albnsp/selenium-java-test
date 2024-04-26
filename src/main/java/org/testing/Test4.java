package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Web page testing class.
 * @version 1.0.4
 * @autor albnsp
 */

public class Test4 {
    /**
     * The method opens the "promotions and offers" page and fills in the dialog box in the "let's help install the table" block element
     * @throws  InterruptedException
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://cafe-matreshka.ru/");
        WebElement corzina =
                driver.findElements(By.xpath("/html/body/div[6]/div/div[2]/div/span[2]")).get(0);
        corzina.click();

        WebElement stock =
                driver.findElements(By.xpath("/html/body/header/div[1]/div/div[1]/div/ul/li[5]/a")).get(0);
        stock.click();

        WebElement helpSet =
                driver.findElements(By.xpath("/html/body/main/div/section/article[1]/div[2]/div[2]/a")).get(0);
        helpSet.click();

        WebElement makeAnOrder =
                driver.findElements(By.xpath("/html/body/section/article/div/div[2]/a")).get(0);
        makeAnOrder.click();

        WebElement searchField1 =
                driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/form/p[2]/span/input")).get(0);
        searchField1.click();
        searchField1.sendKeys("Альбина");

        WebElement searchField2 =
                driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/form/p[4]/span/input")).get(0);
        searchField2.click();
        searchField2.sendKeys("89271112233");

        WebElement searchField3 =
                driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/form/p[6]/span/select/option[2]")).get(0);
        searchField3.click();

        WebElement send =
                driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/form/p[7]/input")).get(0);
        send.click();


    }
}
