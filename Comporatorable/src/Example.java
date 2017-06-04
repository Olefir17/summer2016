import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Admin on 19.09.2016.
 */
public class Example {
    public static void main(String[] args) {
      TreeSet<Comp> ex = new TreeSet<>();
        ex.add(new Comp("Anastasia Olefir", 345));
        ex.add(new Comp("Anastasia Olefir", 341));
        ex.add(new Comp("Lilia Dundeva", 211));
        ex.add(new Comp("Lilia Dundeva", 271));
        ex.add(new Comp("Vova Porichanskiy", 213));

        for (Comp e : ex
                ) {
            System.out.println("Str " + e.str + " number " + e.n);
        }
    }
}
