public class SelectionSort {
    public static void main(String[] args) {
        int[] array={12,0,45,6,5,4,32,10};

        selectionSort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {
        for(int i=0;i<array.length-1;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }
    }

}
