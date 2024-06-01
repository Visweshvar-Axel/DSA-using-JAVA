package com.ust.LP2.c2.a3;

import java.net.ServerSocket;
import java.net.Socket;

public class SystemSender {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            while (true){
                try (Socket socket = serverSocket.accept()) {


                }
            }
        } catch (Exception e) {e.printStackTrace();}
    }
}
