package ThreadDemo;

/**
 * Created by Admin on 25.09.2016.
 */
public class NewThread extends Thread {
    NewThread(){
        super("Демонстрационный поток");
        System.out.println("Дочерний поток"+ this);
        start();
    }

   @ Override
    public void run() {
        try{
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Дочерний поток "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
       System.out.println("Дочерний поток завершен");
   }
}
