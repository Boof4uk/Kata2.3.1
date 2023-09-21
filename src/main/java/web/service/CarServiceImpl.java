package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carsList;
    private static int CARS_COUNT;

    {
        carsList  = new ArrayList<>();
        carsList.add(new Car("Tesla", 1000000, CARS_COUNT++));
        carsList.add(new Car("Mercedes", 900000, CARS_COUNT++));
        carsList.add(new Car("BMW", 8000000, CARS_COUNT++));
        carsList.add(new Car("KIO", 200000, CARS_COUNT++));
        carsList.add(new Car("Honda", 300000, CARS_COUNT++));
        carsList.add(new Car("VOLVO", 700000, CARS_COUNT++));
    }
    public List<Car> getAllCars() {
        return carsList;
    }

    public List<Car> getSomeCars(Integer count) {
        System.out.println(count);
        List<Car> someCars = new ArrayList<>();
        if(count != null && count < 5 && count > 0) {
            for (int i = 0; i < count; i++ ) {
                someCars.add(getAllCars().get(i));
            }
            return someCars;
        } else {
            return getAllCars();
        }
    }
}
