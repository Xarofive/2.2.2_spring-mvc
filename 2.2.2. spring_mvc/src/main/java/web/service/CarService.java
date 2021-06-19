package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Opel", "Zafira", 123));
        cars.add(new Car("Audi", "Q3", 256));
        cars.add(new Car("Mercedes", "GLK", 255));
        cars.add(new Car("BMW", "M3", 552));
        cars.add(new Car("Skoda", "Octavia", 355));
    }

    public List<Car> returnCars(int count) {
        switch (count) {
            case 0:
                cars.clear();
                break;
            case 1:
                cars = cars.subList(0, 1);
                break;
            case 2:
                cars = cars.subList(0, 2);
                break;
            case 3:
                cars = cars.subList(0, 3);
                break;
            case 4:
                cars = cars.subList(0, 4);
                break;
            default:
                cars = cars.subList(0, 5);
                break;
        }
        return cars;
    }
}
