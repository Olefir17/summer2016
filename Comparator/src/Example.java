import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Admin on 20.09.2016.
 */
public class Example {
    public static void main(String[] args) {


        TreeSet<String> ex = new TreeSet<String>(new Comp());
        ex.add(new String("Anastasia Olefir"));
        ex.add(new String("Lilia Dundeva"));
        ex.add(new String("Vladimir Porichansky"));

        Iterator<String> i = ex.iterator();
        while (i.hasNext()){
            String ts = i.next();
            System.out.println("String "+ ts);
        }
    }
}
