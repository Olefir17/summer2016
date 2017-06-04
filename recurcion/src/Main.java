/**
 * Created by Admin on 29.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(calcMultiplication(9,7));

    }

    static int calcMultiplication( int a, int b ){
        int mult = a * b;
        if( mult < 0){
            mult = calcMultiplication(1,1);
             }
        else if ( mult >25){
            mult = calcMultiplication(2,2);
        }

        return mult;
    }
}
