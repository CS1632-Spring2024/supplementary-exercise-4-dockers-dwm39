// Generated by Selenium IDE
package edu.pitt.cs;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Before
  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void tEST1LINKS() {
    // Test name: TEST-1-LINKS
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ |
    driver.get("http://localhost:8080");
    // 2 | runScript | document.cookie = "1=false";document.cookie =
    // "2=false";document.cookie = "3=false"; |
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | storeAttribute | linkText=Reset@href | resetHref
    {
      WebElement element = driver.findElement(By.linkText("Reset"));
      String attribute = element.getAttribute("href");
      vars.put("resetHref", attribute);
    }
    // 4 | assert | resetHref | /reset
    assertEquals("http://localhost:8080/reset", vars.get("resetHref").toString());
  }

  @Test
  public void tEST2RESET() {
    // Test name: TEST-2-RESET
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ |
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=true";document.cookie =
    // "2=true";document.cookie = "3=true"; |
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    // 3 | click | linkText=Reset |
    driver.findElement(By.linkText("Reset")).click();
    // 4 | assertText | css=.list-group-item:nth-child(1) | ID 1. Jennyanydots
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("ID 1. Jennyanydots"));
    // 5 | assertText | css=.list-group-item:nth-child(2) | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(),
        is("ID 2. Old Deuteronomy"));
    // 6 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
  }

  @Test
  public void tEST3CATALOG() {
    // Test name: TEST-3-CATALOG
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ |
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie =
    // "2=false";document.cookie = "3=false"; |
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Catalog |
    driver.findElement(By.linkText("Catalog")).click();
    // 4 | storeAttribute | xpath=//li[2]/img@src | catalogSrc
    {
      WebElement element = driver.findElement(By.xpath("//li[2]/img"));
      String attribute = element.getAttribute("src");
      vars.put("catalogSrc", attribute);
    }
    // 5 | assert | catalogSrc | /images/cat2.jpg
    assertEquals(vars.get("catalogSrc").toString(), "http://localhost:8080/images/cat2.jpg");
  }

  @Test
  public void tEST9FEED() {
    // Test name: TEST-9-FEED
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ |
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie =
    // "2=false";document.cookie = "3=false"; |
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Feed-A-Cat |
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 4 | click | xpath=//input[@id='catnips'] |
    driver.findElement(By.xpath("//input[@id=\'catnips\']")).click();
    // 5 | type | xpath=//input[@id='catnips'] | 6
    driver.findElement(By.xpath("//input[@id=\'catnips\']")).sendKeys("6");
    // 6 | click | xpath=//button[@onclick='feedSubmit()'] |
    driver.findElement(By.xpath("//button[@onclick=\'feedSubmit()\']")).click();
    // 7 | assertText | id=feedResult | Nom, nom, nom.
    assertThat(driver.findElement(By.id("feedResult")).getText(), is("Nom, nom, nom."));
  }

  @Test
  public void tEST8FEEDACAT() {
    // Test name: TEST-8-FEED-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ |
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie =
    // "2=false";document.cookie = "3=false"; |
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Feed-A-Cat |
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 4 | assertElementPresent | xpath=//button[contains(.,'Feed')] |
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Feed\')]"));
      assert (elements.size() > 0);
    }
  }

  @Test
  public void tEST5RENTACAT() {
    // Test name: TEST-5-RENT-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ |
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie =
    // "2=false";document.cookie = "3=false"; |
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Rent-A-Cat |
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | assertElementPresent | xpath=//button[contains(.,'Rent')] |
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Rent\')]"));
      assert (elements.size() > 0);
    }
    // 5 | assertElementPresent | xpath=//button[contains(.,'Return')] |
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Return\')]"));
      assert (elements.size() > 0);
    }
  }

  @Test
  public void tEST4LISTING() {
    // Test name: TEST-4-LISTING
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ |
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie =
    // "2=false";document.cookie = "3=false"; |
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Catalog |
    driver.findElement(By.linkText("Catalog")).click();
    // 4 | assertElementPresent | xpath=//div/ul/li[3] |
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[3]"));
      assert (elements.size() > 0);
    }
    // 5 | assertElementNotPresent | xpath=//div/ul/li[4] |
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[4]"));
      assert (elements.size() == 0);
    }
    // 6 | assertText | xpath=//div/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }

  @Test
  public void tEST6RENT() {
    // Test name: TEST-6-RENT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ |
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie =
    // "2=false";document.cookie = "3=false"; |
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Rent-A-Cat |
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | click | id=rentID |
    driver.findElement(By.id("rentID")).click();
    // 5 | type | id=rentID | 1
    driver.findElement(By.id("rentID")).sendKeys("1");
    // 6 | click | xpath=//button[contains(.,'Rent')] |
    driver.findElement(By.xpath("//button[contains(.,\'Rent\')]")).click();
    // 7 | assertText | css=.list-group-item:nth-child(1) | Rented out
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("Rented out"));
    // 8 | assertText | css=.list-group-item:nth-child(2) | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(),
        is("ID 2. Old Deuteronomy"));
    // 9 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
    // 10 | assertElementPresent | id=rentResult |
    {
      List<WebElement> elements = driver.findElements(By.id("rentResult"));
      assert (elements.size() > 0);
    }
    // 11 | assertText | id=rentResult | Success!
    assertThat(driver.findElement(By.id("rentResult")).getText(), is("Success!"));
  }

  @Test
  public void tEST7RETURN() {
    // Test name: TEST-7-RETURN
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ |
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie =
    // "2=true";document.cookie = "3=false"; |
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=true\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Rent-A-Cat |
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | click | id=returnID |
    driver.findElement(By.id("returnID")).click();
    // 5 | type | id=returnID | 2
    driver.findElement(By.id("returnID")).sendKeys("2");
    // 6 | click | css=.form-group:nth-child(4) .btn |
    driver.findElement(By.cssSelector(".form-group:nth-child(4) .btn")).click();
    // 7 | assertText | css=.list-group-item:nth-child(1) | ID 1. Jennyanydots
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("ID 1. Jennyanydots"));
    // 8 | assertText | css=.list-group-item:nth-child(2) | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(),
        is("ID 2. Old Deuteronomy"));
    // 9 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
    // 10 | assertElementPresent | id=returnResult |
    {
      List<WebElement> elements = driver.findElements(By.id("returnResult"));
      assert (elements.size() > 0);
    }
    // 11 | assertText | id=returnResult | Success!
    assertThat(driver.findElement(By.id("returnResult")).getText(), is("Success!"));
  }
}
