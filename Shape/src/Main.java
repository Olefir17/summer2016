/**
 * Created by Admin on 28.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Point a = new Point(6,4);
        Point b = new Point(0,4);
        Point c = new Point(9,1);
        Point d = new Point(6,1);
        Point e = new Point(9,2);

        Triangle tr = new Triangle(a,b,c);
        System.out.println(tr.getArea());
        System.out.println(tr.toString());

        Square sq = new Square(a,b,c,d);
        System.out.println(sq.getArea());

        Romb r = new Romb(b,c,d,e);
        System.out.println(r.toString());

        Desk desk = new Desk();
        desk.addShape(tr);
        desk.addShape(sq);
        desk.addShape(r);

        System.out.println(desk);
    }
}
