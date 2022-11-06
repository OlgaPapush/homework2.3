package Animals;

import java.util.Objects;

public  class Predators extends Mammals {
    private String typrOfFood;

    public Predators(String name,
                     int age, String livingEnvironment,
                     double travelSpeed, String typrOfFood) {
        super(name, age, livingEnvironment, travelSpeed);

        if (typrOfFood == null || typrOfFood.isEmpty() && !typrOfFood.isBlank()) {
            this.typrOfFood = "Не указано";
        }else{
            this.typrOfFood = typrOfFood;}

    }
    public String getTyprOfFood() {        return typrOfFood;    }

    public void setTyprOfFood(String typrOfFood) {        this.typrOfFood = typrOfFood;    }


    public void hant(){
        System.out.println("Охотиться");}

    @Override
    public void eat() {
        System.out.println("Мясо");

    }

    @Override
    public void slip() {
        System.out.println("На дереве");

    }

    @Override
    public void moving() {
        System.out.println("В стае");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return typrOfFood.equals(predators.typrOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typrOfFood);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() + "livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", travelSpeed=" + getTravelSpeed() +
                "typrOfFood='" + typrOfFood + '\'' +
                '}';
    }
}
