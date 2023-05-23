package assignment10;

interface Shapes {
    void getArea(double a, double b);

    void toStrings();
}
class Rectangle implements Shapes{

double area;
    @Override
    public void getArea(double a, double b) {
        area = a*b;

    }

    @Override
    public void toStrings() {
        System.out.println("Area of rectangle is:"+area);

    }
}
class Triangle implements Shapes{
    double total;

    @Override
    public void getArea(double a, double b) {
        total = a*b;

    }

    @Override
    public void toStrings() {
        System.out.println("Triangle of:"+total);

    }
}
public class InterfaceInShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getArea(23,54);
        rectangle.toStrings();
        Triangle triangle = new Triangle();
        triangle.getArea(23,45);
        triangle.toStrings();

    }
}
/*
Area of rectangle is:1242.0
Triangle of:1035.0

Process finished with exit code 0

 */