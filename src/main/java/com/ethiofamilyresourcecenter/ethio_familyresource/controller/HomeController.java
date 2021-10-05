package com.ethiofamilyresourcecenter.ethio_familyresource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String displayHome(Model model){
            return "main/index";
    }

    // under ABOUT button in the Layout
    @GetMapping("/mission")
    public String displayMission(Model model) {
        return "about/mission";
    }

    @GetMapping("/accomplishments")
    public String displayAccomplishments(Model model) {
        return "about/accomplishments";
    }

    @GetMapping("/contact-us")
    public String displayContactUs(Model model) {
        return "about/contact-us";
    }

}
