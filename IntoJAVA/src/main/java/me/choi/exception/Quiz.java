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
         * try with resources 는 finally 블록에 처리되는 close 과정을
         * 해준다.
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
