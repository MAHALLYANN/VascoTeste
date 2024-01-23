package application;

import java.util.Scanner;

import entitie.Pessoa;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		
		System.out.println("###INICIO###");
		System.out.println("##Insira o nome:");
		p1.setNome(sc.nextLine());
		System.out.println("##Insira Cidade:");
		p1.setCidade(sc.nextLine());
		System.out.println("##Insira a Idade:");
		p1.setIdade(sc.nextInt());
		
		p1.calcIdade();
		System.out.println(p1);
		
		
        sc.close();
	}

}
