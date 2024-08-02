package com.javaapirest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class UsuarioContoller {
    public List<String> prueba() {
        return List.of("Hola", "Mundo");
    }
}
