package File;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Anastasia on 15.01.2017.
 */
public class Main  {

    Random r = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat("Alex", 5);

        System.out.println(r.());

        String s = scanner.next();
        int n = Integer.parseInt(s);
        System.out.println("Вы ввели \r"+ n + " ");
    }
}


