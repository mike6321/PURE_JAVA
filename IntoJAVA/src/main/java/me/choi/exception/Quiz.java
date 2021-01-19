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
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        } finally {
            // TODO: [close에 문제가 있다.] junwoochoi 2021/01/19 2:44 오후
            /**
             * 첫 번째 close가 비정상 종료 되었을때 다음 close를 타지 않는다.
             * */
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {

                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {

                }
            }
        }
    }
}
