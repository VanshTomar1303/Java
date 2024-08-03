import java.util.*;
public class SearchArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[7];
        System.out.println("Enter 7 element in the array");
        for(int i=0;i<array.length;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Searh a element");
        int n=scan.nextInt();
        for(int i=0;i<array.length;i++){
            if(n==array[i]){
                System.out.println("Element found at index a[ "+i+" ]");
                System.exit(0);
            }
        }
        System.out.println("Element not found");
        scan.close();
    }
}
