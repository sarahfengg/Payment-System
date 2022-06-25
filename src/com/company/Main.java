package com.company;

import java.util.Scanner;


public class Main {
    static Scanner scanner;


    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        Wallet wallet2 = new Wallet();

        System.out.println(myWallet.getTotal());
        System.out.println(wallet2.getTotal());

        scanner = new Scanner(System.in);
        Person p = new Person(scanner.next(), myWallet);
        p.setName(p.getName());
        Person pp = new Person(scanner.next(), wallet2);
        pp.setName(pp.getName());
        myWallet.addBill(20);
        myWallet.addBill(20);
        myWallet.addBill(20);
        myWallet.addBill(20);
        wallet2.addBill(40);
        p.give(pp,20);



        System.out.println(myWallet.getTotal());
        System.out.println(wallet2.getTotal());











    }

}