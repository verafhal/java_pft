package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class UserCreationTests extends TestBase {

    @Test
    public void testUserCreation() {

        app.getNavigationHelper().gotoUserPage();
        app.getUserHelper().fillUserForm(new UserData("vera", "fhal", "555555","title1"),true);
        app.getUserHelper().saveUser();
    }

}
