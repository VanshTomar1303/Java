package BankingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        boolean start=true;
        SystemBank system=new SystemBank();

        while(start){
            //making a menu
            System.out.println("Enter your choice:");
            System.out.println("Press 1 Add Bank Holder");
            System.out.println("Press 2 Widthdrawn Money");
            System.out.println("Press 3 Deposit Money");
            System.out.println("Press 4 Display all ac holder");
            System.out.println("Press 5 Exit the program");
            int ch = scan.nextInt();

            switch(ch){
                case 1:
                    System.out.println("Enter A/C Number:");
                    int n=scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter Name:");
                    String s=scan.nextLine();
                    System.out.println("Enter Money:");
                    double m=scan.nextDouble();

                    system.addDetail(new Bank(n, s, m));
                    break;
                case 2:
                    System.out.println("Enter account number:");
                    n=scan.nextInt();
                    System.out.println("Enter money to widthdraw:");
                    int amt=scan.nextInt();
                    system.widthdrawn(n, amt);
                    break;
                case 3:
                    System.out.println("Enter account number:");
                    n=scan.nextInt();
                    System.out.println("Enter money to deposit:");
                    amt=scan.nextInt();
                    system.deposit(n, amt);
                    break;
                case 4:
                    system.display();
                    break;
                case 5:
                    start=false;
                    break;
                default:
		    System.out.println("Invalid Choice!");
            }
        }
        scan.close();
    }
    
}