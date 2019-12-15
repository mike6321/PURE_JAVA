package me.choi.chapter03.version05;



import java.io.*;

public class SingletonSerialize {
    public static void main(String[] args) {
        Elvis4 elvis4 = Elvis4.getInstance();
        serializing(elvis4);
        Elvis4 elvis41 = deserializing();

        System.out.printf("Foo1(%s): (%s, %s)\n", elvis4, elvis4.getName(), elvis4.getAge());
        System.out.printf("Foo2(%s): (%s, %s)\n", elvis41, elvis41.getName(), elvis41.getAge());
        System.out.println(elvis4 == elvis41);
        System.out.println(elvis4.equals(elvis41));
    }

    public static void serializing(Elvis4 elvis4) {
        try (FileOutputStream fos = new FileOutputStream("test");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream out = new ObjectOutputStream(bos)) {
            out.writeObject(elvis4);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static Elvis4 deserializing() {
        try (FileInputStream fis = new FileInputStream("test");
             BufferedInputStream bis = new BufferedInputStream(fis);
             var in = new ObjectInputStream(bis)) {

            Elvis4 elvis4 = (Elvis4) in.readObject();

            return elvis4;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
