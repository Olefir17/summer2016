/**
 * Created by Admin on 28.09.2016.
 */
public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    double getPerimetr() {
        return this.getSide(a,b)+this.getSide(b,c)+this.getSide(a,c);
    }

    @Override
    double getArea() {
        double p = getPerimetr()/2;
        return Math.sqrt(p*(p-this.getSide(a, b))*(p-this.getSide(b, c))*(p-this.getSide(c, a)));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}' + System.lineSeparator();
    }
}

