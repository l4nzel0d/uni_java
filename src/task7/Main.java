package task7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = null;
        while (triangle == null) {
            System.out.println("Введите стороны треугольника");
            Scanner input = new Scanner(System.in);
            System.out.print("a: ");
            double a = input.nextDouble();
            System.out.print("b: ");
            double b = input.nextDouble();
            System.out.print("c: ");
            double c = input.nextDouble();

            System.out.println("Введите цвет треугольника");
            String colour = input.next();

            System.out.println("Заполнить цветом? (true/false)");
            boolean filled = input.nextBoolean();

            try {
                triangle = new Triangle(a, b, c, colour, filled);
            } catch (IllegalTriangleException e) {
                System.out.println("Ошибка: " + e.getMessage() + " Попробуйте снова.");
            }
        }

        System.out.println(triangle);
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площадь: " + triangle.getArea());

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);
        System.out.println("Сравнение circle1 (r = 3) и circle2 (r = 4): " + circle1.compareTo(circle2));


        ArrayList<GeometricObject> list = new ArrayList<>();
        list.add(new Circle(5));
        list.add(new Circle(22));
        list.add(new Rectangle(12, 15));
        list.add(new Square(20));
        try {
            list.add(new Triangle(3, 4, 5));
        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка создания треугольника: " + e.getMessage());
        }

        for (GeometricObject geometricObject : list) {
            System.out.println(geometricObject.getArea() + " " + geometricObject.howToColor());
        }
    }
}
