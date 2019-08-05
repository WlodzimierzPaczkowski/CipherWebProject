package com.github.WlodzimierzPaczkowski.springwebapp.webapp.controler;

import com.github.WlodzimierzPaczkowski.springwebapp.webapp.services.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class stringControler {
    private StringService StringService;

    @Autowired
    public stringControler(StringService stringService) {
        StringService = stringService;
    }

    @RequestMapping({"/c", ""})
    public String showNumber(Model model) {
        model.addAttribute("CipherName", StringService.getString());
        model.addAttribute("CipherDifficulty", StringService.getString2()); //for test purpose

        return "num";
    }
}