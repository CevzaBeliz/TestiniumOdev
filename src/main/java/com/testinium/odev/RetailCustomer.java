package com.testinium.odev;

public class RetailCustomer extends Customer {

    public String address;

    public RetailCustomer(String name, String identityNumber, int balanceOfAccount, String address) {
        super(name, identityNumber, balanceOfAccount, true);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
