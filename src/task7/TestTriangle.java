package task7;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Запрашиваем три стороны треугольника
            System.out.print("Введите сторону 1 треугольника: ");
            double side1 = input.nextDouble();

            System.out.print("Введите сторону 2 треугольника: ");
            double side2 = input.nextDouble();

            System.out.print("Введите сторону 3 треугольника: ");
            double side3 = input.nextDouble();

            // Запрашиваем цвет треугольника
            System.out.print("Введите цвет треугольника: ");
            String color = input.next();

            // Запрашиваем информацию о заливке треугольника
            System.out.print("Треугольник закрашен? (true/false): ");
            boolean isFilled = input.nextBoolean();

            // Создаем объект Triangle с указанными сторонами
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(isFilled);

            // Отображаем результаты
            System.out.println("\nИнформация о треугольнике:");
            System.out.println(triangle.toString());
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Закрашен: " + triangle.isFilled());

        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            input.close(); // Закрываем Scanner
        }
    }
}
