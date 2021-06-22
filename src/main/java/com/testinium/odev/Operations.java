package com.testinium.odev;

public class Operations {

    public static int withdraw(Customer customer, int amount) {

        if (amount > customer.getBalanceOfAccount()) {
                System.out.println("Yetersiz Bakiye!");
        }
       else{
            customer.setBalanceOfAccount(customer.getBalanceOfAccount() - amount);
        }
       return customer.getBalanceOfAccount();
    }

    public static int deposit(Customer customer, int amount) {


        if (amount < 0) {
            System.out.println("Para girişi hatalı. Yeniden deneyiniz.");
        }else
        {
            customer.setBalanceOfAccount(customer.getBalanceOfAccount() + amount);
        }
        return customer.getBalanceOfAccount();
    }
}