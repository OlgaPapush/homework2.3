package Transport;

public class Train extends Transport {
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
                 double engineVolume,
                 String color,
                 double maximumSpeed,
                 String departureStantion,
                 String endingStantion,
                 double tripPrice,
                 double timePrice,
                 String stationName,
                 int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, engineVolume, color, maximumSpeed);

        if (departureStantion != null || !departureStantion.isEmpty() && !departureStantion.isBlank()) {
            this.departureStantion = departureStantion;
        }else{
            System.out.println("No info");
        }

        if (endingStantion != null || !endingStantion.isEmpty() && !endingStantion.isBlank()) {
            this.endingStantion = endingStantion;
        }else{
            System.out.println("No info");
        }

        if (tripPrice != 0) {
            this.tripPrice = tripPrice;
        }else{
            System.out.println("No info");
        }

        if (timePrice != 0) {
            this.timePrice = tripPrice;
        }else{
            System.out.println("No info");
        }

        if (stationName != null || !stationName.isEmpty() && !stationName.isBlank()) {
            this.stationName = endingStantion;
        }else{
            System.out.println("No info");
        }
        if (numberOfWagons != 0) {
            this.numberOfWagons = numberOfWagons;
        }else{
            System.out.println("No info");
        }

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

    @Override
    public void startMoving() {
        System.out.println(getBrand() + " " + getModel() + "начинает движение");

    }

    @Override
    public void finishtMoving() {
        System.out.println(getBrand() + " " + getModel() + "заканчивает движение" );

    }

    public  void refill(){
        System.out.println(getBrand() + " " + getModel() + " заправляется дизелем");

    }
}
