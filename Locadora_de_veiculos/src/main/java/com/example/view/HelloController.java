package com.example.view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.Carro;
import DTO.Cliente;
import DTO.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField textAno;

    @FXML
    private TextField textCargo;

    @FXML
    private TextField textCor;

    @FXML
    private TextField textCpf;

    @FXML
    private TextField textEndereco;

    @FXML
    private TextField textMarca;

    @FXML
    private TextField textModelo;

    @FXML
    private TextField textNome;

    @FXML
    private TextField textNomeFuncio;

    @FXML
    private TextField textPlaca;

    @FXML
    private TextField textPreco;

    @FXML
    private TextField textSalario;

    @FXML
    private TextField textTelefone;

    @FXML
    void btnCadastrar(ActionEvent event) {
    	//carro

        String placa = this.textPlaca.getText();
        String modelo = this.textModelo.getText();
        String cor = this.textCor.getText();
        String marca = this.textMarca.getText();
        String ano = this.textAno.getText();
        String preco = this.textPreco.getText();
		
    	
    	Carro objcarro = new Carro( placa, modelo,cor ,marca, ano, preco);
    	
    	objcarro.setPlaca(placa);
    	objcarro.setModelo(modelo);
    	objcarro.setCor(cor);
    	objcarro.setMarca(marca);
    	objcarro.setAno(ano);
    	objcarro.setPreco(preco);
    	
    	System.out.println("A placa do carro é: " + objcarro.getPlaca());
    	System.out.println("O modelo do carro é: " + objcarro.getModelo());
    	System.out.println("O carro é: " + objcarro.getCor());
    	System.out.println("A marca do carro é: " + objcarro.getMarca());
    	System.out.println("O carro é do ano de: " + objcarro.getAno());
    	System.out.println("O valor total do carro é de :" + objcarro.getPreco());



    	ArrayList<String> Carro = new ArrayList<String>();
    	
    	Carro.add(objcarro.getPlaca());
    	Carro.add(objcarro.getModelo());
    	Carro.add(objcarro.getCor());
    	Carro.add(objcarro.getMarca());
    	Carro.add(objcarro.getAno());
    	Carro.add(objcarro.getPreco());
    	
    	System.out.println("\n"+Carro);
    	
    	JOptionPane.showMessageDialog(null, Carro);

    }

 

    @FXML
    void btnLimpar(ActionEvent event) {
    	textPlaca.setText(null);
		textModelo.setText(null);
		textCor.setText(null);
		textMarca.setText(null);
		textAno.setText(null);
		textPreco.setText(null);
    }

    @FXML
    void btnCadastrarCliente(ActionEvent event) {

    	String nome = this.textNome.getText();
    	String endereco = this.textEndereco.getText();
    	String cpf = this.textCpf.getText();
    	String telefone = this.textTelefone.getText();
    	
    	Cliente objclientedto = new Cliente(nome, endereco, cpf, telefone );
    	
    	objclientedto.setNome(nome);
    	objclientedto.setEndereco(endereco);
    	objclientedto.setCpf(cpf);
    	objclientedto.setTelefone(telefone);
    	
    	System.out.println("\nO nome do cliente é: " + objclientedto.getNome());
    	System.out.println("O endereço do cliente é: " + objclientedto.getEndereco());
    	System.out.println("O cpf do cliente é: " + objclientedto.getCpf());
    	System.out.println("O telefone é: " + objclientedto.getTelefone());
    	
    	ArrayList<String> Cliente = new ArrayList<String>();
    	Cliente.add(objclientedto.getNome());
    	Cliente.add(objclientedto.getEndereco());
    	Cliente.add(objclientedto.getCpf());
    	Cliente.add(objclientedto.getTelefone());
    	
    	System.out.println("\n" + Cliente);
    	
    	JOptionPane.showMessageDialog(null, Cliente);

    }
    
    @FXML
    void btnLimparCliente(ActionEvent event) {
    	textNome.setText(null);
		textEndereco.setText(null);
		textCpf.setText(null);
		textTelefone.setText(null);

    }

    @FXML
    void btnCadastrarFuncionario(ActionEvent event) {
    	String nome_funcionario = this.textNomeFuncio.getText();
    	String cargo = this.textCargo.getText();
    	String salario = this.textSalario.getText();
    	
    	Funcionario objfunc = new Funcionario(nome_funcionario, cargo, salario);
    	
    	objfunc.setNome_funcionario(nome_funcionario);
    	objfunc.setCargo(cargo);
    	objfunc.setSalario(salario);
    	
    	ArrayList<String> Funcionario = new ArrayList<String>();
    	
    	Funcionario.add(objfunc.getNome_funcionario());
    	Funcionario.add(objfunc.getCargo());
    	Funcionario.add(objfunc.getSalario());
    	
    	System.out.println("\nO nome do funcionário é: " + objfunc.getNome_funcionario());
    	System.out.println("O seu cargo é de: " + objfunc.getCargo());
    	System.out.println("O sário é de: " + objfunc.getSalario());
    	
    	System.out.println("\n" + Funcionario);
    	
    	JOptionPane.showMessageDialog(null, Funcionario);
    }
    
    @FXML
    void btnLimparFuncionario(ActionEvent event) {
    	textNomeFuncio.setText(null);
		textCargo.setText(null);
		textSalario.setText(null);
	
    }
}