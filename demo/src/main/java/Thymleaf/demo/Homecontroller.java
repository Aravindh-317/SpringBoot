package Thymleaf.demo;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Homecontroller {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("name", "ARAVINDH");
        model.addAttribute("course", "SpringBoot");
        model.addAttribute("City","Salem");
        model.addAttribute("age",30);
        
		List<String>students = Arrays.asList(
        		"Arasan",
        		"Bhuvan",
        		"Chandru",
        		"Deepan",
        		"Hari"
        		);
        model.addAttribute("students", students);
        return "Home";
    }
}