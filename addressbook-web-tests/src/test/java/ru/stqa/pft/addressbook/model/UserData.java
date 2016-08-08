package ru.stqa.pft.addressbook.model;

/**
 * Created by Marom on 08/08/2016.
 */
public class UserData {
  private final String name;
  private final String familyname ;
  private final String phonenumber;

  public UserData(String name, String familyname, String phonenumber) {
    this.name = name;
    this.familyname = familyname;
    this.phonenumber = phonenumber;

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
}

