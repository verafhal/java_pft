package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.UserData;

/**
 * Created by Marom on 06/08/2016.
 */
public class UserHelper extends HelperBase {

  public UserHelper(WebDriver wd) {
    super(wd);
  }

  public void fillUserForm(UserData userData) {
    type (By.name("firstname") ,userData.getName());
    type (By.name("lastname"),userData.getLastName());
    type (By.name("home"),userData.getHome());
  }
  public void saveUser()
  {click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  }

