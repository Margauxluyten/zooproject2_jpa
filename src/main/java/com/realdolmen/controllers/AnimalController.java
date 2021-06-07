package com.realdolmen.controllers;


import com.realdolmen.services.TigerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnimalController {
    @Autowired
    private TigerService tigerService;

    @GetMapping(value = "/")
    public String showAnimalPage(Model model) {
        model.addAttribute("allAnimals", tigerService.getTigers());
        return "index";
    }


}
