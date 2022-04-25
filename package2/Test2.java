package SecondTermWeek2.package2;
import SecondTermWeek2.package1.Circle;

public class Test2 {
    public Test2() {
        System.out.println("TEST 2 çalıştı");
        Circle circle = new Circle();
        circle.radius=10;
        System.out.println("Radius is "+circle.radius);
        System.out.println("the area is "+circle.calculate_area(circle.radius));
        System.out.println("the perimeter is "+circle.calculate_perimeter(circle.radius));

    }
}
