package me.infra;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:13 오후
 */
public class Server {
    public static void main(String[] args) {
        try {
            Socket socket = new ServerSocket(12345).accept();
            OutputStream out = socket.getOutputStream();

            out.write("Hello World\n".getBytes());
            out.flush();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
