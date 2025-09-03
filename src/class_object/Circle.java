package class_object;

import java.util.Scanner;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void areaCircle() {
        System.out.printf("Area of circle: %.4f\n", (Math.PI * radius * radius));
    }

    public void circumferenceCircle() {
        System.out.printf("Circumference of circle: %.4f\n", (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Circle circle = new Circle(r);
        circle.areaCircle();
        circle.circumferenceCircle();
    }
}