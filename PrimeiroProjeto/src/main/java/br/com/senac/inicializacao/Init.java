package br.com.senac.inicializacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.domain.Aluno;
import br.com.senac.domain.Professor;
import br.com.senac.service.AlunoService;
import br.com.senac.service.ProfessorService;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	AlunoService alunoService;
	@Autowired
	ProfessorService professorService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Danilo");
		alunoService.salvar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Murilo");
		alunoService.salvar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Maria Eduarda");
		alunoService.salvar(aluno3);
		
		
		Professor prof1 = new Professor();
		prof1.setNome("Maria Luiza");
		professorService.salvar(prof1);
		
		Professor prof2 = new Professor();
		prof2.setNome("Vitória");
		professorService.salvar(prof2);
		
		Professor prof3 = new Professor();
		prof3.setNome("Hugo");
		professorService.salvar(prof3);
		
		
		//ALUNO
		
		List<Aluno> listaAlunos = alunoService.buscarTodosAlunos();
		
		for(Aluno aluno:listaAlunos) {
			System.out.println(aluno.getNome());
		}
		
		//PROFESSOR
		List<Professor> listaProfessores = professorService.buscarTodosProfessores();
		
		for(Professor professor:listaProfessores) {
			System.out.println(professor.getNome());
		}
		
	}
}
