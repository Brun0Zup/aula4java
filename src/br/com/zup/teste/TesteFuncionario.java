package br.com.zup.teste;

import java.util.Scanner;

import com.br.zup.modelo.Designer;
import com.br.zup.modelo.FullStack;
import com.br.zup.modelo.Programador;

public class TesteFuncionario {

	public static void main(String[] args) {
		
	// Primeiro exercicio	
		Programador p = new Programador("Java", "TI", "Junior", 1327383774, "CLT");

		 System.out.println(p);
		 
// Segundo exercicio
			Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Qual sua area? ");
		 String a = entrada.nextLine();
		 
		 System.out.println("Qual sua senioridade? ");
		 String seni = entrada.nextLine();
		 
		 System.out.println("Qual sua matricula? ");
		 int id = entrada.nextInt();
		 
		 System.out.println("Qual sua contratação ");
		 String contrato = entrada.nextLine();
		 entrada.next();
		 
		 System.out.println("Qual programa usado ");
		 String ferramenta = entrada.nextLine();
		 entrada.next();
		 
		 System.out.println("\n");
		 
		 Designer d = new Designer(a, seni, id, contrato, ferramenta);
		 System.out.println(d);
		 
		 
// 3 exercicio
	FullStack b = new FullStack("TI", "Junior", 18363829, "Startup", "Eclipse");
	
	}
}
