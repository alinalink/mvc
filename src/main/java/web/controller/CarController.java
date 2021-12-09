package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printWelcomeCar(@RequestParam(value = "count", defaultValue = "5") int allCars, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "White", 1));
        cars.add(new Car("Toyota", "Green", 2));
        cars.add(new Car("BMW", "Black", 3));
        cars.add(new Car("KIA","Red",4));
        cars.add(new Car("Nissan", "Yellow", 5));
        cars = CarServiseImpl.listCar(cars, allCars);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
