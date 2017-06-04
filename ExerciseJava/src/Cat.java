import java.util.Random;

/**
 * Created by Admin on 15.09.2016.
 */
public class Cat {
    private String name;
    private String sex;
    private int age;
    private String type;

    public Cat(int age, String name, String sex, String type) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public  void voice(String sex){
        if(sex.equals("male"))
            System.out.println("Mrrrrrrrrrrr");
        else System.out.println("Meee");
    }



}
