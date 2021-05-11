package HWL10;

import java.util.Objects;

public class Helicopter extends Vehicle {

    int ampountOfPasangers;
    int maxheight;
    int tankSize;

    public void move() {
        System.out.println("moveHelicopter");
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "ampountOfPasangers=" + ampountOfPasangers +
                ", maxheight=" + maxheight +
                ", tankSize=" + tankSize +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(ampountOfPasangers, maxheight, tankSize);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Helicopter)) return false;
        Helicopter that = (Helicopter) o;
        return ampountOfPasangers == that.ampountOfPasangers && maxheight == that.maxheight && tankSize == that.tankSize;
    }
}
