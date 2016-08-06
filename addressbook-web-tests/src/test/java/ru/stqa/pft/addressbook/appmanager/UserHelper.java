package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Marom on 06/08/2016.
 */
public class UserHelper {
  private FirefoxDriver wd;

  public UserHelper(FirefoxDriver wd) {
    this.wd = wd;
  }
  public void fillUserForm() {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys("vera");
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys("fhal");
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys("055555555");
  }
  public void saveUser()
  {wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  }

