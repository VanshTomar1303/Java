package StudentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentMgtSystem system = new StudentMgtSystem();
        Scanner scan = new Scanner(System.in);

        boolean start = true;

        while (start) {

            System.out.println("Press 1 Add Student");
            System.out.println("Press 2 Remove Student");
            System.out.println("Press 3 Search Student");
            System.out.println("Press 4 Display all Student");
            System.out.println("Press 5 Exit SMS");
            int ch = scan.nextInt();
            scan.nextLine();

            switch (ch) {
                case 1:
                    System.out.println("Enter Student Roll No.:");
                    String roll = scan.nextLine();
                    System.out.println("Enter Student Name:");
                    String name = scan.nextLine();
                    System.out.println("Enter Student Course:");
                    String course = scan.nextLine();
                    System.out.println("Enter Student Marks:");
                    double marks = scan.nextDouble();
                    scan.nextLine();

                    system.addStudent(new Student(roll, name, course, marks));
                    break;

                case 2:
                    System.out.println("Enter Student Roll No. To delete:");
                    roll = scan.nextLine();
                    system.removeId(roll);
                    break;

                case 3:
                    System.out.println("Enter Student Roll No. To search:");
                    roll = scan.nextLine();
                    system.searchId(roll);
                    break;

                case 4:
                    system.displayAllStudent();
                    break;

                case 5:
                    start = false;
                    System.out.println("Thanku for visiting");
                    break;

                default:
                    System.out.println("Invalid option! Try again......");
            }
        }
        scan.close();
    }
}
