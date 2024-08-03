import java.util.Scanner;
public class PracticeSet {
    public static void main(String[] args) {
        //Ouestion 1 addition of three number
        int a=50;
        int b=90;
        int c=1000;
        System.out.println(a+b+c);
        //Question 2 cgpa
        float x=90;
        float y=98;
        float z=89;
        float j=99;
        float k=98;
        float cgpa=(x+y+z+j+k)/50;
        System.out.println(cgpa);
        //Question 3
        Scanner n= new Scanner(System.in);

        System.out.println("Enter your name:");
        String str = n.nextLine();
        System.out.println("Hello " + str + " Have a good day");
        //Questiom 4 km conversion
        System.out.println("Enter kms");
        float km=n.nextFloat();
        float mrt=km*1000;
        System.out.println("Kilometer change into meters: "+ mrt +" meter ");
        //Question 5 int or not
        System.out.println("Enter a number");
        System.out.println(n.hasNextInt());
        

        n.close();
    }
}
