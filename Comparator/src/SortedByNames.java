import java.util.Comparator;

/**
 * Created by Admin on 20.09.2016.
 */
public class SortedByNames implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {

        String str1 = o1.getName();
        String str2 = o2.getName();
        return str1.compareTo(str2);
    }
}
