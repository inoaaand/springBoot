package main.java.br.ifpr.aloMundo.controller;

@RestController
@RequestMapping("/")
public class aloMundoController {

    @GetMapping
    public String oie() {
        return "oiê mundo";
    }

}
