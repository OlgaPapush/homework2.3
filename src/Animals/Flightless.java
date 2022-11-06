package Animals;


import java.util.Objects;

public class Flightless extends Birds {

    private String typrOfFood;

    public Flightless(String name, int age, String livingEnvironment, String typrOfFood) {
        super(name, age, livingEnvironment);
        if (typrOfFood == null || typrOfFood.isEmpty() && !typrOfFood.isBlank()) {
            this.typrOfFood = "Не указано";
        } else {
            this.typrOfFood = typrOfFood;
        }
    }

    public String getTyprOfFood() {
        return typrOfFood;
    }

    public void setTyprOfFood(String typrOfFood) {
        this.typrOfFood = typrOfFood;
    }
    @Override
    public void eat() {
        System.out.println("мясо, зерно");
    }

    @Override
    public void slip() {
        System.out.println("в гнезде");
    }

    @Override
    public void moving() {System.out.println("по земле");
    }
    public void work(){
        System.out.println("Перемещаться на ногах по земле");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return typrOfFood.equals(that.typrOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typrOfFood);
    }

    @Override
    public String toString() {
        return "flightless{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() + "livingEnvironment='" +
                "typrOfFood='" + typrOfFood + '\'' +
                '}';
    }
}
