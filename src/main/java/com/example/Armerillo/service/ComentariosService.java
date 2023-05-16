package com.example.Armerillo.service;

import com.example.Armerillo.interfaceService.IComentariosService;
import com.example.Armerillo.interfaces.IComentarios;
import com.example.Armerillo.modelo.Comentarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentariosService implements IComentariosService {

    @Autowired
    private IComentarios xd;

    @Override
    public List<Comentarios> listarC() {
        return (List<Comentarios>) xd.findAll();
    }

    @Override
    public Optional<Comentarios> listarIdC(int id) {

        return xd.findById(id);
    }


    @Override
    public int save(Comentarios c) {
        int r= 0;
        Comentarios comentarios = xd.save(c);
        if(!comentarios.equals(null)){
            r= 1;
        }
        return r;
    }

    @Override
    public void deleteC(int id) {
        xd.deleteById(id);
    }
}
