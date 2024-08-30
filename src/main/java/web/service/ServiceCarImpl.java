package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServiceCarImpl implements ServiceCar {


    public  List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(" Mazda1", 2000, 55000 ));
        cars.add(new Car(" Mazda2", 2001, 56000 ));
        cars.add(new Car(" Mazda3", 2002, 57000 ));
        cars.add(new Car(" Mazda4", 2003, 58000 ));
        cars.add(new Car(" Mazda5", 2004, 59000 ));
        if (count >= cars.size()) {
            return cars;
        }
        else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
