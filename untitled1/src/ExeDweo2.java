/**
 * Created by Anastasia on 07.11.2016.
 */
/* Виняток може бути згенерований одним методом, а перехоплений іншим */
class ExeTest{
    // Згенерувати виняток
    static void genException() {
        int nums[] = new int[4];
        System.out.println("Before exception is generated.");

        nums[7] = 10;
        System.out.println("this won’t be displayed");
    }}
public class ExeDweo2{
    public static void main(String args[]) {

        try {
            ExeTest.genException();
        }
//Перехоплення винятку…
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }}