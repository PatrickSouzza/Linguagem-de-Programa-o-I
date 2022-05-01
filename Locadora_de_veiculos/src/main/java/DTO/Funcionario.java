package DTO;

public class Funcionario {

	String nome_funcionario;
	String cargo;
	String salario;
	
	public Funcionario(String nome_funcionario, String cargo, String salario) {
		this.nome_funcionario = nome_funcionario;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String getNome_funcionario() {
		return nome_funcionario;
	}
	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
}
