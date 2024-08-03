package StudentManagementSystem;

import java.util.ArrayList;

public class StudentMgtSystem {
    ArrayList<Student> students =new ArrayList<Student>();
    public void addStudent(Student student){
        students.add(student);
    }
    public void displayAllStudent() {
        for (Student i : students) {
            i.display();
            System.out.println();
        }
    }
    public void removeId(String rollNumber){
        for(int i=0;i< students.size();i++){
            if(students.get(i).getRoll().equals(rollNumber)){
                students.remove(i);
                return;
            }
        }
        System.out.println("Student not found on this "+rollNumber);
    }
    public void searchId(String rollNumber){
//        for(int i=0;i< students.size();i++){
//            if(students.get(i).getRoll().equals(rollNumber)){
//                System.out.println("Roll Number:"+students.get(i).getRoll());
//                System.out.println("Name:"+students.get(i).getName());
//                System.out.println("Course:"+students.get(i).getCourse());
//                System.out.println("Marks:"+students.get(i).getMarks());
//            return;
//            }
//        }
        for (Student i : students) {
            if(i.getRoll().equals(rollNumber)) {
                i.display();
                System.out.println();
                return;
            }
        }
        System.out.println("Student not found on this "+rollNumber);
    }
}
