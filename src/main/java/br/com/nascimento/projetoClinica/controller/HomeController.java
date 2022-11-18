package br.com.nascimento.projetoClinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller // anotação para identificar que essa classe é um controller
@RequestMapping("/") //anotação para definir a rota desse controller
 public class HomeController {

    //anotação para definir a rota do metodo
    //@RequestMapping(path = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String home(ModelMap model){

        model.addAttribute("boasVindas","Seja bem vindo ao Sistema de Cadastro de Clientes");
        //retorna a view home
        return "home";

    }

    //criando uma nova action
   // @GetMapping("/mensagem")
    //public String mensagem(ModelMap modelMap){
        //Model Map é uma implementaçaõ do Model
      //  modelMap.addAttribute("mensagem", "mensagem vinda do servidor");
        //return "mensagem";
    //}


    @GetMapping("/mensagem")
    public ModelAndView mensagem(){

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("mensagem");
        modelAndView.addObject("mensagem", "Outra mensagem vinda do servidor");

        return modelAndView;

    }


    @GetMapping("/saudacao")
    public ModelAndView saudacao(@RequestParam String nome){

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("saudacao");
        modelAndView.addObject("nome", nome);

        return modelAndView;

    }
 }
 