import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in); 
       System.out.println("Enter element in matrix A");
       int[][] a=new int[3][3];
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
         a[i][j]=scan.nextInt();
        }
       }
       System.out.println("Enter element in matrix B");
       int[][] b=new int[3][3];
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
         b[i][j]=scan.nextInt();
        }
       }
       int k,sum;
       int[][] result=new int[3][3];
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
         sum=0;
         for(k=0;k<3;k++){
            sum+=a[i][k]*b[k][j];
         }
         result[i][j]=sum;
        }
       }
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
         System.out.print(result[i][j]+"\t");
        }
        System.out.println();
       }

       scan.close();
    }
}
