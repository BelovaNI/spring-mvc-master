package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printTable(ModelMap model) {

//        подключись к сервису с контроллера, создай ручку которая его будет вызывать с параметром

        return "cars";
    }
}
