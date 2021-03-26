package com.stydy.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * nio
 * @author fengfasong
 * @date 2021/3/1
 */
public class Demo02 {
    public static void main(String[] args) {
        try {
            ServerSocketChannel server = ServerSocketChannel.open();
            server.socket().bind(new InetSocketAddress(InetAddress.getByName("ip"),9999));
            server.configureBlocking(false);
            //多路复用器（轮询去查询正在连接、读、写的通道）
            Selector selector = Selector.open();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
