package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Marom on 06/08/2016.
 */
public class UserHelper extends HelperBase {


  public UserHelper(FirefoxDriver wd) {
    super(wd);
  }
  public void fillUserForm(String name, String familyname, String phonenumber) {

    type (By.name("firstname"),name);
    type (By.name("lastname"),familyname);
    type (By.name("home"),phonenumber);
  }
  public void saveUser()
  {click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  }

