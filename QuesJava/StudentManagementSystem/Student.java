package StudentManagementSystem;

public class Student {
    private String rollNumber;
    private String name;
    private String course;
    private double marks;
    Student(String rollNumber,String name,String course,double marks){
        this.setRoll(rollNumber);
        this.setName(name);
        this.setCourse(course);
        this.setMarks(marks);
    }

    //setter methods
    public void setRoll(String rollNumber) {
        this.rollNumber=rollNumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public void setMarks(double marks){
        this.marks=marks;
    }
    //getter methods
    public String getRoll() {
        return rollNumber;
    }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    public double getMarks(){
        return marks;
    }
    public void display(){
        System.out.println("Roll Number:"+rollNumber);
        System.out.println("Name:"+name);
        System.out.println("Course:"+course);
        System.out.println("Marks:"+marks);
    }
}
