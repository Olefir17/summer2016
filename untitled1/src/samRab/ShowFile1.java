package samRab;

import java.io.*;
class ShowFile1 {
    public static void main(String args[]) {
        {
            int i;
// Переконатися, що файли вказані
            if (args.length != 1) {
                System.out.println("Usage: ShowFile filename");
                return;
            }
            try (FileInputStream fin = new FileInputStream(args[0])) {
//Блок оператора try з ресурсами
                do {
                    i = fin.read();
                    if(i != -1) System.out.println(i);
                } while(i != -1);
            } catch (IOException exc) {
                System.out.println(" Error file.");
            }}}}