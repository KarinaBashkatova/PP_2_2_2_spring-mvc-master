package web.service;

import web.model.Car;

import java.util.List;

/**
 * @author Karina Bashkatova.
 */
public interface CarService {

    List<Car> showCars();
    List<Car> showNumberOfCars(Integer count);
}
