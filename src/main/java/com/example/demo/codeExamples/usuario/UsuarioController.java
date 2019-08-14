package com.example.demo.codeExamples.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class UsuarioController {

    @GetMapping(path = "/usuarios")
    private String getUsuarios() {
        System.out.println("Buscando usuarios");
        return "dsfsf";
    }

    @GetMapping(path = "/")
    private String mainRoot() {
        return "Hello World Spring Boot - Google Cloud Platfom - Sql Cloud";
    }
}
