package laba1;

/**
 * Created by Admin on 25.09.2016.
 */
public class DateClass {
    int month;
    int day;
    int year;
    public DateClass(int m,int d,int y ) {
        month = m;
        day = d;
        year = y;
    }
    public void Dispplay(){
        System.out.println(month + "/" + day + "/" + year);
    }
}

class DateObject{
    public static void main(String[] args) {
        DateClass birthday = new DateClass(7,18,64);
        birthday.Dispplay();
        DateClass future = new DateClass(1,1,01);
        future.Dispplay();
    }
}
