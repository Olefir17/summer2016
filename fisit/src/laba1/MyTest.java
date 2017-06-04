package laba1;

/**
 * Created by Admin on 25.09.2016.
 */
public class MyTest {
    public static void main(String[] args) {
        String a1 = " ";
        Integer a2 = new Integer(0);
        if(args.length<2)
            System.out.println("Out of parametrs");
        else {
            a1 = args[0];
        }
        try {
            a2 = Integer.valueOf(args[1]);
        }
        catch (NumberFormatException e){
            System.out.println("Exception NumberForman Exceptiion");
        }
    }
}
