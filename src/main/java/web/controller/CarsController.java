package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private CarService carService;

    public CarsController() {
    }

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String printTable(Integer count, ModelMap model) throws NullPointerException{
        try {
            if (count == null) {
                List<Car> list = carService.getListByCount(5);
                model.addAttribute("table", list);
                return "cars";
            }else {
                List<Car> list = carService.getListByCount(count);
                model.addAttribute("table", list);
                return "cars";
            }
        }catch (Exception e) {
            throw e;
        }
    }
}
