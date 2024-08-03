

public class Pattern{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
       star();
    }
    public static void star(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        int a=1;
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(a++ +"  ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------");
        int c=4;
        for(int i=1;i<=c;i++){
            for(int j=1;j<=c-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                int d=i+j;
                if(d%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------");
       
        
    }
}