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
        List<Car> returnCars = new ArrayList<>();
        if (count <= cars.size()) {
            for (int i = 0; i < count; i++) {
                returnCars.add(cars.get(i));
            }
        } else if (count >= cars.size()) {
            return cars;
        }
        return returnCars;
    }
}
