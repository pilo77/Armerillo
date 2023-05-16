package com.example.Armerillo.controler;

import com.example.Armerillo.interfaceService.IComentariosService;
import com.example.Armerillo.modelo.Comentarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ComentariosController {
    @Autowired
    private IComentariosService Service;

    @GetMapping("/listarC")
    public String listarC(Model model2) {
        List<Comentarios> comentarios = Service.listarC();
        model2.addAttribute("comentarios", comentarios);
        return "verComentarios";
    }

    @GetMapping("/comentarios")
    public String mostrarFormulario(Model model2) {
        model2.addAttribute("comentarios", new Comentarios());
        return "comentarios";
    }

    @PostMapping("/save")
    public String save(@Validated Comentarios c){
        Service.save(c);
        return "redirect:/inicio";
    }

    @GetMapping("/editarC/{id}")
    public String editarComentario(@PathVariable int id, Model model2) {
        Optional<Comentarios> comentario = Service.listarIdC(id);
        model2.addAttribute("comentarios", comentario);
        return "comentarios";
    }

    @GetMapping("/eliminarC/{id}")
    public String eliminarComentario(@PathVariable int id) {
        Service.deleteC(id);
        return "redirect:/listarC";
    }
}