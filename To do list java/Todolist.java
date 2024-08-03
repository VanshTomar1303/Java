import java.util.ArrayList;
import java.util.Scanner;

public class Todolist {
    public static void main(String[] args) {
    ArrayList<String> ToDoList=new ArrayList<>();
    Scanner scan=new  Scanner(System.in);
    boolean list=true;
    while(list){
        System.out.println("******TO-DO-LIST******");
        System.out.println("1.ADD TASK");
        System.out.println("2.DELETE TASK");
        System.out.println("3.DISPLAY TASK");
        System.out.println("4.Exit");
        int choice=scan.nextInt();
        scan.nextLine();
        switch(choice){
            case 1:
                System.out.println("Enter Task:");
                String task=scan.nextLine();
                ToDoList.add(task);
                System.out.println("Task is added. Successfully");
                break;

            case 2:
                System.out.println("Enter index to delete:");
                int index=scan.nextInt();
                scan.nextLine();
                ToDoList.remove(index-1);
                System.out.println("Task "+index+" is deleted. Successfully");
                break;

            case 3:
                if(!ToDoList.isEmpty()){
                    for(int i=0;i<ToDoList.size();i++){
                        System.out.println( "TASK "+(i+1) +". "+ToDoList.get(i));
                    }
                }
                else{
                    System.out.println("TO DO LIST IS EMPTY");
                }
                break;
            
            case 4:
                System.out.println("Thanks visiting!");
                list=false;
                break;

            default:
                System.out.println("INVALID CHOICE!");
        scan.close();
        }
        System.out.println("******TO-DO-LIST******");
        }
}
    
}