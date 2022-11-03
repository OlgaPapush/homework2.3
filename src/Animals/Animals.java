package Animals;

import java.util.Objects;

public abstract class Animals {

    private String name;
    private int age;


    public  Animals(String name, int age) {
        if (name == null) {
            this.name = "Животное";
        } else {
            this.name = name;
        }

        if (age == 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }


        public String getName() {    return name;  }

        public void setName(String name) {  this.name = name;  }

        public int getAge() {  return age; }

        public void setAge(int age) {  this.age = age;  }





        public abstract void eat ();
        public abstract void slip ();
        public abstract void moving ();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}






