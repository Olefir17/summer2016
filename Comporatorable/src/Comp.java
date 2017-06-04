/**
 * Created by Admin on 19.09.2016.
 */
public class Comp implements Comparable {
    String str;
    int n;

    public Comp(String str, int n) {
        this.str = str;
        this.n = n;
    }

    @Override
    public int compareTo(Object o) {
        Comp entry = (Comp) o;

        String str1 = str.substring(str.indexOf(" "));
        String str2 = entry.str.substring(entry.str.indexOf(" "));
        int result =  str1.compareTo(str2);
        if( result != 0)
        return result;

        result = n-entry.n;
        if(result != 0)
            return result/Math.abs(result);

        return 0;

    }
}
