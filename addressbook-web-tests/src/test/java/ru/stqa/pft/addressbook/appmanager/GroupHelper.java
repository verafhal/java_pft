package ru.stqa.pft.addressbook.appmanager;

import com.gargoylesoftware.htmlunit.javascript.host.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Marom on 05/08/2016.
 */
public class GroupHelper extends HelperBase {

  private Integer integer;

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void returntoGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
      click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }
   public void initGroupModification() {
    click(By.name("edit"));
   }
  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteGroup() {
    click(By.name("delete"));
  }

  public void selectGroup(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
    click(By.name("selected[]"));
  }


  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void create(GroupData title1) {
    initGroupCreation();
    fillGroupForm(title1);
    submitGroupCreation();
    returntoGroupPage();
  }
  public void modify(int index, GroupData group) {
    selectGroup(index);
    initGroupModification();
    fillGroupForm(group);
    submitGroupModification();
    returntoGroupPage();
    }
  public void delete(int index) {
    selectGroup(index);
    deleteGroup();
    returntoGroupPage();
  }

  public boolean isThereAGroup () {

    return isElementPresent(By.name("selected[]"));
    }
  public int getGroupCount() {

    return wd.findElements(By.name("selected[]")).size();
  }
  public List<GroupData> list(int id) {
    List<GroupData> groups = new ArrayList<GroupData>();
    List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
    for(WebElement element :elements){
      String name = element.getText();
      int id = integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      groups.add( new GroupData().withId(id).withName(name));
    }
    return groups;
}
  public Set<GroupData> all() {
     Set<GroupData> groups = new HashSet<GroupData>();
    List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
    for(WebElement element :elements){
      String name = element.getText();
      int Id = integer.parseInt(element.findElement(by.tagName("input")).getAttribute("value"));
      groups.add( new GroupData().withId(id).withName(name));
    }
    return groups;
  }
}



  

