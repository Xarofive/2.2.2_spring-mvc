package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    private final List<Car> carList;

    public CarDaoImpl() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1L,"Opel", "Zafira", 123));
        carList.add(new Car(2L,"Audi", "Q3", 256));
        carList.add(new Car(3L,"Mercedes", "GLK", 255));
        carList.add(new Car(4L,"BMW", "M3", 552));
        carList.add(new Car(5L,"Skoda", "Octavia", 355));
        this.carList = carList;
    }

    @Override
    public List<Car> allCars(int count) {
        List<Car> returnCars = new ArrayList<>();
        if (count <= carList.size()) {
            for (int i = 0; i < count; i++) {
                returnCars.add(carList.get(i));
            }
        } else {
            return carList;
        }
        return returnCars;
    }
}
