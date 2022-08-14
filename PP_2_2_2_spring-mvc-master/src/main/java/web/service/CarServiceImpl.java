package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Karona Bashkatova.
 */
@Component
public class CarServiceImpl implements CarService {

private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Model1", 1, "black"));
        cars.add(new Car("Model2", 2, "red"));
        cars.add(new Car("Model3", 3, "white"));
        cars.add(new Car("Model4", 4, "blue"));
        cars.add(new Car("Model5", 5, "grey"));
    }

    @Override
    public List<Car> showCars() {
        return cars;
    }

    @Override
    public List<Car> showNumberOfCars(Integer count) {
        if (count < cars.size()) {
            return cars.stream().limit(count).collect(Collectors.toList());
        } else {
            return cars;
        }
    }


}
