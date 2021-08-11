package br.com.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.service.AlunoService;

@Controller
@RequestMapping("aluno")
public class AlunoController {

	
	@Autowired
	private AlunoService alunoService;
	
	
	@GetMapping("/listarAlunos")//path="/{listarAluno}"
	public ModelAndView listaTodosAlunos() {
		//ir para uma página html
		ModelAndView mv = new ModelAndView("aluno/paginaListaAluno");
		mv.addObject("alunos", alunoService.buscarTodosAlunos());
		return mv;
	}
	
}
