package br.ifpr.aloMundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class aloMundoController {

    @GetMapping
    public String oie() {
        return "oiê mundo";
    }

}
