package Animals;

import java.util.Objects;

public abstract class mammals extends Animals {

    private String livingEnvironment;
    private double travelSpeed;

    public mammals(String name, int age, String livingEnvironment, double travelSpeed) {
        super(name, age);

        if (livingEnvironment == null || livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = "Не указано";
        }else{
        this.livingEnvironment = livingEnvironment;}

        if (travelSpeed == 0) {
            this.travelSpeed = 0;
        }else{
            this.travelSpeed = travelSpeed;}

    }

    public String getLivingEnvironment() {        return livingEnvironment;    }

    public void setLivingEnvironment(String livingEnvironment) {        this.livingEnvironment = livingEnvironment;    }

    public double getTravelSpeed() {        return travelSpeed;    }

    public void setTravelSpeed(double travelSpeed) {        this.travelSpeed = travelSpeed;    }

    public  void walk() {
    }

    @Override
    public void eat() {
    }

    @Override
    public void slip() {
    }

    @Override
    public void moving() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        mammals mammals = (mammals) o;
        return Double.compare(mammals.travelSpeed, travelSpeed) == 0 && livingEnvironment.equals(mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment, travelSpeed);
    }

    @Override
    public String toString() {
        return "mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", travelSpeed=" + travelSpeed +
                '}';
    }
}
