package me.designpattern.j_composit;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:07 오후
 */
public class Folder extends Component{

    List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }


    public boolean addComponent(Component component) {

        return children.add(component);
    }
    public boolean removeComponent(Component component) {

        return children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }
}
