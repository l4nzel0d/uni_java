package task7;

public class Triangle extends GeometricObject {
    double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    /** Создает треугольник с указанными сторонами */
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        // Проверяем условия для формирования треугольника
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Стороны треугольника должны быть положительными.");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Сумма длин любых двух сторон должна быть больше длины третьей стороны.");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Треугольник: сторона1 = " + side1 + ", сторона2 = " + side2 +
                ", сторона3 = " + side3;
    }
}
