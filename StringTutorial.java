//import java.util.Scanner;
public class StringTutorial {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // String input =scanner.nextLine();
        // System.out.println(input);
        // scanner.close();
        // String name=new String("vansh");
        String name = "Vansh";
        System.out.println(name);

        System.out.println(name.length());

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        String name1 = "     vansh      ";

        System.out.println(name1.trim());

        System.out.println(name.substring(3));

        System.out.println(name.substring(0, 3));

        System.out.println(name.replace('a', 's'));

        System.out.println(name.startsWith("Va"));

        System.out.println(name.endsWith("sh"));

        System.out.println(name.charAt(4));

        System.out.println(name.indexOf("s"));

        System.out.println(name.indexOf("s", 5));

        System.out.println(name1.lastIndexOf(3));

        System.out.println(name.lastIndexOf("s",5));

        System.out.println(name.equals("Vansh"));

        System.out.println(name.equalsIgnoreCase("vaNsh"));
       
    }
}