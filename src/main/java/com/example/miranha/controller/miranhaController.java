package com.example.miranha.controller;

import com.example.miranha.entities.Miranha;
import com.example.miranha.service.miranhaService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class miranhaController {

    private final miranhaService service;
    public miranhaController(miranhaService service){
        this.service = service;
    }
    @PostMapping
    public String save(@RequestBody Miranha m){
        return service.salvar(m) + "Miranha salvo com sucesso";
    }

    @GetMapping
    public List<Miranha> listar(){
        return service.listar();
    }
}
