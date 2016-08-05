package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marom on 05/08/2016.
 */
public class ApplicationManager {
  FirefoxDriver wd;
  private SessionHelper sessionHelper;
  private  NavigationHelper navigationHelper;
  private  GroupHelper groupHelper;

  public static boolean isAlertPresent(FirefoxDriver wd) {
      try {
          wd.switchTo().alert();
          return true;
      } catch (NoAlertPresentException e) {
          return false;
      }
  }

  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost:8080/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    wd.quit();
  }

  public void saveUser() {
      groupHelper.wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillUserForm() {
      groupHelper.wd.findElement(By.name("firstname")).click();
      groupHelper.wd.findElement(By.name("firstname")).clear();
      groupHelper.wd.findElement(By.name("firstname")).sendKeys("vera");
      groupHelper.wd.findElement(By.name("lastname")).click();
      groupHelper.wd.findElement(By.name("lastname")).clear();
      groupHelper.wd.findElement(By.name("lastname")).sendKeys("fhal");
      groupHelper.wd.findElement(By.name("home")).click();
      groupHelper.wd.findElement(By.name("home")).clear();
      groupHelper.wd.findElement(By.name("home")).sendKeys("055555555");
  }

  public void gotoUserPage() {
      groupHelper.wd.findElement(By.linkText("ההערה")).click();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
