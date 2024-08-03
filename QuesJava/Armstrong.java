import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scan.nextInt();
        int rem,res=0,org;
        org=num;
        while(num!=0) {
            rem=num%10;
            res=res+(rem*rem*rem);
            num=num/10;
        }
        System.out.println(res);
        if(org==res){
            System.out.println(org+" is armstrong");
        }
        else if(org!=res){
            System.out.println(org+" is not armstrong");
        }
        else{
            System.out.println("Freak enter a number");
        }
        scan.close();
    }
}
