import java.util.Random;

/**
 * Created by Admin on 14.09.2016.
 * Дано массив из 10 целых чисел. Вывести на экран сумму всех его элементов кроме первого и последнего.
 */
public class ExrArray {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            array[i] = r.nextInt();
          

        }
        for (int i = 1; i <array.length-1 ; i++) {
            sum+=array[i];

        }
        System.out.println(sum);


    }
}
