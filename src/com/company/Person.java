package com.company;

public class Person {
    String name;
    Wallet w;

    public Person(String name, Wallet w) {

        this.name = name;
        this.w = w;
    }

    public Wallet getWallet(){
        return w;


    }

    public String getName(){
        return name;

    }

    public void setName(String name) {
        System.out.println("Wallet belongs to "+name);
    }

    //give(Person p, int x){
    //
    // }
    public void give(Person p, int x) {
        Bill b;


        int i;
        for(i = 0; i < w.amountOfBills(); i++){
            if(w.getBill(i).getMoney() == x){

                b = w.getBill(i);
                w.removeBill(b);
                p.getWallet().addBill(x); ;
                break;

            }




        }


    }
}
