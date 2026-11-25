package com.example.miranha.repository;

import com.example.miranha.entities.Miranha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface miranhaRepository
extends JpaRepository<Miranha, Integer> {
}
