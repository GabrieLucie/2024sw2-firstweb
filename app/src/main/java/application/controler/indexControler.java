package application.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexControler {
    @RequestMapping("/")
    public String index(){
        return "/index.jsp";
    }

}