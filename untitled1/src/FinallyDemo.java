/**
 * Created by Anastasia on 07.11.2016.
 */
class UserFinally {
    // Згенерувати виняток
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];
        System.out.println("Receiving " + what); {
            try {
                switch(what) {
                    case 0:
                        t = 10/what; // генерація помилки ділення на нуль
                        break;
                    case 1:
                        nums[4] = 4; // генерація помилки звернення до масиву
                        break;
                    case 2:
                        return; // повернення з блоку try
                }
            }
            catch (ArithmeticException exc) {
//Перехопити виняток
                System.out.println("Can’t divide by Zero!");
                return;
            }
            catch (ArrayIndexOutOfBoundsException exc) {
//Перехопити виняток
                System.out.println("No matching element found.");
            }
//Цей блок виконується незалежно від того, як завершиться блок
// try/ catch
        }
    }
}
class FinallyDemo {
    public static void main(String args[]) {

        for(int i=0; i<3; i++) {
            UserFinally. genException(i);
            System.out.println();
        }
    }
}