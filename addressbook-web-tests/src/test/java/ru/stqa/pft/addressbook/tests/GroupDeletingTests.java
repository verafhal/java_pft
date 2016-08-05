package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletingTests extends TestBase {

    @Test
    public void testGroupDeleting() {
      app.gotoGroupPage();
      app.selectGroup();
      app.deleteGroup();
      app.returntoGroupPage();


    }

}
