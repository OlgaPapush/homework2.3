package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, double engineVolume, String color, double maximumSpeed) {
        super(brand, model, productionYear, productionCountry, engineVolume, color, maximumSpeed);
    }


    public void busPrint() {

        System.out.println("Автобус " + getBrand() +
                ",модель " + getModel() +
                ",год выпуска " + getProductionYear() +
                ",страна выпуска " + getProductionCountry() +
                ", цвет кузова " + getColor() +
                ",скорость передвижения " + getMaximumSpeed());
    }

    public void refill() {
        System.out.println("Можно заправлять: бензином, дизелем на заправках");
    }

    @Override
    public void startMoving() {
        System.out.println(getBrand() + " " + getModel() + "начинает движение");
    }

    @Override
    public void finishtMoving() {
        System.out.println(getBrand() + " " + getModel() + "заканчивает движение");

    }


}
