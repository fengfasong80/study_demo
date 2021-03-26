package com.stydy.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * socket
 * @author fengfasong
 * @date 2021/3/1
 */
public class Demo01 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true){
                Socket accept = serverSocket.accept();
                SocketClient socketClient = new SocketClient(accept);
                Thread thread = new Thread(socketClient);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
