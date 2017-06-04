/**
 * Created by Admin on 27.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(3, "Bob", "men", 3);
        Cat cat2 = new Cat(8, "Cris",  "female",8);
        cat1.catVoice();
        cat2.catVoice();
        System.out.println(cat1.equals(cat2));
        cat1.playWitBall();
        cat2.playWitBall();



        System.out.println(cat2.toString());
}
}

