/**
 * Created by Admin on 17.07.2016.
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi! ");
        String str1 = "My ";
        String str2 = " name ";
        String str3 = " is Nastia!";
 
        sb.append(str1);
        sb.append(str2);
        sb.append(str3);

        System.out.println(sb.toString());


    }
}
