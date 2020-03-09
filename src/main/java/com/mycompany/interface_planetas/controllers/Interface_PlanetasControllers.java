
package com.mycompany.interface_planetas.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Interface_PlanetasControllers {
    @RequestMapping("/")
    
    public String index(){
        return "index";
    }
}
