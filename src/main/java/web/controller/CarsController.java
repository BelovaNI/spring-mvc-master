package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import web.model.Car;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private CarService carService;
    @Autowired
    public CarsController() {}

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    public Car getCars(int count) {
        Car answer = (Car) carService.getListByCount(count);
        return answer;
    }
    @GetMapping(value = "/cars")//        подключись к сервису с контроллера, создай ручку которая его будет вызывать с параметром
    public String printTable(Integer count, ModelMap model) { //        сделай ручку GET /fillCarts пускай принимает число и заполняет указанным количеством машин таблицу
        List<Car> table = new ArrayList<>();
        table.add(new CarsController().getCars(count));
        model.addAttribute("table", table);
        return "cars";
    }
}
