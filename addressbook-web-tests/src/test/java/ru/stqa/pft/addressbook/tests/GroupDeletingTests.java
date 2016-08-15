package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletingTests extends TestBase {

    @Test
    public void testGroupDeleting() {
      app.getNavigationHelper().gotoGroupPage();
      if(! app.getGroupHelper().isThereAGroup()){
        app.getGroupHelper().createGroup(new GroupData("title1",null ,null));
      }
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().deleteGroup();
      app.getGroupHelper().returntoGroupPage();


    }

}
