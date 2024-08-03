public class VarArg {
    static int sum(int ...arr){
        int b=0;
       for(int a:arr){
        b+=a;
       }
       return b;
    }
    public static void main(String[] args) {
       System.out.println(sum(4,5)); 
       System.out.println(sum(4,5,8,9,19,50)); 
    }
}
