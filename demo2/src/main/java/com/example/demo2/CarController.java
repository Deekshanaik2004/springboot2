package com.example.demo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CarController {
private final CarService carService;
@Autowired
public CarController(CarService carService) {
this.carService = carService;
}
@GetMapping("/start")
public String startCar() {
carService.startCar();
return "Car started!";
}
}