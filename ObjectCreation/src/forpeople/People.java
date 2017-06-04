package forpeople;
import forcat.Cat;

/**
 * Created by Admin on 29.06.2016.
 */
public class People {

    private String name;
    private String lastName;
    private int age;

    public People(String name, String lastName, int age, Cat cat) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.cat = cat;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    private Cat cat;
    public void sayHello(){
        System.out.println("Hello");
    }

    /*@Override
    public String toString() {
        return "People[name-" + name + ", lastname-" + lastName + ", age-"+ age  + ". Has cat - " + cat +"]";
    }*/

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                '}';

    }


}
