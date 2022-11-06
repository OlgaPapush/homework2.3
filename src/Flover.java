public class Flover {
    public String name;
    private String country;
    private double cost;
    public int lifeSpan;
    private String flowerColor;



    public Flover(String name, String country, double cost, int lifeSpan, String flowerColor) {
        this.name = name;

        if (country == null || country.isEmpty() && country.isBlank()) {
            this.country = "Russia";
        }else{
            this.country = country;
        }


        if (cost == 0 || cost <= 0) {
            this.cost = 1;
        }else{
            this.cost = cost;
        }


        if (lifeSpan == 0 || lifeSpan < 0) {
            this.lifeSpan = 3;
        }


        if (flowerColor != null) {
            this.flowerColor = flowerColor;
        }else{
            this.flowerColor = "белый";
        }

                    }

    public String getName () {
                return name;
            }

            public String getFlowerColor () {
                return flowerColor;
            }

            public String getCountry () {
                return country;
            }

            public double getCost () {
                return cost;
            }

            public int getLifeSpan () {
                return lifeSpan;
            }

            public void setName (String name){
                this.name = name;
            }

            public void setFlowerColor (String flowerColor){
                this.flowerColor = flowerColor;
            }

            public void setCountry (String country){
                if (country == null || country.isEmpty() && country.isBlank()) {
                    this.country = "Russia";
                }else{
                    this.country = country;
                }
            }

            public void setCost ( float cost){
                if (cost == 0 || cost <= 0) {
                    this.cost = 1;
                }else{
                    this.cost = cost;
                }
            }

            public void setLifeSpan ( int lifeSpan) {
                this.lifeSpan = lifeSpan;
            }

    @Override
    public String toString() {
        return "Flover{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                ", flowerColor='" + flowerColor + '\'' +
                '}';
    }
}
