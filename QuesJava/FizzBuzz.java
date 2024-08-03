public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%5==0&&i%3==0){
                System.out.println("FizzBuzz for:"+i);
            }
            if(i%3==0){
                System.out.println("Fizz for:"+i);
            }
            else if(i%5==0){
                System.out.println("Buzz for:"+i);
            }
           
            
        }
    }
}
