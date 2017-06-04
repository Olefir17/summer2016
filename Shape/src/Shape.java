/**
 * Created by Admin on 28.09.2016.
 */
public abstract class Shape {
    abstract double getPerimetr();

    abstract double getArea();
    double getSide(Point a,Point b){
        return Math.sqrt(Math.pow(b.getX()-a.getX(),2)+Math.pow(b.getY()-a.getY(),2));
    }
}
