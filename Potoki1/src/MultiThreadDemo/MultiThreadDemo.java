package MultiThreadDemo;

import ThreadDemo.*;

/**
 * Created by Admin on 26.09.2016.
 */
public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Один");
        new NewThread("Два");
        new NewThread("Три");

        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            System.out.println("Главный поток перерван");
        }
        System.out.println("Главный поток завершен");
    }

}
