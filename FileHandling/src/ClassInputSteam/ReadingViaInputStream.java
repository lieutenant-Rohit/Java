package ClassInputSteam;

import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadingViaInputStream {
    public static void main(String[] args) {

        try{
            InputStream input = System.in;
            System.out.println("Enter Some text");
            int data = input.read();
            while(input.available()>0)
            {
                System.out.println("Byte Data:- "+data);
                System.out.println("Char Daya:- "+(char)data);
                data=input.read();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
