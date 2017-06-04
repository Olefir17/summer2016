/**
 * Created by Admin on 15.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2,"Stefan","male","pers");
        Cat cat2 = new Cat(4,"Liza","female","sfinks");

        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        cat1.voice(cat1.getSex());
        cat2.voice(cat2.getSex());
    }

}
