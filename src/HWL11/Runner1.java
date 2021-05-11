package HWL11;

import HWL10.Bicycle;
import HWL10.MountainBicycle;
import HWL10.RoadBicycle;

public class Runner1 {
    public static void main(String[] args) {
        Accessories a = new MountainBicycle1();
        a.pump();
        Shop shop = new RoadBicycle1();
        shop.byeShoes();


        RoadBicycle1 roadBicycle1 = new RoadBicycle1();
        roadBicycle1.speedUp(100);
        System.out.println("speed:" + roadBicycle1.speed);
        roadBicycle1.setModel("sedan");
        System.out.println("model:" + roadBicycle1.model);

        MountainBicycle1 mountainBicycle1 = new MountainBicycle1();
        mountainBicycle1.applyBrake(10);
        System.out.println("speed:" + mountainBicycle1.speed);
        System.out.println("speed:" + mountainBicycle1.getModel());

        mountainBicycle1.changeGear(500);
        System.out.println("new gear:" + mountainBicycle1.gear);
        roadBicycle1.speedUp(20);
        System.out.println("new speed:" + roadBicycle1.speed);

        System.out.println("rudderDepth" + roadBicycle1.getRudderDepth());
        roadBicycle1.setRudderDepth(100);
        System.out.println("rudderDepth after set" + roadBicycle1.getRudderDepth());

        System.out.println("seatHeight:" + mountainBicycle1.getSeatHeight());
        mountainBicycle1.setSeatHeight(60);
        System.out.println("seatHeight after set:" + mountainBicycle1.getSeatHeight());

    }
}
