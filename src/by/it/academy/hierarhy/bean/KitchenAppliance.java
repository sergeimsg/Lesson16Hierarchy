package by.it.academy.hierarhy.bean;

import java.util.Objects;

public class KitchenAppliance extends HomeAppliance{

    private static final long serialVersionUID = 1l;

    private String purpose;



    public KitchenAppliance(String producer, int productionYear, double price, double powerConsumption, String placeToUseAtHome, String purpose) {
        super(producer, productionYear, price, powerConsumption, placeToUseAtHome);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KitchenAppliance)) return false;
        if (!super.equals(o)) return false;
        KitchenAppliance that = (KitchenAppliance) o;
        return Objects.equals(getPurpose(), that.getPurpose());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPurpose());
    }


    @Override
    public String toString() {
        return "KitchenAppliance{" +
                "purpose='" + purpose + '\'' +
                '}';
    }
}
