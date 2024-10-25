package task7;

public class Square extends GeometricObject implements Colorable {
    double side;

    Square() {
        this.side = 0;
    }

    Square(double side) {
        this.side = side;
    }

    double getSide() {
        return side;
    }

    void setSide(double side) {
        this.side = side;
    }

    @Override
    public String howToColor() {
        return "Раскрасьте все четыре стороны";
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
