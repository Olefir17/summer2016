package laba1;

/**
 * Created by Admin on 25.09.2016.
 */
public class OutputDemo {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        for(char c = 'A';c <='Z';c++){
            s.append(c);
            System.out.println(s);
        }
    }
}
