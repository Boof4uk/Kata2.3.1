package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller

public class CarsController {

    private final CarServiceImpl carDAOImpl;

    @Autowired
    public CarsController(CarServiceImpl carDAOImpl) {
        this.carDAOImpl = carDAOImpl;
    }

    @GetMapping("/cars")
    public String printCars(Model model, @RequestParam(value = "count", required = false) Integer count) {
        System.out.println(count == null);
        model.addAttribute("carsList", carDAOImpl.getSomeCars(count));
        return "/cars";
    }
}
