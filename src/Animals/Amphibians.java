package Animals;

import java.util.Objects;

public  class Amphibians extends Animals{
    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);

        if (livingEnvironment == null || livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = "Не указано";
        }else{
            this.livingEnvironment = livingEnvironment;}

    }

    public String getLivingEnvironment() {        return livingEnvironment;    }

    public void setLivingEnvironment(String livingEnvironment) {        this.livingEnvironment = livingEnvironment;    }

    public  void hunt(){
        System.out.println("В воде");
    }

    @Override
    public void eat() {
        System.out.println("Питаться насекомыми, рыбой и мелкими земноводными");
    }
    @Override
    public void slip() {
        System.out.println("Спать днем, а так же в зимнее время года");
    }

    @Override
    public void moving() {
        System.out.println("Передвигаться в пределах отвденного водоема");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return livingEnvironment.equals(that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
            }



    @Override
    public String toString() {
    return "amphibians{" +
        "name='" + getName() + '\'' +
                ", age=" + getAge() +
    "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
