package web.Service;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import web.Model.Car;
import web.DAO.CarDAO;

import java.util.List;

@Getter
@Setter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Service
public class CarServiceImp implements CarService {
    CarDAO carDAO;

    public CarServiceImp(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> addList() {
        return carDAO.addList();
    }

    @Override
    public List<Car> getCarCount(int count) {
        return carDAO.getCarCount(carDAO.addList(), count);

    }
}
