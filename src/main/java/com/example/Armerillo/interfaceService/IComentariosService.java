package com.example.Armerillo.interfaceService;

import com.example.Armerillo.modelo.Comentarios;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.Armerillo"})
public interface IComentariosService {

    public List<Comentarios>listarC();
    public Optional<Comentarios>listarIdC(int id);
    public int save (Comentarios c);
    public void deleteC(int id);

}
