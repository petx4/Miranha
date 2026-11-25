package com.example.miranha.service;

import com.example.miranha.entities.Miranha;
import com.example.miranha.repository.miranhaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class miranhaService {

    private final miranhaRepository repository;
    public miranhaService(miranhaRepository repository){
        this.repository = repository;
    }

    public Miranha salvar(Miranha miranha){
        return repository.save(miranha);
    }

    public List<Miranha> listar(){
        return repository.findAll();
    }
}
