package com.stydy.socket.demonio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/**
 * 现场服务
 * @author fengfasong
 * @date 2021/3/1
 */
public class MulTimeServer implements Runnable {

    private ServerSocketChannel server;

    private Selector selector;

    private volatile boolean stop;

    public MulTimeServer(int port){
        try {
            selector = Selector.open();
            server = ServerSocketChannel.open();
            server.configureBlocking(false);
            server.socket().bind(new InetSocketAddress(port),1024);
            server.register(selector,SelectionKey.OP_ACCEPT);
        }catch (Exception e){
            System.exit(1);
        }
    }

    public void stop(){
        this.stop = true;
    }

    @Override
    public void run() {
        while (!stop){
            try {
                selector.select(1000);
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                SelectionKey key = null;
                while (iterator.hasNext()){
                    key = iterator.next();
                    iterator.remove();
                    try {
                        handleInput(key);
                    }catch (Exception e){
                        if(key != null){
                            key.cancel();
                            if(key.channel() != null){
                                key.channel().close();
                            }
                        }
                    }

                }
            }catch (Exception e){

            }
        }
        if(selector != null){
            try {
                selector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleInput(SelectionKey key){
        try {
            if(key.isValid()){
                if(key.isAcceptable()){
                    ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                    SocketChannel accept = ssc.accept();
                    accept.configureBlocking(false);
                    accept.register(selector,SelectionKey.OP_READ);
                }
                if(key.isReadable()){
                    SocketChannel sc = (SocketChannel) key.channel();
                    ByteBuffer allocate = ByteBuffer.allocate(1024);
                    int read = sc.read(allocate);
                    if(read > 0){
                        allocate.flip();
                        byte[] bytes = new byte[allocate.remaining()];
                        allocate.get(bytes);
                        String body = new String(bytes,"UTF-8");
                        String currentTime = "QUERY".equalsIgnoreCase(body) ? new Date(System.currentTimeMillis()).toString() : "BAD ORDER";
                        dowrite(sc,currentTime);
                    }else if(read < 0){
                        key.cancel();
                        sc.close();
                    }
                }
            }
        }catch (Exception e){

        }
    }

    private void dowrite(SocketChannel channel,String response){
            try {
                if(response != null && response.trim().length() > 0) {
                    byte[] bytes = response.getBytes();
                    ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
                    allocate.put(bytes);
                    allocate.flip();
                    channel.write(allocate);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
