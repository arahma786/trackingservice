package c322.homework.homework4.partd;

public class TypeCFactory extends MotorHomeAbstractFactory{
    @Override
    public Type createType() {
        return new TypeC();
    }

    @Override
    public Style createStyle() {
        return new TypeCStyle();
    }

    @Override
    public Frame createFrame() {
        return new TypeCFrame();
    }

    @Override
    public Engine createEngine() {
        return new TypeCEngine();
    }

    @Override
    public Kitchen createKitchen() {
        return new TypeCKitchen();
    }
}
