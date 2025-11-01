package ClassWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterDemo {
    public static void main(String[] args) {
        String path = "/Users/geek/Documents/Java/FileHandling/symbol.txt";
        try{
            FileWriter fw = new FileWriter(path,true);
            System.out.println("Initiating Writing in Append Mode");
            fw.write("\n--------------------------------\n");
            fw.write("Appending New Data \n");
            fw.write("Hello File Handling is such an amazing stuff \n");
            fw.write("--------------------------------\n");
            fw.close();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
