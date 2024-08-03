import java.util.Scanner;

public class Pelindrom {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scan.nextInt();
        int rem,res=0;
        while(num!=0){
            rem=num%10;
            res=res*10+(rem);
            num=num/10;
        }
        System.out.println(res);
        scan.close();
    }
}
