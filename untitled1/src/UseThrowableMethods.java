/**
 * Created by Anastasia on 07.11.2016.
 */
class ExcTest1 {
    // Згенерувати виняток
    static void genException() {

        int nums[] = new int[4];
        System.out.println("Before exception is generated.");
//Генерація винятку у зв’язку зі зверненням за межу масиву
        nums[7] = 10;
        System.out.println("this won’t be displayed");
    }}
class UseThrowableMethods {
    public static void main(String args[]) {
        try {
            ExcTest1.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
//Перехоплення повторно згенерованого винятку
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println(" \nStack trace: ");
            exc.printStackTrace ();
        }
        System.out.println("After catch statement.");
    }}