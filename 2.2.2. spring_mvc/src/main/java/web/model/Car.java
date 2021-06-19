package web.model;

public class Car {

    private String manufacturer;
    private String model;
    private int registrationNumber;

    public Car(String manufacturer, String model, int registrationNumber) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    public Car() {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
