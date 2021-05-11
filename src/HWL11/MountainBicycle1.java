package HWL11;
//Task1
public class MountainBicycle1 extends Bicycle1 implements Accessories {
    private int seatHeight;

    void speedUp(int value) {
        speed += value;
        System.out.println("speed =" + speed);
    }

    public void setModel(String model) {
        this.model = model;
        System.out.printf("model =%s%n", model);
    }



    public void changeGear(int value) {
        this.gear = value;
        System.out.println("changeGear");

    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public void toolsKit() {
        System.out.println("Tools");
    }

    @Override
    public void pump() {
        System.out.println("compressor");
    }

    @Override
    public void mobilePhoneHolder() {
        System.out.println("mobilePhoneHolder for bicycle");
    }
}
