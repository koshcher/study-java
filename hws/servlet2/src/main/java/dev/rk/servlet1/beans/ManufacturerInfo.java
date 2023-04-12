package dev.rk.servlet1.beans;

import java.util.Arrays;
import java.util.List;

public class ManufacturerInfo {
    private final String name = "LENOVO";
    private final String country = "China";
    private final String logoUrl = "https://logos-world.net/wp-content/uploads/2022/07/Lenovo-Logo.jpg";
    private final int employeesCount = 57_000;
    private final String description = "Lenovo: tech giant known for its reliable and innovative products, from laptops to smartphones, dominating the global market with its cutting-edge technology and user-centric design philosophy.";

    public String getName() {
        return name;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    public String getLogoUrl() {
        return logoUrl;
    }
}