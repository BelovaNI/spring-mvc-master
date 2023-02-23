package web.dao;
import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getListByCount(Integer count) { // Метод, производящий выборку машин
        List<Car> list = new ArrayList<>();
        list.add(new Car(1922, "Cabriolet", "J-8"));
        list.add(new Car(2005, "Lada", "Granta"));
        list.add(new Car(2022, "Toyota", "Suprim"));
        list.add(new Car(2050, "Nissan", "Future"));
        list.add(new Car(3050, "Element", "5"));
        return  list.subList(0, count);
    }
}
