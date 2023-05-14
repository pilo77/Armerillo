package com.example.Armerillo.interfaces;

import com.example.Armerillo.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona  extends CrudRepository<Persona, Integer> {
}
