package HWL10;

public class Bicycle extends Vehicle {
    public final int id;

    protected int gear;

    public Bicycle() {
        id = 0;
        System.out.println("Bicycle1");
    }

    public Bicycle(int id, int gear) {
        this.id = id;
        this.gear = gear;
        System.out.println("Bicycle2");
    }

    public void changeGear(int value) {
        this.gear = value;
        System.out.println("changeGear");

    }

   public void move() {
        super.move();
        System.out.println("moveBicycle");
    }
}
