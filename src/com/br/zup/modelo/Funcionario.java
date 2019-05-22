package com.br.zup.modelo;

public class Funcionario {

	// Atributos
	private String area;
	private String senioridade;
	private int matricula;
	private String tipoDeContratação;

	// Construtor

	public Funcionario(String area, String senioridade, int matricula, String tipoDeContratação) {
		super();
		this.area = area;
		this.senioridade = senioridade;
		this.matricula = matricula;
		this.tipoDeContratação = tipoDeContratação;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getTipoDeContratação() {
		return tipoDeContratação;
	}

	public void setTipoDeContratação(String tipoDeContratação) {
		this.tipoDeContratação = tipoDeContratação;
	}

}
