package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
public static void main(String[] args) {
    ChromeOptions opt=new ChromeOptions();
    opt.addArguments("guest");
    ChromeDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://leaftaps.com/opentaps/control/main");
        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("Vimal");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");   
        WebElement industryElement = driver.findElement(By.name("industryEnumId"));
        Select industryDropDown = new Select(industryElement);
        industryDropDown.selectByIndex(3); 
        WebElement ownershshipElement = driver.findElement(By.name("ownershipEnumId"));
        Select ownershipDropDown = new Select(ownershshipElement);
        ownershipDropDown.selectByVisibleText("S-Corporation");
        WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
        Select sourceDropDown = new Select(sourceElement);
        sourceDropDown.selectByValue("LEAD_EMPLOYEE");
        WebElement marketingCampaignElement = driver.findElement(By.id("marketingCampaignId"));
        Select marketingDropDown = new Select(marketingCampaignElement);
        marketingDropDown.selectByIndex(6); 
        WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select stateDropDown = new Select(stateElement);
        stateDropDown.selectByValue("TX");
        driver.findElement(By.className("smallSubmit")).click();
        driver.close();
        
        
}
}
