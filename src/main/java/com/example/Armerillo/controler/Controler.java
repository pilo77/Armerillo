package com.example.Armerillo.controler;



import com.example.Armerillo.interfaceService.IPersonaService;
import com.example.Armerillo.modelo.Persona;
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
public class Controler {


    @Autowired
    private IPersonaService service;


    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas= service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }
    @GetMapping("/inicio")
    public String agregar(Model model){
        return "major";
    }

    @GetMapping("/arco")
    public String agregar1(Model model){
        model.addAttribute("persona", new Persona());
        return "arco";
    }
    @GetMapping("/ballesta")
    public String agregar2(Model model){
        model.addAttribute("persona", new Persona());
        return "ballesta";
    }
    @GetMapping("/cuchillo")
    public String agregar3(Model model){
        model.addAttribute("persona", new Persona());
        return "Cuchillo";
    }
    @GetMapping("/escopeta")
    public String agregar4(Model model){
        model.addAttribute("persona", new Persona());
        return "Escopeta";
    }
    @GetMapping("/municion")
    public String agregar5(Model model){
        model.addAttribute("persona", new Persona());
        return "municion";
    }
    @GetMapping("/pistola")
    public String agregar6(Model model){
        model.addAttribute("persona", new Persona());
        return "pistola";
    }
    @GetMapping("/rifles")
    public String agregar7(Model model){
        model.addAttribute("persona", new Persona());
        return "rifles";

    }@GetMapping("/modifica")
    public String agregar8(Model model){
        model.addAttribute("persona", new Persona());
        return "editador";
    }

    @PostMapping("/save")
    public String save(@Validated Persona p){
        service.save(p);
        return "redirect:/incio";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "editador";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }



}
