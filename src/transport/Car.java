package transport;

import java.time.LocalDate;

public class  Car extends Transport {

    private double engineVolume;


    private final String transmision;

    private String bodyType;
    private String registrationNumber;
    private final Integer numberOfSeats;
    private boolean summerTipe;
    private Key key;
    private Insurance insurance;


    public Car( String brand,
                String model,
                String productionCountry,
                String color,
                double engineVolume,
                int productionYear,
               String transmision,
               String bodyType,
               String registrationNumber,
               Integer numberOfSeats,
               boolean summerTipe,
               Key key,
               Insurance insurance,
                double maximumSpeed) {

        super (brand,  model, productionYear, productionCountry,  color,   maximumSpeed);

        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = insurance;
        } else {
            this.insurance =insurance;
        }

        this.transmision = transmision;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.summerTipe = summerTipe;


    }



    public static Key getKey() {
        return Car.getKey();
    }

    public static Insurance getInsurance() {
        return Car.getInsurance();
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmision() {
        return transmision;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTipe() {
        return summerTipe;
    }

    public void setSummerTipe(boolean summerTipe) {
        this.summerTipe = summerTipe;
    }


    public void carPrint() {
        System.out.println( "Car" +
                "brand='" + getBrand() +
                ", model='" + getModel() +
                ", engineVolume=" + getEngineVolume() +
                ", color='" + getColor() +
                ", productionCountry='" + getProductionCountry() +
                ", productionYear=" + getProductionYear() +
                ", transmision='" + getTransmision() +
                ", bodyType='" + getBodyType() +
                ", registrationNumber='" + getRegistrationNumber() +
                ", numberOfSeats=" + getNumberOfSeats() );
    }


    public void seasonalTipe() {
        summerTipe = !summerTipe;
    }

    public boolean controlRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;

    }

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validity;
        private final double cost;
        private final String number;

        public Insurance(LocalDate validity, double cost, String number) {
            if (validity == null) {
                this.validity = LocalDate.now().plusDays(365);
            } else {
                this.validity = validity;
            }

            this.cost = cost;

            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public LocalDate getValidity() {
            return validity;
        }

        public  double getCost() {
            return cost;
        }

        public  String getNumber() {
            return number;
        }


        public void checExpireDate() {
            if (validity.isBefore(LocalDate.now()) || validity.isEqual(LocalDate.now())) {
                System.out.println("менять страховку");
            }
        }

        public void controlNumber() {
            if (number.length() != 9) {
                System.out.println("Ошибка");
            }
        }

    }
    public  void refill(){
        System.out.println("Автомобиль можно запрвлять: бензином, дизелем на заправках или заряжать на специальных электрозаправках, это если это электрокар");}


}
