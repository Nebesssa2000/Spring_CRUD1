package web.controller;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarServiceImp;
import web.config.DAO.CarDAO;
import web.config.DAO.CarDAOImp;

import java.util.ArrayList;
import java.util.List;

@Data
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Controller
public class CarController {

    CarDAO carDAO = new CarDAOImp();
    CarServiceImp serviceImp = new CarServiceImp();
// сервис через @autowired

    @GetMapping("/car")
    public String returnCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List

        carList = serviceImp.getCarCount(carDAO.addList(), count);
        model.addAttribute("carList", carList);

        return "Cars/cars";
    }
}
