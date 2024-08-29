package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCarImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int sizeCar, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(" Mazda1", 2000, 55000 ));
        cars.add(new Car(" Mazda2", 2001, 56000 ));
        cars.add(new Car(" Mazda3", 2002, 57000 ));
        cars.add(new Car(" Mazda4", 2003, 58000 ));
        cars.add(new Car(" Mazda5", 2004, 59000 ));
        cars = new ServiceCarImpl().getCars(cars, sizeCar);
        model.addAttribute("cars", cars);
        return "carscars";
    }
}
