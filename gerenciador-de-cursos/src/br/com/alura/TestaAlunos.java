package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;



public class TestaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Marcelo Paludetto");
		alunos.add("Nico Steppat");
		alunos.add("Mauricio Aniche");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		System.out.println("--------------");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("--------------");
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
	
		System.out.println("--------------");
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println("--------------");
		System.out.println(alunosEmLista.get(0));
		
	}
 
}
