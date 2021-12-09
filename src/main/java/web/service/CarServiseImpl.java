package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiseImpl implements CarServise {
    public static List<Car> listCar(List<Car> cars, int number) {
        if (number == 0 || number > 5) {
            return cars;
        }
        return cars.stream().limit(number).collect(Collectors.toList());
    }


}
