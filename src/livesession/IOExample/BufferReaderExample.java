package livesession.IOExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
    public static void main(String[] args) throws IOException {
        char c;
        String t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        c = (char) br.read();
        t = br.readLine();
    }
}
