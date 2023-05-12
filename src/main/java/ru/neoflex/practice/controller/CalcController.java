package ru.neoflex.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.neoflex.practice.CalcData;
import ru.neoflex.practice.CalcRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class CalcController {

    @Autowired
    private CalcRepository calcRepository;

    @GetMapping("/plus/{a}/{b}")
    public int Summing(@PathVariable("a") int a, @PathVariable("b") int b){
        CalcData calculation = new CalcData("Summing", a, b, a + b);
        calcRepository.save(calculation);

        return a + b;
    }

    @GetMapping("/minus/{a}/{b}")
    public int Subtraction(@PathVariable("a") int a, @PathVariable("b") int b){
        CalcData calculation = new CalcData("Subtraction", a, b, a - b);
        calcRepository.save(calculation);
        return a - b;
    }

    @GetMapping("/GetCalculationsData")
    public List<CalcData> GetCalculations() {
        return calcRepository.findAllByOrderByIdDesc();
    }
}


