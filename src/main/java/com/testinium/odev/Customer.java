package com.testinium.odev;

public class Customer {

    private String name;
    private String identityNumber;
    private int balanceOfAccount;
    private boolean isRetail;

    public boolean isRetail() {
        return isRetail;
    }

    public void setRetail(boolean retail) {
        isRetail = retail;
    }

    public Customer(String name, String identityNumber, int balanceOfAccount, boolean isRetail) {
        this.name = name;
        this.identityNumber = identityNumber;
        this.balanceOfAccount = balanceOfAccount;
        this.isRetail = isRetail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public int getBalanceOfAccount() {
        return balanceOfAccount;
    }

    public void setBalanceOfAccount(int balanceOfAccount) {
        this.balanceOfAccount = balanceOfAccount;
    }

}


