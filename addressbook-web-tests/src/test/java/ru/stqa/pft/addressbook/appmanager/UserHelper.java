package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.UserData;

/**
 * Created by Marom on 06/08/2016.
 */
public class UserHelper extends HelperBase {

  public UserHelper(WebDriver wd) {
    super(wd);
  }

  public void fillUserForm(UserData userData,boolean creation) {
    type (By.name("firstname") ,userData.getName());
    type (By.name("lastname"),userData.getLastName());
    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(userData.getGroup());
    }else{
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
    type (By.name("home"),userData.getHome());

  }


  public void saveUser()
  {click(By.xpath("//div[@id='content']/form/input[21]"));
  }
  
}

