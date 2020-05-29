package me.designpattern.j_composit;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:05 오후
 */
public class Main {
    public static void main(String[] args) {

        Folder root = new Folder("root");
        Folder home = new Folder("home");
        Folder junwoo = new Folder("junwoo");
        Folder music = new Folder("music");
        Folder picture = new Folder("picture");
        Folder doc = new Folder("doc");
        Folder usr = new Folder("usr");

        File track1 = new File("track1");
        File track2 = new File("track2");
        File pic1 = new File("pic1");
        File doc1 = new File("doc1");
        File java = new File("java");

        root.addComponent(home);
            home.addComponent(junwoo);
                junwoo.addComponent(music);
                    music.addComponent(track1);
                    music.addComponent(track2);
                junwoo.addComponent(picture);
                    picture.addComponent(pic1);
                junwoo.addComponent(doc);
                    doc.addComponent(doc1);

        root.addComponent(usr);
            usr.addComponent(java);


        show(root);
    }

    private static void show(Component component) {
        System.out.println(component.getClass().getName() + "|" +component.getName());

        if (component instanceof Folder) {
            for (Component c : ((Folder) component).getChildren()) {
                show(c);
            }
        }

    }
}
