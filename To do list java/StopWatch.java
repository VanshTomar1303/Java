import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter time in second:");
        int sec=scan.nextInt();
        System.out.println("************************");
        for(int i=1;i<=sec;i++){
            System.out.format("%02d\n",i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scan.close();
    }
}
