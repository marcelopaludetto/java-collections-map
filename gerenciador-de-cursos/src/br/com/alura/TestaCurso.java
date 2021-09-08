package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com Array",21));
		javaColecoes.adiciona(new Aula("Criando uma aula",20));
		javaColecoes.adiciona(new Aula("Mudando uma ArrayList",22));
		
		System.out.println(javaColecoes.getAulas());
		
		
		
	}

}
