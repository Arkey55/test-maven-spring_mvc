package ru.romankuznetsov;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class testSpring {
    @RequestMapping(method = RequestMethod.GET)
    public String helloWold(ModelMap model){
        model.addAttribute("message", "Это вроде не бут, но это не точно");
        return "hello";
    }
}
