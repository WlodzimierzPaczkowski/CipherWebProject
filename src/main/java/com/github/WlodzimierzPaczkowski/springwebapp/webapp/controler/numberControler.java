package com.github.WlodzimierzPaczkowski.springwebapp.webapp.controler;

import com.github.WlodzimierzPaczkowski.springwebapp.webapp.services.numberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class numberControler {
    private numberService numberService;

    @Autowired
    public numberControler(numberService numberService) {
        this.numberService = numberService;
    }

    @RequestMapping({"/",""})
    public String showNumber(Model model){
        model.addAttribute("Number", numberService.getNumber());


        return "num";
    }
}
