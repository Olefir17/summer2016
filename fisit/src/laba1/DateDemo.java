package laba1;

import java.util.Date;

/**
 * Created by Admin on 25.09.2016.
 */
 class DateDemo {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today.toString());
        Date future = new Date("5/3/2006");
        System.out.println(future.toString());
    }
}
