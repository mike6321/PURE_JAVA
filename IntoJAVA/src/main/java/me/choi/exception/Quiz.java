package me.choi.exception;

import java.io.*;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:40 오후
 */
public class Quiz {

    static void copy (String src, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            out = new FileOutputStream(dest);

            try {
                in = new FileInputStream(src);
                byte[] buf = new byte[1024];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
            } finally {
                // TODO: [만약 IOException이아니라 RuntimeException 이라면?] junwoochoi 2021/01/19 2:44 오후
                /**
                 * RuntimeException 이라면 뒤에 close 예외를 처리하지 않는다.
                 * */
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {

                    }
                }
            }
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {

                }
            }
        }
    }
}
