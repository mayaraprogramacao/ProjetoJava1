package br.com.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.service.ProfessorService;



@Controller
@RequestMapping("professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	@GetMapping("/listarProfessores")//path="/{listarProfessores}"
	public ModelAndView listaTodosProfessores() {
		//ir para uma página html
		ModelAndView mv = new ModelAndView("professor/paginaListaProfessor");
		mv.addObject("professores", professorService.buscarTodosProfessores());
		return mv;
	}
}
