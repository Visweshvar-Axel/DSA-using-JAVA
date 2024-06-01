package com.ust.LP2.c2.a3;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SystemReceiver {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            while (true){
                try (Socket socket = serverSocket.accept()) {
                    ObjectInputStream ob = new ObjectInputStream(socket.getInputStream());
                    Data data = (Data) ob.readObject();
                } catch (Exception e) {e.printStackTrace();}
            }
        } catch (Exception e) {e.printStackTrace();}
    }
}
