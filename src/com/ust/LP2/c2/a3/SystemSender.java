package com.ust.LP2.c2.a3;

import java.net.ServerSocket;

public class SystemSender {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {

        } catch (Exception e) {e.printStackTrace();}
    }
}
