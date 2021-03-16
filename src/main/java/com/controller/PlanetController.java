package com.controller;

import com.repository.PlanetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlanetController {

    private final PlanetRepository planetRepository;


    @RequestMapping("/planets")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());

        return "authors/list";


    }



}
