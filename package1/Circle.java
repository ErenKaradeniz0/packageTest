package SecondTermWeek2.package1;

public class Circle {
    public double radius;
    final double pi = 3.14;

    public double calculate_area(double radius) {
        return radius * radius * pi;
    }

    public double calculate_perimeter(double radius) {
        return 2 * pi * radius;
    }
}
