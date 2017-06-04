import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Admin on 20.09.2016.
 */
public class ExampleArray {
    public static void main(String[] args) {
        ArrayList<Product>list = new ArrayList();

        // заполним объект Product содержимым
        list.add(new Product("Milk",7.56,56)) ;
        list.add(new Product("Coffe" ,17,32));
        list.add(new Product("Tea",12.43,0));



        for(Product i : list)
            System.out.println("Name: " + i.getName() +
                    " price: " + i.getPrice() +
                    " quantity: " + i.getQuantity());

        // отсортируем и выведем данные по цене
        System.out.println("========== sorted by price===========");


       // Arrays.sort(list, new SortedByClass());
        Collections.sort(list, new SortedByClass());

            System.out.println(list.toString());


        // отсортируем и выведем данные по названию
        System.out.println("========== sorted by name ===========");
        Collections.sort(list,new SortedByNames());

       // Arrays.sort(list, new SortedByNames());
        for(Product i : list) {
            System.out.println("Name: " + i.getName() +
                    " price: " + i.getPrice() +
                    " quantity: " + i.getQuantity());
        }
    }

}



