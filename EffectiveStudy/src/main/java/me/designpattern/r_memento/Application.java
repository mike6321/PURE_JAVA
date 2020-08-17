package me.designpattern.r_memento;

import me.designpattern.r_memento.abc.Memento;
import me.designpattern.r_memento.abc.Originator;

import java.util.Stack;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:47 오후
 */
public class Application {
    public static void main(String[] args) {

        Stack<Memento> mementos = new Stack<>();

        Originator originator = new Originator();

        originator.setState("state 1");
        mementos.push(originator.createMemento());

        originator.setState("state 2");
        mementos.push(originator.createMemento());

//        Memento memento = originator.createMemento();
//        memento = new Memento("state Something!");
//        mementos.push(memento);

        originator.setState("state 3");
        mementos.push(originator.createMemento());

        originator.setState("state Final");
        mementos.push(originator.createMemento());

        // TODO: [state Final] junwoochoi 2020/07/26 11:20 오후
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());

        // TODO: [state 3] junwoochoi 2020/07/26 11:20 오후
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());

        // TODO: [state 2] junwoochoi 2020/07/26 11:20 오후
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());

        // TODO: [state 1] junwoochoi 2020/07/26 11:21 오후
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());

    }
}
