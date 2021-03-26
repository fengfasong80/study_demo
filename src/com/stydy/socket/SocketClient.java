package com.stydy.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 客户端现场
 * @author fengfasong
 * @date 2021/3/1
 */
public class SocketClient implements Runnable{

    private Socket socket;

    public SocketClient(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        write();
    }
    public  void write(){
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true){
                String s = bufferedReader.readLine();
                System.out.println(s);
            }
        }catch (Exception e){
        }

    }
}
