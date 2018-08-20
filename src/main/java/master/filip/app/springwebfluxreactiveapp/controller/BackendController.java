package master.filip.app.springwebfluxreactiveapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/backend")
public class BackendController {

    @RequestMapping("/")
    public String indexAction(ModelMap modelMap){
        return "homepage";
    }
}
