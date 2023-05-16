package com.example.Armerillo.interfaces;

import com.example.Armerillo.modelo.Comentarios;
import org.springframework.data.repository.CrudRepository;

public interface IComentarios  extends CrudRepository<Comentarios, Integer> {
}
