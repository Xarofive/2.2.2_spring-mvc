package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceIml;

@Controller
public class CarContoller {

    private final CarServiceIml carServiceIml;

    @Autowired
    public CarContoller(CarServiceIml carServiceIml) {
        this.carServiceIml = carServiceIml;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carServiceIml.allCars(count));
        return "cars";
    }
}
