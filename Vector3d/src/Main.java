/**
 * Created by Admin on 27.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Vector3d vector1 = new Vector3d(5,7,1);
        Vector3d vector2 = new Vector3d(8,8,6);
        Vector3d vector3 = new Vector3d(3,7,9);
        Vector3d vector4 = new Vector3d(5.665,7.334,1);

        System.out.println(vector1.equals(vector4));
        System.out.println(vector1.addvector(vector2));
        System.out.println(vector1.scalyar(vector4));
        System.out.println(vector3.vectorMulti(vector2));

    }
}
