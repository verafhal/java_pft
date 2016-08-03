package ru.stqa.pft.addressbook;

public class UserData {
  private final String firstname;
  private final String lastname;
  private final String country;
  private final String numberphone;

  public UserData(String firstname, String lastname, String country, String numberphone) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.country = country;
    this.numberphone = numberphone;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getCountry() {
    return country;
  }

  public String getNumberphone() {
    return numberphone;
  }
}
