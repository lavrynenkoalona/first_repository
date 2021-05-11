package HWL10;

import HW9.Worker;

public class Runner {
    //Task2
    public static void main(String[] args) {
        RoadBicycle roadBicycle = new RoadBicycle();
        System.out.println("rudderDepth" + roadBicycle.getRudderDepth());
        roadBicycle.setRudderDepth(100);
        System.out.println("rudderDepth after set" + roadBicycle.getRudderDepth());

        MountainBicycle mountainBicycle = new MountainBicycle();
        System.out.println("seatHeight:" + mountainBicycle.getSeatHeight());
        mountainBicycle.setSeatHeight(60);
        System.out.println("seatHeight after set:" + mountainBicycle.getSeatHeight());

        mountainBicycle.changeGear(500);
        System.out.println("new gear:" + mountainBicycle.gear);
        roadBicycle.speedUp(20);
        System.out.println("new speed:" + roadBicycle.speed);

        MountainBicycle mountainBicycle1 = new MountainBicycle();
        System.out.println(mountainBicycle1.id);

//Task3
        Bicycle bicycle1 = new Bicycle(10, 20);
        Bicycle bicycle2 = new Bicycle();
        bicycle1.move();
//Task4
        Helicopter helicopter1 = new Helicopter();
        Helicopter helicopter2 = new Helicopter();

        System.out.println(helicopter1.equals(helicopter2));
        System.out.println(helicopter1.equals(helicopter1));
        System.out.println(helicopter2.equals(helicopter2));
        System.out.println(helicopter2.equals(helicopter1));
        System.out.println("========================================");
        System.out.println(helicopter2 == helicopter1);
        System.out.println(helicopter2 == helicopter2);
        System.out.println(helicopter1 == helicopter1);
        System.out.println(helicopter1 == helicopter2);
        System.out.println("========================================");
        RoadBicycle roadBicycle1 = new RoadBicycle();
        RoadBicycle roadBicycle2 = new RoadBicycle();

        System.out.println(roadBicycle1.equals(roadBicycle2));
        System.out.println(roadBicycle1.equals(roadBicycle1));
        System.out.println(roadBicycle2.equals(roadBicycle2));
        System.out.println(roadBicycle2.equals(roadBicycle1));
        System.out.println("========================================");
        System.out.println(roadBicycle2 == roadBicycle1);
        System.out.println(roadBicycle2 == roadBicycle2);
        System.out.println(roadBicycle1 == roadBicycle1);
        System.out.println(roadBicycle1 == roadBicycle2);

//Task5
        Car.carType = "pickup";
        Car.transmission = "automatic";
        System.out.println("Car Type:" + Car.carType);
        System.out.println("Transmission:" + Car.transmission);
    }
}
