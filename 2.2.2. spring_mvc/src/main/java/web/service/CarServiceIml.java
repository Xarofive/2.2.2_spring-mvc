package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceIml implements CarService{

    private final CarDaoImpl carDao;

    @Autowired
    public CarServiceIml(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> allCars(int count) {
        List<Car> returnCars = carDao.allCars(count);
        System.out.println("Получен список всех машин");
        return returnCars;
    }
}
