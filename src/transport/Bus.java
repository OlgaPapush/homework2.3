package transport;

import transport.Transport;

public class Bus extends Transport {
    public Bus ( String brand, String model, int productionYear, String productionCountry, String color,  double maximumSpeed){
        super(brand, model, productionYear, productionCountry, color,  maximumSpeed);

    }
    public void busPrint(){

        System.out.println("Автобус "+ getBrand() +
                ",модель " + getModel() +
                ",год выпуска " + getProductionYear() +
                ",страна выпуска " + getProductionCountry() +
                ", цвет кузова " +  getColor() +
                ",скорость передвижения " + getMaximumSpeed());
    }
    public   void refill(){
        System.out.println("Можно заправлять: бензином, дизелем на заправках" );

    }



}
