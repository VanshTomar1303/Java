import java.util.*;

public class BubbleSortMethod {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       
       //set the size of array
       System.out.println("Enter the size of array:");
       int size=scan.nextInt(); 
       int[] array=new int[size];
       //taking input from user
       System.out.println("Enter "+ size+" element in the array");
       for(int i=0;i<size;i++){
        array[i]=scan.nextInt();
       }
       bubbleSort(array,array.length);

       //output
       for(int i=0;i<size;i++){
        System.out.println(array[i]);
       }

       scan.close();
    }
    private static void bubbleSort(int[] array,int size){
        for(int i=0;i<size;i++){
                for(int j=0;j<size-i-1;j++){
                    //descending
                    // if(array[j]<array[j+1]){
                    //     int temp=array[j];
                    //     array[j]=array[j+1];
                    //     array[j+1]=temp;
                    // }
                    //ascending
                    if(array[j]>array[j+1]){
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
               }
    }
}
