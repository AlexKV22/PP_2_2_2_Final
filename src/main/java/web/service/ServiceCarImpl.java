package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceCarImpl implements ServiceCar {
    public  List<Car> getCars(List<Car> cars, int count) {
        if (count >= cars.size()) {
            return cars;
        }
        else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
