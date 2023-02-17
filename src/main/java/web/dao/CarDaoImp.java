package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;
@Repository
public class CarDaoImp implements CarDao{
    @Override
    public List<Car> getListByCount(int count) {
        /*
        Метод, производящий выборку машин
        */
        return null;
    }
}
