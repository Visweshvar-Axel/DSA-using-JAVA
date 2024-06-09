package livesession.IOExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderExample {
    public static void main(String[] args) {
        char c;
        String t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        c = (char) br.read();
    }
}
