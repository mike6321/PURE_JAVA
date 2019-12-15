package me.choi.chapter03.version04;

import me.choi.chapter03.version03.Elvis3;

import java.io.*;

public class SingletonSerialize {

    public static void main(String[] args) {
        Elvis3 elvis3 = Elvis3.getInstance();
        serializing(elvis3);

        Elvis3 elvis31 = deserializing();

        System.out.printf("Foo1(%s): (%s, %s)\n", elvis3, elvis3.getName(), elvis3.getAge());
        System.out.printf("Foo2(%s): (%s, %s)\n", elvis31, elvis31.getName(), elvis31.getAge());
        System.out.println(elvis3 == elvis31);
        System.out.println(elvis3.equals(elvis31));

    }

    public static void serializing(Elvis3 elvis3) {
        try (FileOutputStream fos = new FileOutputStream("test");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream out = new ObjectOutputStream(bos)) {
            out.writeObject(elvis3);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static Elvis3 deserializing() {
        try (FileInputStream fis = new FileInputStream("test");
             BufferedInputStream bis = new BufferedInputStream(fis);
             var in = new ObjectInputStream(bis)) {

            Elvis3 elvis3 = (Elvis3) in.readObject();

            return elvis3;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
