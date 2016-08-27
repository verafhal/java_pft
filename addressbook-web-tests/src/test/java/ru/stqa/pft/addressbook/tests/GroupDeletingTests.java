package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletingTests extends TestBase {
  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if ((app.group().list(id).size()==0)) {
      app.group().create( new GroupData().withName("title1"));
    }
  }

    @Test
    public void testGroupDeleting() {
      List<GroupData> before = app.group().list(id);
      int index=before.size() - 1;
      app.group().delete(index);
      List<GroupData> after = app.group().list(id);
      Assert.assertEquals(after.size(), before.size() - 1);


      before.remove(index);
      Assert.assertEquals(before,after);
    }



}

