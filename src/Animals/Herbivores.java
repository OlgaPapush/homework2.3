package Animals;


import java.util.Objects;

public class Herbivores extends Mammals {

    private String typrOfFood;

    public Herbivores(String name,
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


    public void feed(){
        System.out.println("Пастись");}

    @Override
    public void eat() {
        System.out.println("Траву");

    }

    @Override
    public void slip() {
        System.out.println("Стоя");

    }

    @Override
    public void moving() {
        System.out.println("На четырех ногах");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return typrOfFood.equals(that.typrOfFood);
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


