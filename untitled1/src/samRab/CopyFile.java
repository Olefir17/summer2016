package samRab;

import java.io.*;
class CopyFile {
    public static void main(String args[]) {
        {
            int i;
            FileInputStream fin;
            FileOutputStream fout;
// Переконатися, що файл вказаний
            if (args.length != 2) {
                System.out.println("Usage: CopyFile From To");
                return;
            }
            try {
// Відкриття файла
                fin = new FileInputStream(args[0]);
            } catch (FileNotFoundException exc) {
                System.out.println("File Not Found");
                return;
            }
            try {
// Відкриття файла
                fout = new FileOutputStream(args[1]);
            } catch (FileNotFoundException exc) {
                System.out.println("Error Opening Output File");
                try {
//Закриття файла
                    fin.close();
                } catch (IOException exc2) {
                    System.out.println("Error closing input file.");
                }
                return;
            }
            try {
//Читання файлу до отримання ЕОF
                do {
//Читання з файла
                    i = fin.read();
                    if(i != -1) fout.write (i);
                } while(i != -1);
            } catch (IOException exc) {
                System.out.println("Error file.");
            }
            try {
                fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing output file.");
            }
            try {
                fout.close();
            } catch (IOException exc) {
                System.out.println("Error closing output file.");
            }
        }
    }}
