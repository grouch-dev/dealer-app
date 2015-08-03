package woolcox.dealer.domain;

import java.util.List;

/**
 * Created by Mark on 2015-08-01.
 */
public class Vehicle {
    private int year;
    private String make;
    private String model;

    private VehicleIdentificationNumber vin;
    private List<Option> options;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public VehicleIdentificationNumber getVin() {
        return vin;
    }

    public void setVin(VehicleIdentificationNumber vin) {
        this.vin = vin;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
