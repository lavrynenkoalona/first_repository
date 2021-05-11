package HWL10;

public class Vehicle {

    int speed;
    private String model;

    void speedUp(int value) {
        speed += value;
        System.out.println("new speed =" + speed);
    }

    void applyBrake(int value) {
        speed -= value;
        System.out.println("speed after brake=" + speed);
    }

    public void setModel(String model) {
        this.model = model;
        System.out.printf("new model =%s%n", model);
    }

    public String getModel() {
        return model;
    }

    public void move() {
        System.out.println("moveVehicle");
    }

    final void stop() {
        speed = 0;
        System.out.println("stop");
    }

}




