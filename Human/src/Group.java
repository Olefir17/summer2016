import java.util.ArrayList;
import java.util.Comparator;
import java.util.IllegalFormatException;
import java.util.TreeSet;

/**
 * Created by Admin on 29.09.2016.
 */
public class Group  implements Comparator{
    private String name;
     private TreeSet<Student> set = new TreeSet<>();

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeSet<Student> getSet() {
        return set;
    }

    public void setSet(TreeSet<Student> set) {
        this.set = set;
    }
    public void addStudent(Student student) {
        if(set.size()<10) {
            set.add(student);

            System.out.println(student + " зачисден в " + getName());
        };
    }


    @Override
    public int compare(TreeSet<Student>) {
        return ;
    }
}
