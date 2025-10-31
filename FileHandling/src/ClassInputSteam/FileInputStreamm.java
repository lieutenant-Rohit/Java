package ClassInputSteam;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamm {
    public static void main(String[] args) {

        try{
            File file = new File("sample.txt"); // make sure this file exists
            FileInputStream fis = new FileInputStream(file);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
