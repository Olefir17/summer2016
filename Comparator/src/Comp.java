import java.util.Comparator;

/**
 * Created by Admin on 20.09.2016.
 */
public class Comp implements Comparator<String> {
    @Override
    public int compare(String  o1, String o2) {
        int k = o1.substring(o1.indexOf(" ")).compareTo(o2.substring(o1.indexOf(" ")));

        if( k==0)
            return o1.compareTo(o2);
        else return k;



    }
}
