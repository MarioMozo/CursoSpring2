package com.programa1.prueba1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

@GetMapping({"/index", "/", "/home"})
public String index(Model model){
	model.addAttribute("titulo","Spring");
    return "index";
    }
}


/*Agregar metodos handlers
El controlador se encarga de manejar peticiones del usuario.
Los metodos siempre son publicos con el nombre de la vista que va a mostar
Aqui se configura cada metodo*/

// 1.- Agregar metodos del controlador
// 2.- Mapear (relacionar) a una ruta o url
// 3.- Se mapeo a /index -> resources -> templates -> index.html
// 4.- Pasar datos a la vista con MODEL
