package by.it.academy.hierarhy.main;

import by.it.academy.hierarhy.bean.Appliance;
import by.it.academy.hierarhy.bean.Computer;
import by.it.academy.hierarhy.bean.HomeAppliance;

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

            System.out.println(appliance);
            
        }

    }
}