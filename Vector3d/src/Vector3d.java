/**
 * Created by Admin on 27.09.2016.
 */
public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public Vector3d addvector(Vector3d vector){
        double a = this.getX() + vector.getX();
        double b = this.getY() + vector.getY();
        double c = this.getZ() + vector.getZ();
        return new Vector3d(a,b,c);
    }
    public double scalyar(Vector3d vectorOne){
      double multiplay = vectorOne.getX()*this.getX()+vectorOne.getY()+this.getY()+vectorOne.getZ()+this.getX();
        return multiplay;
    }

    public Vector3d vectorMulti(Vector3d vector){
        double a = this.y * vector.z - this.z * vector.y;
        double b = this.z * vector.x - this.x * vector.z;
        double c = this.x * vector.y - this.y * vector.x;

        return new Vector3d(a,b,c);
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
