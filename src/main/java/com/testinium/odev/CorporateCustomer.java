package com.testinium.odev;

public class CorporateCustomer extends Customer {

    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CorporateCustomer(String name, String identityNumber, int balanceOfAccount, String companyName) {
        super(name, identityNumber, balanceOfAccount, false);
        this.companyName = companyName;
    }
}
