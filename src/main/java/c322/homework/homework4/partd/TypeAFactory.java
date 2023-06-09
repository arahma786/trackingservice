package c322.homework.homework4.partd;

public class TypeAFactory extends MotorHomeAbstractFactory{
    @Override
    public Type createType() {
        return new TypeA();
    }

    @Override
    public Style createStyle() {
        return new TypeAStyle();
    }

    @Override
    public Frame createFrame() {
        return new TypeAFrame();
    }

    @Override
    public Engine createEngine() {
        return new TypeAEngine();
    }

    @Override
    public Kitchen createKitchen() {
        return new TypeAKitchen();
    }
}
