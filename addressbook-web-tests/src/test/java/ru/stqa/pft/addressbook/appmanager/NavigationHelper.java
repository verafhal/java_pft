package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Marom on 05/08/2016.
 */
public class NavigationHelper {
  private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
   this.wd = wd;
  }

  public void gotoGroupPage() {
      wd.findElement(By.linkText("קבוצות")).click();
  }
}
