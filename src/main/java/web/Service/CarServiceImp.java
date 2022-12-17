package web.Service;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import web.Model.Car;
import web.config.DAO.CarDAO;
import web.config.DAO.CarDAOImp;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@Service
public class CarServiceImp implements CarService {
    CarDAO carDAO = new CarDAOImp();

    @Override
    public List<Car> addList() {
        return carDAO.addList();
    }

    // list сюда
    @Override
    public List<Car> getCarCount(List<Car> carList, int count) {
        return carDAO.getCarCount(carList, count);

    }
}
