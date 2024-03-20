package org.projektownia_spring.controllers;

import org.projektownia_spring.models.Image;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/image")
public class GetImageController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(GetImageController.class);


    @GetMapping
    public String sendImageData(Model model) {

    }

    private Image getImageData(String id) {

    }
}
