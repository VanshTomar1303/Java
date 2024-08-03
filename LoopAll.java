
public class LoopAll {
    public static void main(String[] args) {

        // int a=1;
        // while (a<=10) {
        // System.out.println(a);
        // a++;
        // }

        // int b=1;
        // do{
        // System.out.println(b);
        // b++;
        // }while(b<=20);

        for (int i = 1; i <= 10; i++) {

            // if(i==5){
            // System.out.println("exit the loop");
            // break;
            // }
            if (i == 5) {
                System.out.println("skip 5th statement");
                continue;
            }
            System.out.println(i);
            System.out.println("hello");
        }
    }
}
