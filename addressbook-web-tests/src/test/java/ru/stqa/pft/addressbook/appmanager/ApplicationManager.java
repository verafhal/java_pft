package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marom on 05/08/2016.
 */
public class ApplicationManager {
  private final String browser;
  WebDriver wd;
  private UserHelper userHelper;
  private SessionHelper sessionHelper;
  private  NavigationHelper navigationHelper;
  private  GroupHelper groupHelper;

  public ApplicationManager(String browser) {
    this.browser=browser;
  }

  public static boolean isAlertPresent(WebDriver wd) {
      try {
          wd.switchTo().alert();
          return true;
      } catch (NoAlertPresentException e) {
          return false;
      }
  }

  public void init() {
    if(browser.equals(BrowserType.FIREFOX)){
    wd = new FirefoxDriver();
    }else if(browser.equals(BrowserType.CHROME)){
      wd = new ChromeDriver();
    }else if(browser.equals(BrowserType.IE)){
      wd = new InternetExplorerDriver();
    }


    wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    wd.get("http://localhost:8080/addressbook/");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    userHelper =new UserHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    wd.quit();
  }

  public UserHelper getUserHelper() {
    return userHelper;
  }

  public GroupHelper group() {
    return groupHelper;
  }

  public NavigationHelper goTo() {

    return navigationHelper;
  }
}
