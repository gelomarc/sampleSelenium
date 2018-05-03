package entities;

import static utils.Utils.*;

public class Address {
    private String firstName;
    private String lastName;
    private String company;
    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String additionalInfo;
    private String homePhone;
    private String mobilePhone;
    private String addressAlias;

    public Address(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = "company " + generateRandomLetters(10);
        this.addressLineOne = "Address Line 1 " + generateRandomLetters(10);
        this.addressLineTwo = "Address Line 2 " + generateRandomLetters(10);
        this.city = "city " + generateRandomLetters(10);
        this.state = "Iowa";
        this.country = "United States";
        this.postalCode = generateRandomNumber(5);
        this.additionalInfo = "additional Info" + generateRandomString(40);
        this.homePhone = generateRandomNumber(9);
        this.mobilePhone = generateRandomNumber(9);
        this.addressAlias = generateRandomString(10);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddressAlias() {
        return addressAlias;
    }

    public void setAddressAlias(String addressAlias) {
        this.addressAlias = addressAlias;
    }
}
