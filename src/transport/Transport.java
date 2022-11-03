package transport;

public abstract class Transport {
    protected   String brand;
    private  String model;
    private  int productionYear;
    private  String productionCountry;

    private String color;
    private double maximumSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color,  double maximumSpeed ) {
        if(brand != null ||  !brand.isEmpty() && !brand.isBlank() ){
        this.brand = brand;}

        if(model != null ||  !model.isEmpty() && !model.isBlank()){
        this.model = model;}

        if(productionCountry != null ||  !productionCountry.isEmpty() && !productionCountry.isBlank()){
        this.productionCountry = productionCountry;}

        if(productionYear != 0){
        this.productionYear = productionYear;}

        if(color != null ||  !color.isEmpty() && !color.isBlank()){
        this.color = color;}
        else {
            this.color = "белый";
        }

        if(productionYear != 0){
            this.maximumSpeed = maximumSpeed;}


    }



    public String getBrand() {   return brand;    }

    public void setBrand(String brand) {  this.brand = brand;    }

    public String getModel() {   return model;    }

    public void setModel(String model) {  this.model = model;    }

    public String getProductionCountry() {  return productionCountry;    }

    public int getProductionYear() {  return productionYear;    }

    public String getColor() {  return color;    }

    public void setColor(String color) {  this.color = color;    }

    public double getMaximumSpeed() {   return maximumSpeed;    }

    public void setMaximumSpeed(double maximumSpeed) {  this.maximumSpeed = maximumSpeed;    }

    public abstract void refill();
}
