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
        // TODO: [try with resources 적용] junwoochoi 2021/01/19 2:53 오후
        /**
         * 훨씬 깔끔
         * */
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dest)) {

            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        }
    }
}
