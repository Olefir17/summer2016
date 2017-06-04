import forcat.Cat;
import forcat.Sportsmen;
import forpeople.People;
import impl.DriverBus;

/**
 * Created by Admin on 29.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Steve", 2 , "sfinks");
        Cat cat1 = new Cat("Bob", 4, "pers");
        People people = new People("Nastia", "Olefir", 19, cat);
        /*people.setName("Sophi");

        System.out.println(people);
        people.getCat().say();
        System.out.println();
        people.sayHello();


        Sportsmen sportsmen = new Sportsmen( "Cortny", "Fox", 34, cat1, "Fencing");
        sportsmen.setAge(35);
        sportsmen.setTypeSport("Football");
        sportsmen.setCat(cat);
        sportsmen.sayHello();
        System.out.println();

        System.out.println(sportsmen);*/
        DriverBus t = new DriverBus();
        t.setCategory("A");
        System.out.println(t.getSpeed());
        t.go();


    }
}
