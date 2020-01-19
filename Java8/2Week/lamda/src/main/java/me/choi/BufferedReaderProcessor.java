package me.choi;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {
    String processFile(BufferedReader br) throws IOException;
}
