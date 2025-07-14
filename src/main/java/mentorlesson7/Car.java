package mentorlesson7;

public class Car {
    private String model;
    private Manufacturer manufacturer;
    private int productionYear;
    private float engineSize;
    private String fuelType;
    private int price;

    public Car(String model, Manufacturer manufacturer, int productionYear, float engineSize, String fuelType, int price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.price = price;
    }

    // Getter Methods
    public String getModel() {
        return model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isLuxury() {
        return price > 40000;
    }

    // I customized the to String method
    @Override
    public String toString() {
        return model + " | " + manufacturer.getName() + " | " + productionYear + " " +
                "| " + engineSize + "L" + " | " + fuelType + " | "
                + "$" + (double) price / 1000 + "K";
    }
}
