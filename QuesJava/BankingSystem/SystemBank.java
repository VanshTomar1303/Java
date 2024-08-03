package BankingSystem;

import java.util.ArrayList;

public class SystemBank {

    ArrayList<Bank> banks=new ArrayList<>();
    public void addDetail(Bank bank){
        banks.add(bank);
    }
    public void display(){
        for(Bank bank:banks){
            bank.display();
        }
    }
    public void widthdrawn(int id,int amt){
        double i;
        for(Bank bank:banks){
           if(bank.getNumber()==id){
            i=bank.getMoney();
            i-=amt;
            System.out.println("Remaining Balance:"+i);
            bank.setMoney(i);
           }
           else System.out.println("Invalid id! Try Again....");
        }
    }
    public void deposit(int id,int amt){
        double i;
        for(Bank bank:banks){
           if(bank.getNumber()==id){
            i=bank.getMoney();
            i+=amt;
            System.out.println("Added Balance:"+i);
            bank.setMoney(i);
           }
           else System.out.println("Invalid id! Try Again....");
        }
    }
    
}
