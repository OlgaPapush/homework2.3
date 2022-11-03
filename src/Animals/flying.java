package Animals;

import java.util.Objects;

public class flying extends birds{

        private String typrOfFood;

        public flying (String name, int age, String livingEnvironment, String typrOfFood) {
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
        public void moving() {
            System.out.println("летают");
        }
        public void fly(){
            System.out.println("Перемещаться на крыльях по воздуху");
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        flying flying = (flying) o;
        return typrOfFood.equals(flying.typrOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typrOfFood);
    }

    @Override
    public String toString() {
        return "flying{"  +
                "name='" + getName() + '\'' +
                ", age=" + getAge() + "livingEnvironment='" +
                "typrOfFood='" + typrOfFood + '\'' +
                '}';
    }
}
