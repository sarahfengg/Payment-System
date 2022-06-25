package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Wallet {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Bill> myWallet = new ArrayList<>();

    public Wallet() {



    }


    public void addBill(int money){
        myWallet.add(new Bill(money));




    }

    public Bill getBill(int i){
        return myWallet.get(i);
    }

//CAST BILL (Bill)
    public int getTotal(){
        int i = 0;
        int total = 0;
        while(i< myWallet.size()){
            Bill b = (Bill)myWallet.get(i);
            total += (b.getMoney());
            i++;

        }
        return total;
    }

    public void removeBill(Bill bill){
        myWallet.remove(bill);

    }

    public int amountOfBills(){
        return myWallet.size();
    }

    public void setMyWallet(ArrayList myWallet) {
        this.myWallet = myWallet;
    }



}
