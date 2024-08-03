import java.util.Scanner;

public class RecuRsion {
    
    static int fact(int n){
        
        if(n==0||n==1){
        return 1;
        }
        else{
            return n*fact(n-1);
        }
       
    }

    static int factorial(int n){
        int b=1;
        if(n==0||n==1){
        return 1;
        }
        else{
          for(int i=1;i<=n;i++){
             b*=i;
          } 
          return b;
        }
       
    }
    public static void main(String[] args) {
      int a;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number:");
      a=s.nextInt();
       System.out.println(fact(a)); 
       System.out.println(factorial(a));
       s.close();
    }
}
