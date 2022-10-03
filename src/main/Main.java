package main;

import bean.Appliance;
import bean.Computer;
import bean.HomeAppliance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Appliance> appliances = new ArrayList<>();
        appliances.add(new HomeAppliance("Garage"));
        appliances.add(new Computer("bedroom", true,15));

        for (Appliance appliance : appliances ) {

            appliance.setPowerConsumption(220);
            appliance.setProductionYear(2022);
            
        }

    }
}