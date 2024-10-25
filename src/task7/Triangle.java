package task7;

public class Triangle extends GeometricObject implements Colorable {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle() {
        super(); // Вызывает конструктор родителя
    }

    // Конструктор с заданными сторонами
    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        this(a, b, c, null, false); // Вызов конструктора с заданными сторонами и значениями по умолчанию
    }

    // Конструктор с заданными сторонами, цветом и заливкой
    public Triangle(double a, double b, double c, String color, boolean filled) throws IllegalTriangleException {
        super(color, filled); // Вызывает конструктор родителя с цветом и заливкой
        if (!checkSides(a, b, c)) {
            throw new IllegalTriangleException("В треугольнике сумма любых двух сторон должна быть больше третьей.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Boolean checkSides(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return super.toString() + "\nТреугольник: сторона1 = " + a + " сторона2 = " + b + " сторона3 = " + c;
    }


    @Override
    public int compareTo(GeometricObject geometricObject) {
        Triangle triangle = (Triangle) geometricObject;
        return Double.compare(getArea(), triangle.getArea());
    }

    @Override
    public String howToColor() {
        return "Раскрастье все три стороны";
    }
}
