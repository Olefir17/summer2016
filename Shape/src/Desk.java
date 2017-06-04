import java.util.Arrays;

/**
 * Created by Admin on 29.09.2016.
 */
public class Desk {

    Shape part[] = new Shape[4];

    public void addShape(Shape shape){
        for (int i = 0; i <part.length ; i++) {
            if(part[i]==null){
                part[i]=shape;
                System.out.println(shape + "is added");
            }
        }
    }
    public void delete(int p){
        if(part[p]!=null){
            part[p]=null;
        }

    }

    @Override
    public String toString() {
        StringBuilder  st = new StringBuilder();
        double area = 0;
        for (int i = 0; i <part.length ; i++) {
            if(part[i]!= null){
                st.append(part[i]);
                area= part[i].getArea();
            }
            else
                st.append("Empty");
        }
        st.append(System.lineSeparator());

        st.append("Sum of areas = " + area + System.lineSeparator());
        return st.toString();
    }
}
