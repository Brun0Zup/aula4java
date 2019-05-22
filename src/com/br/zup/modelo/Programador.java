package com.br.zup.modelo;

public class Programador extends Funcionario{

	// Atributos únicos
	
	private String linguagem;
	
	// Construtor

	public Programador(String linguagem, String area, String senioridade,int matricula,
			String tipoDeContratacao) {
		
		super(area, senioridade, matricula, tipoDeContratacao);
		this.linguagem = linguagem;
	}
	
	// Gets e Sets
	
	public String getLinguagem() {
		return linguagem;
	}
	
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	public String toString() {
		
		String modelo = "";
		
		modelo += "Linguagem -> " + this.linguagem + "\n";
		modelo += "Área -> " + super.getArea() + "\n";
		modelo += "Senioridade -> " + super.getSenioridade() + "\n";
		modelo += "Matricula -> " + super.getMatricula() + "\n";
		modelo += "Tipo de Contratação -> " + super.getTipoDeContratação() + "\n";
		
		return modelo;
	}
	
	
}
