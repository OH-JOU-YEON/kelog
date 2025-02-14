package portfolio.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    public String getHome(Model model) {

        return "index";
    }
}
