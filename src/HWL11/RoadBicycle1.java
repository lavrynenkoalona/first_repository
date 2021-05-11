package HWL11;
//Task1
public class RoadBicycle1 extends Bicycle1 implements Shop {

    private int rudderDepth;


    void speedUp(int value) {
        speed += value;
        System.out.println("new speed =" + speed);
    }

    public void setModel(String model) {
        this.model = model;
        System.out.printf("new model =%s%n", model);
    }


    public void changeGear(int value) {
        this.gear = value;
        System.out.println("changeGear");

    }

    public int getRudderDepth() {
        return rudderDepth;
    }

    public void setRudderDepth(int rudderDepth) {
        this.rudderDepth = rudderDepth;
    }

    @Override
    public void byeShoes() {
        System.out.println("sneakers");
    }

    @Override
    public void byeTShots() {
        System.out.println("T-short");
    }

    @Override
    public void byeWeapon() {
        System.out.println("rifle");
    }
}
