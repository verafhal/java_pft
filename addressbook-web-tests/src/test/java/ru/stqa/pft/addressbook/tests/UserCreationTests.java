package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class UserCreationTests extends TestBase {

    @Test
    public void UserCreationTests() {

        app.gotoUserPage();
        app.fillUserForm();
        app.saveUser();
    }


}
