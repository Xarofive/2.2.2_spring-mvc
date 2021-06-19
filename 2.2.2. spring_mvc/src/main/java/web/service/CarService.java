package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


//Задание:
//        1. Создайте еще один контроллер, замаппленный на /cars.
//        2. Создайте модель Car с тремя произвольными полями.
//        3. Создайте список из 5 машин.
//4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
//        5. Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
//        6. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
//        при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.

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
