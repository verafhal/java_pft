package ru.stqa.pft.addressbook.model;

/**
 * Created by Marom on 08/08/2016.
 */
public class UserData {
  private final String name;
  private final String familyname ;
  private final String phonenumber;
  private String group;

  public UserData(String name, String familyname, String phonenumber,String group) {
    this.name = name;
    this.familyname = familyname;
    this.phonenumber = phonenumber;

    this.group = group;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return familyname;
  }

  public String getHome() {
    return phonenumber;
  }

  public String getGroup() {
    return group;
  }
}

