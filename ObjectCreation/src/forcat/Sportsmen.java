package forcat;

import forpeople.People;

/**
 * Created by Admin on 29.06.2016.
 */
public class Sportsmen extends People {
    private String typeSport;

    public Sportsmen(String name, String lastName, int age, Cat cat, String typeSport) {
        super(name, lastName, age, cat);
        this.typeSport = typeSport;
    }


    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello guys!");;
    }

    @Override
    public String toString() {
        return "Sportsmen{" +
                "typeSport='" + typeSport + '\'' + super.toString()+'}';
    }
}
