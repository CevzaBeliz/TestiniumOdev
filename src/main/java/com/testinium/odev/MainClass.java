package com.testinium.odev;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Customer> customers = new HashMap<>();
        customers.put("1", new CorporateCustomer("Ahmet Şaşmaz", "12121212121", 100, "Şaşmaz Holding"));
        customers.put("2", new CorporateCustomer("Necati Güleç", "12121212122", 200, "Güleç Holding"));
        customers.put("3", new RetailCustomer("Bahar Yılmaz", "12121212123", 300, "Kadıköy/ İstanbul"));
        customers.put("4", new RetailCustomer("Canan Şenocak", "12121212124", 250, "Beşiktaş/ İstanbul"));
        customers.put("5", new CorporateCustomer("Yağmur Kara", "12121212125", 350, "Kara Holding"));

        System.out.println("Müşteri Numarasını Giriniz: ");
        String customerNo = scanner.nextLine();

        while (true) {
            if (customers.get(customerNo) == null) {
                System.out.println("Girdiğiniz müşteri numarası geçersizdir");
                break;
            } else {
                Customer customerInfo= customers.get(customerNo);
                if(customerInfo.isRetail()) {
                    System.out.println("Adres: " + ((RetailCustomer) customerInfo).getAddress());
                }else {
                    System.out.println("Şirket Adı: " + ((CorporateCustomer) customerInfo).getCompanyName());
                }
                    System.out.println("İsim: " + customerInfo.getName() );
                System.out.println("Tc No: " + customerInfo.getIdentityNumber() );
                System.out.println("Bakiye: " + customerInfo.getBalanceOfAccount() );

                System.out.println("*********************************");
                String operations = "1.Para Yatırma\n"
                        + "2.Para Çekme\n"
                        + "3. Çıkış";
                System.out.println(operations);
                System.out.println("*********************************");
                System.out.println("İşlem Seçiniz");
                String operation = scanner.nextLine();
                if(operation.equals("3")) {
                    System.out.println("Çıkış yapılıyor");
                    break;
                }else if ((operation.equals("1"))) {
                    System.out.println("Yatırmak istediğiniz miktar : ");
                    int amount = scanner.nextInt();
                    customers.get(customerNo).setBalanceOfAccount(Operations.deposit(customers.get(customerNo), amount));


                }else if ((operation.equals("2"))) {
                    System.out.println("Çekmek istediğiniz miktar : ");
                    int amount = scanner.nextInt();
                    customers.get(customerNo).setBalanceOfAccount(Operations.withdraw(customers.get(customerNo), amount));

                }else {
                    System.out.println("Geçersiz İşlem");
                }
            }
        }
    }
}

