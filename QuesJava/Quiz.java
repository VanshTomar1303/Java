import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("---------------Quiz Game---------------");
        System.out.println("YOU WANT TO PLAY");
        Scanner scan=new Scanner(System.in);
        String ans=scan.nextLine();
        int score=0;
        if(!ans.equals("yes")){
            System.out.println("DONT WANNA PLAY ! BYE");
        }
        else{
            
                System.out.println("You wanna play ok LET begin!");
                System.out.println("You have 4 question:");

                System.out.println("1. What is the full form of CPU?");
                String ans1=scan.nextLine();
                if(ans1.equals("central processing unit")){
                    score++;
                    System.out.println("CORRECT!");
                }
                else{
                    System.out.println("WRONG!, correct answer-\"central processing unit\"");
                }

                System.out.println("2. What is the full form of ALU?");
                String ans2=scan.nextLine();
                if(ans2.equals("arthmetic logical unit")){
                    score++;
                    System.out.println("CORRECT!");
                }
                else{
                    System.out.println("WRONG!,correct answer-\"arthmetic logical unit\"");
                }

                System.out.println("3. What is the full form of CU?");
                String ans3=scan.nextLine();
                if(ans3.equals("control unit")){
                    score++;
                    System.out.println("CORRECT!");
                }
                else{
                    System.out.println("WRONG!,correct answer-\"control unit\"");
                }

                System.out.println("4. What is the use of ;?");
                String ans4=scan.nextLine();
                if(ans4.equals("termination line of code")){
                    score++;
                    System.out.println("CORRECT!");
                }
                else{
                    System.out.println("WRONG!,correct answer-\"termination line of code\"");
                }

                

            
        }
        System.out.println("Your score is :"+score);
        
        scan.close();
    }
}
