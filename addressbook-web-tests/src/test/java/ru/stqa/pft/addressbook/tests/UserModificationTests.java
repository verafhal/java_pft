package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

/**
 * Created by Marom on 11/08/2016.
 */
public class UserModificationTests extends TestBase {

  @Test

  public void testUserModification() {
    app.goTo().gotoUserPage();
    app.getUserHelper().fillUserForm(new UserData("vera", "fhal", "555555",null),false);
    app.getUserHelper().saveUser();

  }
}