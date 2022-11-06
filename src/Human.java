public class Human {

    public String name;
    private Integer yearOfBirth;
    private String town;
    public String job;

    Human(String name, String town, Integer yearOfBirth, String job) {

        if (this.name == null) {
            this.name = " no info";
        } else {
            this.name = name;

            if (town != null || !town.isEmpty() && !town.isBlank()) {
                this.town = town;
            } else {
                this.town = "no info";
            }

            if (yearOfBirth != 0 || yearOfBirth >= 0) {
                this.yearOfBirth = yearOfBirth;
            } else {
                this.yearOfBirth = 0;
            }

            if (this.job == null) {
                this.job = " no info";
            } else {
                this.job = job;
            }
        }
    }

    public int getYearOfBirth() {
        if (yearOfBirth != 0 || yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null || !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "no info";
        }
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", town='" + town + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
