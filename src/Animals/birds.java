package Animals;

import java.util.Objects;

public abstract class birds extends Animals{

    private String livingEnvironment;

    public birds(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = "Не указано";
        }else{
            this.livingEnvironment = livingEnvironment;}
    }

    public  void hunt() {
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
        if (!super.equals(o)) return false;
        birds birds = (birds) o;
        return livingEnvironment.equals(birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
