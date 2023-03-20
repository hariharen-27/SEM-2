
import java.util.*;

public class circle {
    private double radius;
    private String color = "red";

    circle() {
        this.radius = 5.0;
    }

    circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    double getArea(double radius) {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        circle c1 = new circle();
        // circle c2 = new circle(r);
        c1.circle(r);
        System.out.println("Default Constructor Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea(c1.getRadius()));
        System.out.println("Parameter Radius " + c1.getRadius());
        System.out.println("Area: " + c1.getArea(c1.getRadius()));


    }
}