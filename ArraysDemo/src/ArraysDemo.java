import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Admin on 20.09.2016.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int array [] = new int[10];
        Random r = new Random();
        for (int i = 0; i <10 ; i++) {
            array[i]=(int)(Math.random()*i);
        }

        System.out.print("Искохдное содержимое: ");
        display(array);

        Arrays.sort(array);
        System.out.print("Отсортировыный массив: ");
        display(array);

        Arrays.fill(array,2,6,-1);
        System.out.print("Поле fill :");
        display(array);

        Arrays.sort(array);
        System.out.print("После повторной сортировки :");
        display(array);

        System.out.print("Значене -9 нахоодится на позиции ");
        int index = Arrays.binarySearch(array,-9);
        System.out.println(index);





        }


    private static void display(int[] array) {
        for (int i:array ) {
            System.out.print(i+ " ");
        }
            System.out.println();
        }
    }

