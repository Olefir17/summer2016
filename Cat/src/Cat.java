import java.util.Random;

/**
 * Created by Admin on 27.09.2016.
 */
public class Cat {
    private String name;
    private int age;
    private String sex;
    private int weight;

    public Cat(int age, String name, String sex, int weight) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void catVoice(){
        if(getAge()>=3)
            System.out.println("MEEEEOW");
        else System.out.println("meeee");
    }
    public void playWitBall(){
        if(getWeight()<=5)
            System.out.println("Cat can t play with ball");
        else{
            Random r = new Random();
            int rad;
            rad = r.nextInt()*2;
            if(rad<=1)
                System.out.println("LOSSSSSSSSSER");
            else System.out.println("WIIIIIn");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                '}';
    }
}
