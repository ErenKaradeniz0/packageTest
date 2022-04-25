package SecondTermWeek2.package1;

public class Test1 {
    public Test1(){
        System.out.println("TEST 1 çalıştı");
        SecondTermWeek2.package1.Circle circle=new SecondTermWeek2.package1.Circle();
        circle.radius=5;
        System.out.println("Radius is "+circle.radius);
        System.out.println("the area is "+circle.calculate_area(circle.radius));
        System.out.println("the perimeter is "+circle.calculate_perimeter(circle.radius));
    }
}
