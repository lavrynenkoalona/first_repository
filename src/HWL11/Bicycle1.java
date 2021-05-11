package HWL11;

public abstract class Bicycle1 extends Vehicle1 {
    public int id;
    protected int gear;

    abstract public void changeGear(int value);

    public void move() {
        System.out.println("moveBicycle");
    }
}