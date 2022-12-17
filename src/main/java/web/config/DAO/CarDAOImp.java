package web.config.DAO;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAOImp implements CarDAO{
    @Override
    public List<Car> addList() {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Cadillac", "metallic", "TX6"));
        carList.add(new Car("Alpine", "blue", "A110"));
        carList.add(new Car("Alfa Romeo", " black", "159"));
        carList.add(new Car("Ferrari", "red", "Spider"));
        carList.add(new Car("lamborghini", "yellow", "Huracan"));


        return carList;
    }
}
