/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.mcastillor.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author micastr
 */
@Controller
public class MainController {
    
    @GetMapping("/")
    public String main(Model model) {
        
        model.addAttribute("hola", "Hola proyecto Jenkins");
        return "main";
    }
}
