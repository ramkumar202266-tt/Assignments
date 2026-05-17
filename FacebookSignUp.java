package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {
public static void main(String[] args) {
ChromeOptions opt=new ChromeOptions();
opt.addArguments("guest");
ChromeDriver driver = new ChromeDriver(opt);
driver.manage().window().maximize();
driver.get("https://en-gb.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
driver.findElement(By.id("_R_1cl2p4jikacppb6amH1_")).sendKeys("Vimal");
driver.findElement(By.id("_R_1kl2p4jikacppb6amH1_")).sendKeys("Raj");
driver.findElement(By.id("_R_6ad8p4jikacppb6amH1_")).sendKeys("Raj58683587569@gmail.com");
driver.findElement(By.id("_R_clap4jikacppb6amH1_")).sendKeys("Raj2026");
driver.findElement(By.id("_r_3_")).click();
driver.findElement(By.xpath("//div[text()='15']")).click();
driver.findElement(By.id("_r_9_")).click();
driver.findElement(By.xpath("//div[text()='May']")).click();
driver.findElement(By.id("_r_f_")).click();
driver.findElement(By.xpath("//div[text()='2002']")).click(); 
driver.findElement(By.id("_R_mad6p4jikacppb6amH2_")).click();
driver.findElement(By.xpath("//div[text()='Male']")).click(); 
driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).click();
}
}
