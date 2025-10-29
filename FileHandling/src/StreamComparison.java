import java.io.*;

public class StreamComparison {
    public static void main(String[] args) throws IOException {
        String symbol = "ᛞ"; // Unicode character beyond 8-bit range

        // Step 1: Write the symbol to a file using character stream
        FileWriter fw = new FileWriter("symbol.txt");
        fw.write(symbol);
        fw.close();

        System.out.println("Reading using Byte Stream:");
        // Step 2: Read using Byte Stream
        FileInputStream fis = new FileInputStream("symbol.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b); // May show garbled output
        }
        fis.close();

        System.out.println("\n\nReading using Character Stream:");
        // Step 3: Read using Character Stream
        InputStreamReader isr = new InputStreamReader(new FileInputStream("symbol.txt"), "UTF-8");
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch); // Correctly shows 'ᛞ'
        }
        isr.close();
    }
}