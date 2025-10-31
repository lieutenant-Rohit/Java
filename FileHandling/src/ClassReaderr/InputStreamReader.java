package ClassReaderr;

public class InputStreamReader {
    public static void main(String[] args) {

        try{
            java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
            System.out.println("Trying buffered Reader");
            int letters = isr.read();
            while(isr.ready())
            {
                System.out.println(letters);
                System.out.println((char)letters);
                letters = isr.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
