package transport;

public class Train extends Transport {


    public Train(String brand, String model, int productionYear, String productionCountry, String color,  double maximumSpeed) {
        super(brand, model, productionYear, productionCountry, color,  maximumSpeed);

    }

    private String departureStantion;
    private String endingStantion;
    private double tripPrice;
    private double timePrice;
    private String stationName;

    private  int numberOfWagons;

    public Train(String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 String color,
                 double maximumSpeed,
                 String departureStantion,
                 String endingStantion,
                 double tripPrice,
                 double timePrice,
                 String stationName,
                 int numberOfWagons) {
        super(brand, model,  productionYear, productionCountry, color, maximumSpeed);
        this.departureStantion = departureStantion;
        this.endingStantion = endingStantion;
        this.tripPrice = tripPrice;
        this.timePrice = timePrice;
        this.stationName = stationName;
        this.numberOfWagons = numberOfWagons;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public double getTimePrice() {
        return timePrice;
    }

    public void setTimePrice(double timePrice) {
        this.timePrice = timePrice;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getDepartureStantion() {
        return departureStantion;
    }

    public void setDepartureStantion(String departureStantion) {
        this.departureStantion = departureStantion;
    }

    public String getEndingStantion() {
        return endingStantion;
    }

    public void setEndingStantion(String endingStantion) {
        this.endingStantion = endingStantion;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public void trainPrint(){

        System.out.println("Поезд "+ getBrand() +
                ",модель " + getModel() +
                ",год выпуска " + getProductionYear() +
                ",страна выпуска " + getProductionCountry() +
                ",скорость передвижения " + getMaximumSpeed() +
                ",отходит от "+ getDepartureStantion() +
                ",следует до " + getEndingStantion() +
                ". Цена поездки " + getTripPrice() +
                ", в поезде " + getNumberOfWagons() + " вагонов.");
    }
    public  void refill(){
        System.out.println("Заправляется дизелем");

    }
}
