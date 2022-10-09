package by.it.academy.hierarhy.bean;

public abstract class Appliance {

    private static final long serialVersionUID = 1l;

    private String producer;
    private int productionYear;
    private double price;
    private double powerConsumption;

    public Appliance() {
    }

    public Appliance(String producer, int productionYear, double price, double powerConsumption) {
        this.producer = producer;
        this.productionYear = productionYear;
        this.price = price;
        this.powerConsumption = powerConsumption;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }


    @Override
    public String toString() {
        return "Appliance{" +
                "producer='" + producer + '\'' +
                ", productionYear=" + productionYear +
                ", price=" + price +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
