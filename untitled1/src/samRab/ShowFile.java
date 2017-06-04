package samRab;

import java.io.*;
class ShowFile {
    public static void main(String args[]) {
        {
            int i;
            FileInputStream fin;
// Переконатися, що файл вказаний
            if (args.length != 1) {
                System.out.println("Usage: ShowFile File");
                return;
            }
            try {
// Відкриття файла
                fin = new FileInputStream(args[0]);
            } catch (FileNotFoundException exc) {
                System.out.println(" File Not Found");
                return;
            }
            try {
//Читання файла до отримання ЕОF
                do {
//Читання з файла
                    i = fin.read();
                    if(i != -1) System.out.print((char) i);
// Значення -1
//
                } while(i != -1);
            } catch (IOException exc) {
                System.out.println(" Error reading file.");

            }
            try {
//Закриття файла
                fin.close();
            } catch (IOException exc) {
                System.out.println("Error reading file.");
            }
        }
    }}