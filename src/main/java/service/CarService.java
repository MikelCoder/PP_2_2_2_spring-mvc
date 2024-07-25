package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Corolla", 2020));
        carList.add(new Car("Honda", "Civic", 2019));
        carList.add(new Car("Ford", "Focus", 2018));
        carList.add(new Car("Chevrolet", "Malibu", 2017));
        carList.add(new Car("Nissan", "Altima", 2021));
    }

    public List<Car> getCars(int count) {
        if (count >= carList.size() || count <= 0) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
