/**
 * Created by Admin on 20.09.2016.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

         double area() {

        if ((a + b) > c || (b + c) > a || (a + c) > b) {
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b * (p - c)));
            return area;
        } else {
            System.out.println("Введите другие значения");
            return 0;

        }
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}


