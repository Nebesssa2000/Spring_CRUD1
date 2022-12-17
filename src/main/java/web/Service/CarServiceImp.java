package web.Service;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@Service
public class CarServiceImp implements CarService {
// list сюда
    @Override
    public List<Car> getCarCount(List<Car> carList, int count) {
        return (count == 0 || count > 5) ? carList
                : carList.stream().limit(count).
                collect(Collectors.toList());

    }
}
