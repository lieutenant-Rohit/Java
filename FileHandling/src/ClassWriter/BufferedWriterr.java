package ClassWriter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterr {
    public static void main(String[] args) throws IOException {

        String filePath = "/Users/geek/Documents/Java/FileHandling/symbol.txt";

        try{
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Initiating Writing.......");
            bw.write("This is Buffered Writer..");
            bw.newLine();
            bw.write("This makes Writing easy and smooth");
            bw.close();
            System.out.println("Writing Successful");
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
