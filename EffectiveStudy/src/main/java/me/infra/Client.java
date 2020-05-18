package me.infra;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:15 오후
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        try {
            Socket socket = new Socket(InetAddress.getByName("localhost"),12345);
            InputStream in = socket.getInputStream();

            int c;
            while ((c = in.read()) != -1) {
                System.out.println(c);
            }
            System.out.flush();

            Thread.sleep(Integer.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
