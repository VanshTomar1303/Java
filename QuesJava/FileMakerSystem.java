import java.io.*;
	import java.util.*;

	public class FileMakerSystem {

		public static void main(String[] args) {
			try {
			Scanner scan=new Scanner(System.in);
			
            System.out.println("Enter your choice:");
            System.out.println("1.Make a file and write in it");
            System.out.println("2.Read file");
            System.out.println("3.Delete file");
            System.out.println("4.Exit");
            int ch=scan.nextInt();
            scan.nextLine();

            switch(ch){
                case 1:
                    System.out.println("Enter file name:-");
                    String fileName = scan.nextLine();
                    System.out.println("Enter line in code:-");
                    String text = scan.nextLine();
                    FileWriter writer = new FileWriter(fileName+".txt");
                    writer.write(text);
			        writer.close();
                    break;
                case 2:
                    System.out.println("Enter file name:-");
                    String readFile = scan.nextLine();
                    FileReader reader=new FileReader(readFile+".txt");
                    int data=reader.read();
                    while(data!=-1){
                        System.out.print((char)data);
                        data=reader.read();
                    }
                    reader.close();
                    break;
                case 3:
                    System.out.println("Enter a file name:-");
                    String delFile=scan.nextLine();
                    File file=new File(delFile+".txt");
                    file.delete();
                    break;
                case 4:
                    System.out.println("Thanku to visiting!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
			scan.close();
        
			}
			catch(Exception e) {
				System.out.println("404 ERROR");
			}
		}

	}
