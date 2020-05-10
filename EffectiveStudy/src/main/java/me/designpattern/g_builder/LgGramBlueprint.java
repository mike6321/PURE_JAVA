package me.designpattern.g_builder;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:05 오후
 */
public class LgGramBlueprint extends BluePrint{

//    private Computer computer;
    private String cpu;
    private String ram;
    private String storage;

    public LgGramBlueprint() {
//        computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {

        this.cpu = "i7";
        //computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        this.ram = "8g";
        //computer.setRam("8g");
    }

    @Override
    public void setStorate() {
        this.storage = "256G SSD";
        //computer.setStorage("256G SSD");
    }

    @Override
    public Computer getComputer() {
        return new Computer(cpu,ram,storage);
    }
}
