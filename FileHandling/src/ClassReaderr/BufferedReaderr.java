package ClassReaderr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int letters = br.read();
        while(br.ready()) {
            System.out.print(letters+" ");
            System.out.println((char) letters);
            letters= br.read();

        }
    }
}
