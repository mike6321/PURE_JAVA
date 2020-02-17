package me.choi.item02.pizza;

import java.util.Objects;

public class Calzone extends Pizza{
    public enum  Size {SMALL, MEDIUM, LARGE}
    public final  Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        Pizza build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }


    }
    Calzone(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
