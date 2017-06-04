package samRab;
import java.io.*;
class RWData {
    public static void main(String args[]) {
        {
            int i = 10;
            double d = 1023.56;
            boolean b = true;
// Записати ряд значень
            try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("textdata"))) {
                System.out.println(" Writing " + i);
                dataOut.writeInt(i);
                System.out.println(" Writing " + d);
                dataOut.writeDouble(d);
                System.out.println("Writing " + b);
                dataOut.writeBoolean(b);
                System.out.println("Writing " + 12.2 * 7.4);
                dataOut.writeDouble(12.2 * 7.4);
            } catch (IOException exc) {
                System.out.println(" Write Error.");
                return;
            }
            System.out.println();
            try (DataInputStream dataOut = new DataInputStream(new FileInputStream("textdata"))) {
// Читання двоїстих даних з файлу
                i = dataOut.readInt();
                System.out.println("Reading " + i);
                d = dataOut.readDouble();
                System.out.println("Reading " + d);
                b = dataOut.readBoolean();
                System.out.println("Reading " + b);
                d = dataOut.readDouble();
                System.out.println("Reading " + d);
            } catch (IOException exc) {
                System.out.println(" Read Error.");
            }
        }
    }
}