package samRab;
import java.io.*;
class InputFile {
    private BufferedReader in;
    InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
//Код, який спроможний на виняток
        } catch (FileNotFoundException e) {
            System.err.println("Неможливо відкрити " + fname);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e2) {
                System.err.println("in.close() виконаний невдало");
            }
            throw e; //Повторне збудження
        } finally {
// Не закривайте файл тут!!!
        }
    }
    String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            System.err.println("readLine() виконаний невдало");
            s = "Помилка";
        }
        return s;
    }
    void cleanup() {
        try {
            in.close();
        } catch (IOException e2) {

            System.err.println("in.close() виконаний невдало");
        }}}
public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Cleanup.java");
            String s;
            int i = 1;
            while((s = in.getLine()) != null)
                System.out.println(" "+ i++ + ": " + s);
            in.cleanup();
        } catch (Exception e) {
            System.err.println("Перехоплено в main, e.printStackTrace()");
            e.printStackTrace(System.err);
        }
    }
}