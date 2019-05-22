package com.br.zup.modelo;

public class Designer extends Funcionario {
	
	private String programaUsado;

	// Construtor
	
	public Designer(String area, String senioridade, int matricula, String tipoDeContratação, String programaUsado) {
		super(area, senioridade, matricula, tipoDeContratação);
		this.programaUsado = programaUsado;
	}

	public String getProgramaUsado() {
		return programaUsado;
	}

	public void setProgramaUsado(String programaUsado) {
		this.programaUsado = programaUsado;
	}

public String toString() {
		
		String m = "";
		
		m += "Linguagem -> " + this.programaUsado + "\n";
		m += "Área -> " + super.getArea() + "\n";
		m += "Senioridade -> " + super.getSenioridade() + "\n";
		m += "Matricula -> " + super.getMatricula() + "\n";
		m += "Tipo de Contratação -> " + super.getTipoDeContratação() + "\n";
		
		return m;
	}
	
	
	
	
}
