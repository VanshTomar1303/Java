
class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
}
class Square{
    int side,area,perimeter;
    public void getSide(int s) {
       System.out.println("All side of square is "+s);
    }
   public int getArea(int s) {
    area=s*s;
       return area;
   }
   public int getPerimeter(int s){
    perimeter=4*s;
    return perimeter;
   }

}


public class PracticeSheet {
    public static void main(String[] args) {
        //problem 1
        Employee s=new Employee();
        s.salary=2000;
        s.name="Vansh Tomar";
        System.out.println(s.getsalary());
        System.out.println(s.getname());
        //problem 2
        Square sq = new Square();
        
       sq.getSide(4);
       System.out.println("Area of square ="+sq.getArea(4));
       System.out.println("Perimeter of square ="+sq.getArea(4));
    }
}
