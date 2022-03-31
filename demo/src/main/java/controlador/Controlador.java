package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Controlador {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/procesa")
    public String procesa(HttpServletRequest request, Model model){
        String dato = request.getParameter(s: "dato");
        System.out.println("dato -> " + dato);
        return index;
    }
