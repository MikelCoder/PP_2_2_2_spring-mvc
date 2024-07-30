package service;

import model.Car;

import java.util.List;

public interface CarServiceInterface {
    List<Car> getCars(int count);
}