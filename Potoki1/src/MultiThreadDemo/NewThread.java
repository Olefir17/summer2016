package MultiThreadDemo;

/**
 * Created by Admin on 26.09.2016.
 */
public class NewThread implements Runnable {
    String name;
    Thread t;

     NewThread(String threadname) {
        name=threadname;
         t =new Thread(this,name);
         System.out.println("Новый поток "+t );
         t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >0 ; i--) {
                System.out.println(name + " "+ i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");

    }
}
