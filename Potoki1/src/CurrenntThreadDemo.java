/**
 * Created by Admin on 25.09.2016.
 */
public class CurrenntThreadDemo {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Текущий поток"+ t);
        t.setName("Мой Thread");
        System.out.println("После изменения"+t);

        try {
            for (int i = 5; i >0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный птоток прерван");
        }


    }



}
