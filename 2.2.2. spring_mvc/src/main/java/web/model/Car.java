package web.model;

import java.util.Objects;

public class Car {

    private Long id;
    private String manufacturer;
    private String model;
    private Integer registrationNumber;

    public Car(Long id, String manufacturer, String model, Integer registrationNumber) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    public Car() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(manufacturer, car.manufacturer) && Objects.equals(model, car.model) && Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manufacturer, model, registrationNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", registrationNumber=" + registrationNumber +
                '}';
    }
}
