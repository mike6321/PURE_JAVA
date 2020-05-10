package me.designpattern.g_builder.step02;

import me.choi.item02.NutritionFactsWithBuilder;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:44 오후
 */
public class ComputerBuilder {
    private final Computer computer;

    private ComputerBuilder() {
        computer = new Computer("default","default","default");
    }


    public static ComputerBuilder start() {
        return new ComputerBuilder();
    }


    public ComputerBuilder setCpu(String cpu) {

        computer.setCpu(cpu);

        return this;
    }

    public ComputerBuilder setRam(String ram) {
        computer.setCpu(ram);
        
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);

        return this;
    }


    public Computer build() {
        return this.computer;
    }
}
