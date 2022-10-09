package by.it.academy.hierarhy.bean;


import java.util.Objects;

public class HomeAppliance extends Appliance {
    private static final long serialVersionUID = 1l;

    private String placeToUseAtHome;


    public HomeAppliance(String placeToUseAtHome) {
        this.placeToUseAtHome = placeToUseAtHome;
    }


    public HomeAppliance(String producer, int productionYear, double price, double powerConsumption, String placeToUseAtHome) {
        super(producer, productionYear, price, powerConsumption);
        this.placeToUseAtHome = placeToUseAtHome;
    }

    public String getPlaceToUseAtHome() {
        return placeToUseAtHome;
    }

    public void setPlaceToUseAtHome(String placeToUseAtHome) {
        this.placeToUseAtHome = placeToUseAtHome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HomeAppliance)) return false;
        HomeAppliance that = (HomeAppliance) o;
        return Objects.equals(getPlaceToUseAtHome(), that.getPlaceToUseAtHome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlaceToUseAtHome());
    }

    @Override
    public String toString() {
        return "HomeAppliance{" +
                "placeToUseAtHome='" + placeToUseAtHome + '\'' +
                '}';
    }
}
