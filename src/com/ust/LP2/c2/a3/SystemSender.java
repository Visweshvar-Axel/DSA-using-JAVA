package com.ust.LP2.c2.a3;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class SystemSender {
    public static void main(String[] args) {
        Data data = new Data(12,"Hello Viswa");
        try (Socket socket = new Socket("localhost",12345)){
            ObjectOutputStream ob = new ObjectOutputStream(socket.getOutputStream());
            ob.writeObject(data);
        } catch (Exception e) {e.printStackTrace();}
    }
}
