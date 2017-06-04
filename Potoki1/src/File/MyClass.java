package File;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Anastasia on 15.01.2017.
 */
public class MyClass {
    public static void main(String[] args) {
        try{
            File f = new File("D:\\настя\\заметки");
            String[] list1 = f.list();
            File[] list2 = f.listFiles();

            for (String s :list1
                 ) {
                System.out.println(s);
            }

            for (File t :list2
                 ) {
                System.out.println(t.getCanonicalPath());
            }

            long ls = list2[1].length();
            System.out.println(ls);

            long date = f.lastModified();
            Date date1 = new Date(date);
            System.out.println(date1);



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
