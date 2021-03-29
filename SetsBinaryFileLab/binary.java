package SetsBinaryFileLab;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class binary {
        public static void main(String[] args) throws IOException {
                generateRandom();
                readBinaryFile();
        }

        public static void generateRandom() throws IOException {
                int[] ar = new int[500];

                // generating random numbers
                for (int i = 0; i < ar.length; i++)
                        ar[i] = (int) (Math.random() * (9999 - 1000)) + 1000;

                String binary = "BinaryFile.dat";
                String ascii = "data.txt";

                //writing data from the array to files
                DataOutputStream out = new DataOutputStream(new FileOutputStream(binary));
                PrintWriter pw = new PrintWriter(ascii);
                for (int i = 0; i < ar.length; i++) {
                        pw.println(ar[i]);
                        out.writeInt(ar[i]);
                }
                pw.close();
                out.close();
        }

        // reading data from binary file
        public static void readBinaryFile() throws IOException {
                String binary = "BinaryFile.dat";
                DataInputStream in = null;
                try {
                        in = new DataInputStream(new FileInputStream(binary));
                        int count = 0;
                        while (true) {
                                count++;
                                System.out.println(count + ". " + in.readInt());
                        }
                } catch (EOFException e) {
                        // do nothing
                }
                in.close();
        }
}
