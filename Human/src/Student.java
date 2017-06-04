/**
 * Created by Admin on 29.09.2016.
 */
public class Student extends Human {
    public Student(int age, String name, String sex, String surname) {
        super(age, name, sex, surname);
    }

    private int number;
    private int group;

    public Student(int age, String name, String sex, String surname, int group, int number) {
        super(age, name, sex, surname);
        this.group = group;
        this.number = number;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group=" + group +
                ", number=" + number + super.toString()+'}';
    }
}
