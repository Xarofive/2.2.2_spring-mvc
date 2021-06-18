package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarContoller {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Opel", "Zafira", 123));
        cars.add(new Car("Audi", "Q3", 256));
        cars.add(new Car("Mercedes", "GLK", 255));
        cars.add(new Car("BMW", "M3", 552));
        cars.add(new Car("Skoda", "Octavia", 355));

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
        model.addAttribute("cars", cars);
        return "cars";
    }
}
