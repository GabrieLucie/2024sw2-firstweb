package application.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class CalcController {
    @RequestMapping("/calc")
    public String form(){
        return "calc/form";
    }    

    @RequestMapping("/soma")
    public String soma(Model ui, 
        @RequestParam("numA") int nA,
        @RequestParam("numB") int nB){
    ui.addAttribute("resultado", nA + nB);
        
        return "calc/form";
    }
}
