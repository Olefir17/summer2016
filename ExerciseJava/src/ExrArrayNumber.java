import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 айти в массиве число, которое повторяется наибольшее количество раз. Не использовать коллекцииН.

 */

public class ExrArrayNumber {
    
    public static void main(String[] args) {
        int[] array={4,5,6,2,3,4,4,3252,231};
        
        System.out.println(Arrays.toString(array));
        int n=0;
        int fr=0;
        for(int temp:array){
            int narr=frequensy(array, temp);
            if(fr<narr){
                n=temp;
                fr=narr;
            }
        }

        System.out.println("The number "+n+" is repeated "+ fr+" times");

    }

    static int frequensy(int[] array,int x){
        int n=0;
        for(int temp:array){
            if(x==temp){
                n++;
            }
        }
        return n;
    }

}


