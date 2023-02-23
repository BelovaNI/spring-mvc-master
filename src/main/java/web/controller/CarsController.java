package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;
import java.util.List;
import java.util.Optional;

@Controller
public class CarsController {
    private CarService carService;
    private java.util.Optional<Integer> optInt;

    public CarsController() {
    }

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String printTable(Integer count, ModelMap model) throws NullPointerException {
            Optional<Integer> optInt = Optional.ofNullable(count);
            Integer value = optInt.orElse(5);
            List<Car> list = carService.getListByCount(value);
            model.addAttribute("table", list);
            return "cars";
    }
}

