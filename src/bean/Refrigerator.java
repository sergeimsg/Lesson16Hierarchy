package bean;

import java.util.Objects;

public class Refrigerator extends KitchenAppliance{

    public int size;
    public int height;
    public int width;

    public Refrigerator(String placeToUseAtHome, String purpose, int size, int height, int width) {
        super(placeToUseAtHome, purpose);
        this.size = size;
        this.height = height;
        this.width = width;
    }

    public Refrigerator(String producer, int productionYear, double price, double powerConsumption, String placeToUseAtHome, String purpose, int size, int height, int width) {
        super(producer, productionYear, price, powerConsumption, placeToUseAtHome, purpose);
        this.size = size;
        this.height = height;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return getSize() == that.getSize() && getHeight() == that.getHeight() && getWidth() == that.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSize(), getHeight(), getWidth());
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "size=" + size +
                ", height=" + height +
                ", width=" + width +
                ", purpose='" + purpose + '\'' +
                ", placeToUseAtHome='" + placeToUseAtHome + '\'' +
                ", producer='" + producer + '\'' +
                ", productionYear=" + productionYear +
                ", price=" + price +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
