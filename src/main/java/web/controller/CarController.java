package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCar;
import web.service.ServiceCarImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    private ServiceCar serviceCar;

    public CarController(ServiceCarImpl serviceCar) {
        this.serviceCar = serviceCar;
    }


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int sizeCar, ModelMap model) {
        List<Car> cars1 = serviceCar.getCars(sizeCar);
        model.addAttribute("cars", cars1);
        return "carscars";
    }
}
