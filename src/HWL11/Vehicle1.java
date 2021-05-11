package HWL11;
//Task1
//Task2
public abstract class Vehicle1 {
    protected int speed;
    protected String model;

    abstract void speedUp(int value);


    abstract public void setModel(String model);

    abstract public void move();

    final void stop() {
        speed = 0;
        System.out.println("stop");
    }

    void applyBrake(int value) {
        speed -= value;
        System.out.println("speed after brake=" + speed);
    }

    public String getModel() {
        return model;
    }
}
