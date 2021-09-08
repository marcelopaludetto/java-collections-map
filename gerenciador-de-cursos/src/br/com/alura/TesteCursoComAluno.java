package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TesteCursoComAluno {

 public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com Array",21));
		javaColecoes.adiciona(new Aula("Criando uma aula",20));
		javaColecoes.adiciona(new Aula("Mudando uma ArrayList",24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Marcelo Paludetto", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos alunos matriculados: ");
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		Vector<Aluno> vetor = new Vector<>();
		
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 346722);
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		// obrigatoriamente o seguinte é true: 
		
		System.out.println(a1.hashCode() == turini.hashCode());
		
		
		
}
}
