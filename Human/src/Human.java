/**
 * Created by Admin on 29.09.2016.
 */
public class Human{
    private String surname;
    private String name;
    private int age;
    private String sex;

    public Human(int age, String name, String sex, String surname) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
