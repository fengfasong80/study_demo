package com.stydy.socket.demonio;

/**
 * 主程序
 * @author fengfasong
 * @date 2021/3/1
 */
public class DemoMain {
    public static void main(String[] args) {
        int port = 8080;
        if(args != null && args.length > 0){
            port = Integer.valueOf(args[0]);
        }
        MulTimeServer mulTimeServer = new MulTimeServer(port);
        new Thread(mulTimeServer,"NIO-001").start();
    }
}
