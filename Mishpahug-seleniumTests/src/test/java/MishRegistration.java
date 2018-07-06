

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MishRegistration extends TestBase{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();



  @Test
  public void testUntitledTestCase() throws Exception {
    openSite();
    initRegistration();
    fillRegistrationForm();
    registrationFirstLevel();
    fillDetails();
    confirmFillingDetails();
  }

  public void openSite() {
    driver.get("https://mish.sheygam.com/#/wellcome");
  }

  public void confirmFillingDetails() {
    driver.findElement(By.xpath("//div[@id='pictureTable']/div[2]/form/div[2]/button[2]/span")).click();
  }

  public void fillDetails() {
    driver.findElement(By.xpath("//div[@id='pictureTable']/div[2]/form/div/div/div/mat-form-field/div/div/div")).click();
    driver.findElement(By.id("inputFirstName")).clear();
    driver.findElement(By.id("inputFirstName")).sendKeys("Alex");
    driver.findElement(By.id("inputLastName")).click();
    driver.findElement(By.id("inputLastName")).clear();
    driver.findElement(By.id("inputLastName")).sendKeys("Lastname");
    driver.findElement(By.id("inputPhoneNumber")).click();
    driver.findElement(By.id("inputPhoneNumber")).clear();
    driver.findElement(By.id("inputPhoneNumber")).sendKeys("00000000");
    driver.findElement(By.xpath("//mat-select[@id='mat-select-0']/div/div[2]")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-0']/span")).click();
    driver.findElement(By.cssSelector("svg.mat-datepicker-toggle-default-icon.ng-star-inserted")).click();
    driver.findElement(By.xpath("//mat-calendar[@id='mat-datepicker-0']/div/div/button/span")).click();
    driver.findElement(By.xpath("//mat-calendar[@id='mat-datepicker-0']/div/div/button[2]")).click();
    driver.findElement(By.xpath("//mat-calendar[@id='mat-datepicker-0']/div[2]/mat-multi-year-view/table/tbody/tr[3]/td[3]/div")).click();
    driver.findElement(By.xpath("//mat-calendar[@id='mat-datepicker-0']/div[2]/mat-year-view/table/tbody/tr[2]/td[2]/div")).click();
    driver.findElement(By.xpath("//mat-calendar[@id='mat-datepicker-0']/div[2]/mat-month-view/table/tbody/tr[2]/td[3]/div")).click();
    driver.findElement(By.xpath("//mat-select[@id='mat-select-1']/div/div[2]/div")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-6']/span")).click();
    driver.findElement(By.xpath("//mat-select[@id='mat-select-2']/div/div[2]")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-10']/span")).click();
    driver.findElement(By.xpath("//body/div/div[4]")).click();
    driver.findElement(By.xpath("//mat-select[@id='mat-select-3']/div/div")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-11']/span")).click();
    driver.findElement(By.xpath("//mat-select[@id='mat-select-4']/div/div[2]")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-16']/mat-pseudo-checkbox")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-14']/mat-pseudo-checkbox")).click();
    driver.findElement(By.xpath("//mat-option[@id='mat-option-13']/mat-pseudo-checkbox")).click();
    driver.findElement(By.xpath("//div[6]")).click();
    driver.findElement(By.id("description")).click();
    driver.findElement(By.id("description")).clear();
    driver.findElement(By.id("description")).sendKeys("Perfect!");
  }

  public void registrationFirstLevel() {
    driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-0']/app-registration/div[2]/div/form/div[3]/div/div[2]/button/span")).click();
  }

  public void fillRegistrationForm() {
    type(By.id("mat-input-0"),"saschka161284+2@gmail.com");
    type(By.id("mat-input-1"),"123456");
    type(By.id("mat-input-2"),"123456");

  }

  public void type(By locator, String text) {
    driver.findElement(locator).clear();
    driver.findElement(By.id("mat-input-0")).sendKeys(text);
    driver.findElement(By.id("mat-input-1")).click();
  }

  private void initRegistration() {
    driver.findElement(By.xpath("//a[2]/span/span")).click();
  }



  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
