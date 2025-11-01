package ClassOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String data= "Hello!.... Writing using FileOutputStream..";
        try{
            FileOutputStream fos = new FileOutputStream("/Users/geek/Documents/Java/FileHandling/symbol.txt");
            byte[] bytes= data.getBytes();
            fos.write(bytes);
            fos.close();
        }catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
