package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserCreationTests extends TestBase {

    @Test
    public void UserCreationTests() {

        gotoUserPage();
        fillUserForm();
        saveUser();
    }


}
