package ClassReaderr;

import java.io.FileReader;

public class FileReaderr {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("/Users/geek/Documents/Java/FileHandling/src/ClassReaderr/Notes.txt");
            int letters;
            while ((letters = fr.read()) != -1) {
                System.out.println(letters);
                System.out.println((char) letters);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
