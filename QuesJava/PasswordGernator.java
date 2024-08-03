import java.util.*;

public class PasswordGernator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of password:");
        int length=s.nextInt();

        Random rand=new Random();
        String lowerCase="abcdefghijklmnopqrsruvwxyz";
        String upperCase=lowerCase.toUpperCase();
        String number="0123456789";
        String symbol="!@#$%^&*()_+=-`~?:";
        String all_char=lowerCase+upperCase+number+symbol;
        StringBuilder password = new StringBuilder();

        for(int i=0;i<=length;i++){
            int randomIndex=rand.nextInt(all_char.length());
            char charIndex=all_char.charAt(randomIndex);
            password.append(charIndex);
        }
        String randomPassword=password.toString();
        System.out.println("Random password : "+randomPassword);
        s.close();
    }
}
