package me.choi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassLoader classLoader = App.class.getClassLoader();
        System.out.println("App class의 클래스로더");
        System.out.println(classLoader);

        ClassLoader parent = classLoader.getParent();
        System.out.println("App class의 부모의 클래스로더");
        System.out.println(parent);

        ClassLoader grandMother = parent.getParent();
        System.out.println("App class의 부모의 부모의 클래스로더");
        System.out.println(grandMother);


        Book book = new Book();


    }
}
