package com.design.toher.decorator;

public abstract class MakeupDecorator implements Makeup {
    protected Makeup makeup;

    public MakeupDecorator(Makeup makeup) {
        this.makeup = makeup;
    }

    @Override
    public void apply() {
        makeup.apply();
    }
}
