package com.prathamesh.fooddeliveryapp.ModelClasses;

public class AddressModel {
    private boolean isDefault;
    private String UserName;
    private String UserMobileNumber;
    private int UserPinCode;
    private String UserHouse;
    private String userLocality;
    private boolean isHome;

    public boolean isDefault() {
        return isDefault;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserMobileNumber() {
        return UserMobileNumber;
    }

    public int getUserPinCode() {
        return UserPinCode;
    }

    public String getUserHouse() {
        return UserHouse;
    }

    public String getUserLocality() {
        return userLocality;
    }

    public boolean isHome() {
        return isHome;
    }

    public AddressModel(boolean isDefault, String userName, String userMobileNumber, int userPinCode, String userHouse, String userLocality, boolean isHome) {
        this.isDefault = isDefault;
        UserName = userName;
        UserMobileNumber = userMobileNumber;
        UserPinCode = userPinCode;
        UserHouse = userHouse;
        this.userLocality = userLocality;
        this.isHome = isHome;
    }
}
