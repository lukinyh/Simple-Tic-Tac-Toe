import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;

        int b = inputStream.read();
        while (b != -1) {
            System.out.print((byte) b);
            b = inputStream.read();
        }
        inputStream.close();
    }
}
//97989910
