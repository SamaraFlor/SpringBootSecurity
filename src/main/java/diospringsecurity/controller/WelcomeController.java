package diospringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    //Direciono para pagina principal
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }

    // imprimir que a rota foi autorizada
    @GetMapping("/users")
    public String users() {
        return "Authorized user";
    }
    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager";
    }
}