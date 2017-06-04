/**
 * Created by Anastasia on 07.11.2016.
 */
class ThrowDemo {
    public static void main(String args[]) {
        try {
            System.out.println("Before throw.");
// Генерування винятку
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
//Перехопити виняток
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }}