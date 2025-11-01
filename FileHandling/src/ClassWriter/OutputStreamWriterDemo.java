package ClassWriter;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) {

        try{
            OutputStreamWriter wr = new OutputStreamWriter(System.out);
            wr.write("Hello!... This is output Stream Writer writing to the console!.....");
            wr.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
