package com.br.zup.modelo;

public class FullStack extends Funcionario{
	
	private String ideUsada;

	public FullStack(String area, String senioridade, int matricula, String tipoDeContratação, String ideUsada) {
		super(area, senioridade, matricula, tipoDeContratação);
		this.ideUsada = ideUsada;
	}

	public String getIdeUsada() {
		return ideUsada;
	}

	public void setIdeUsada(String ideUsada) {
		this.ideUsada = ideUsada;
	}
	
public String toString() {
		
		String model = "";
		
		model += "Linguagem -> " + this.ideUsada + "\n";
		model += "Área -> " + super.getArea() + "\n";
		model += "Senioridade -> " + super.getSenioridade() + "\n";
		model += "Matricula -> " + super.getMatricula() + "\n";
		model += "Tipo de Contratação -> " + super.getTipoDeContratação() + "\n";
		
		return model;
	}
	
	
	
	
}
