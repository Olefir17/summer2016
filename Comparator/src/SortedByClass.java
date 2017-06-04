import java.util.Comparator;

/**
 * Created by Admin on 20.09.2016.
 */
public class SortedByClass implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        double price1 = o1.getPrice();
        double price2 = o2.getPrice();

        if(price1 > price2) {
            return 1;
        }
        else if(price1 < price2) {
            return -1;
        }
        else {
            return 0;
        }
    }
    }

