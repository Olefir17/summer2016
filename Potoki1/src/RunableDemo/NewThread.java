package RunableDemo;

/**
 * Created by Admin on 25.09.2016.
 */
public class NewThread implements Runnable {
    Thread t ;

    public NewThread() {
        t = new Thread(this,"Демонстрационный поток");
        System.out.println("Дочерний поток создан"+t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >0 ; i--) {
                System.out.println("Дочерний поток"+ t);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");

    }
}
