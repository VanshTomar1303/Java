public class Moverloading {
    // static void telljoke(){
    //     System.out.println("hello");
    // }
    // // static int change(int a){
    // //     a=98;
    // //     return a;
    // // }
    // static int change2(int [] arr){
    //     arr[0]=98;
    //     return arr[0];
    // }
    static void foo(){
        System.out.println("hell0");
    }
    static void foo(int a){
        System.out.println("love you "+a);
    }
    static void foo(int a,int b){
        System.out.println(a+" "+b+" hi");
    }
    public static void main(String[] args) {
    //    telljoke(); 
    // //    int [] a={12,45,60,66,7};
    // //    int x=45;
    // //    change(x);
    // //    System.out.println(x);
    // int [] a={12,45,60,66,7};
    // change2(a);
    // System.out.println(a[0]);
    
    foo();
    foo(3000);
    foo(67,98);
    
    }
}
