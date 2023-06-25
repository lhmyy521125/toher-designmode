package com.design.toher.template;

/**
 * 化妆抽象类 定义了化妆的步骤
 * @author mac
 */
public abstract class MakeupTemplate {
    public final void doMakeup() {
        washFace();
        applyFoundation();
        doEyeMakeup();
        doBlushMakeup();
        applyLipstick();
    }
    //洁面
    protected abstract void washFace();

    //涂抹粉底
    protected abstract void applyFoundation();

    //眼妆
    protected abstract void doEyeMakeup();

    //腮红
    protected abstract void doBlushMakeup();

    //口红
    protected abstract void applyLipstick();
}
