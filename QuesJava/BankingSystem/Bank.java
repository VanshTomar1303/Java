package BankingSystem;

public class Bank {
    private int acNo;
    private String name;
    private double money;
    Bank(int acNo,String name,double money){
        this.setNumber(acNo);
        this.setName(name);
        this.setMoney(money);
    }
    public void setNumber(int acNo){
        this.acNo=acNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMoney(double money){
        this.money=money;
    }
    public int getNumber(){
        return acNo;
    }
    public String getName(){
        return name;
    } 
    public double getMoney(){
        return money;
    }
    public void display(){
        System.out.println("--------------------------");
        System.out.println("Account Number:"+acNo);
        System.out.println("Name:"+name);
        System.out.println("Amount:"+money);
        System.out.println("--------------------------");
    }
}
