package com.example.view;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import modal.locadoraDAO;
import modal.locadoraDTO;

public class locadoraController implements Initializable {
	
	 @FXML
	    private TableColumn<locadoraDTO, String> col_carro_cor;

	    @FXML
	    private TableColumn<locadoraDTO, Integer> col_carro_id;

	    @FXML
	    private TableColumn<locadoraDTO, String> col_carro_marca;

	    @FXML
	    private TableColumn<locadoraDTO, String> col_carro_placa;

	    @FXML
	    private TableColumn<locadoraDTO, String> col_carro_modelo;

	    @FXML
	    private TableColumn<locadoraDTO, String> col_cliente_cpf;

	    @FXML
	    private TableColumn<locadoraDTO, String> col_cliente_email;

	    @FXML
	    private TableColumn<locadoraDTO, Integer> col_cliente_id;

	    @FXML
	    private TableColumn<locadoraDTO, String> col_cliente_nome;

	    @FXML
	    private TableColumn<locadoraDTO, String> col_cliente_telefone;

	    @FXML
	    private TableColumn<locadoraDTO, String> col_func_nome;

	    @FXML
	    private TableColumn<locadoraDTO, String> col_func_cpf;

	    @FXML
	    private TableColumn<locadoraDTO, Integer> col_func_id;

	    @FXML
	    private TableColumn<locadoraDTO, String> col_func_funcao;

	    @FXML
	    private TableColumn<locadoraDTO, String> col_func_salario;

	    @FXML
	    private AnchorPane geral1;

	    @FXML
	    private Tab tabCliente;

	    @FXML
	    private Tab tabfunc;

	    @FXML
	    private Tab tab_carro;

	    @FXML
	    private TableView<locadoraDTO> tableview_carro;

	    @FXML
	    private TableView<locadoraDTO> tableview_cliente;

	    @FXML
	    private TableView<locadoraDTO> tableviewFunc;

	    @FXML
	    private TextField txt_carro_cor;

	    @FXML
	    private TextField txt_carro_marca;

	    @FXML
	    private TextField txt_carro_placa;

	    @FXML
	    private TextField txt_carro_modelo;

	    @FXML
	    private TextField txt_cliente_cpf;

	    @FXML
	    private TextField txt_cliente_email;

	    @FXML
	    private TextField txt_cliente_nome;

	    @FXML
	    private TextField txt_cliente_telefone;

	    @FXML
	    private TextField txt_func_nome;

	    @FXML
	    private TextField txt_func_cpf;

	    @FXML
	    private TextField txt_func_funcao;

	    @FXML
	    private TextField txt_func_salario;
	    
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		///COMEÇO DO CODIGO///
	    
	    //private locadoraDTO dto;
	    private locadoraDAO dao;
	    
	    @Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
	    	dao = new locadoraDAO();
	    	
	    	col_cliente_id.setCellValueFactory(new PropertyValueFactory<>("cliente_id"));
	    	col_cliente_nome.setCellValueFactory(new PropertyValueFactory<>("cliente_nome"));
	    	col_cliente_cpf.setCellValueFactory(new PropertyValueFactory<>("cliente_cpf"));
	    	col_cliente_email.setCellValueFactory(new PropertyValueFactory<>("cliente_email"));
	    	col_cliente_telefone.setCellValueFactory(new PropertyValueFactory<>("cliente_telefone"));
	    	
	    	col_carro_id.setCellValueFactory(new PropertyValueFactory<>("carro_id"));
	    	col_carro_placa.setCellValueFactory(new PropertyValueFactory<>("carro_placa"));
	    	col_carro_marca.setCellValueFactory(new PropertyValueFactory<>("carro_marca"));
	    	col_carro_cor.setCellValueFactory(new PropertyValueFactory<>("carro_cor"));
	    	col_carro_modelo.setCellValueFactory(new PropertyValueFactory<>("carro_modelo"));
	    	
	    	
	    	col_func_id.setCellValueFactory(new PropertyValueFactory<>("func_id"));
	    	col_func_nome.setCellValueFactory(new PropertyValueFactory<>("func_nome"));
	    	col_func_cpf.setCellValueFactory(new PropertyValueFactory<>("func_cpf"));
	    	col_func_funcao.setCellValueFactory(new PropertyValueFactory<>("func_funcao"));
	    	col_func_salario.setCellValueFactory(new PropertyValueFactory<>("func_salario"));
		}
	    
	    ////////////////////////////////////
	    //CLIENTE
	    @FXML
	    void btn_cliente_cadastrar() {
	    	locadoraDTO cliente = new locadoraDTO();
			
			cliente.setCliente_nome(txt_cliente_nome.getText());
			cliente.setCliente_cpf(txt_cliente_cpf.getText());
			cliente.setCliente_email(txt_cliente_email.getText());
			cliente.setCliente_telefone(txt_cliente_telefone.getText());
		
			try {
				dao.cadastrar_cliente(cliente);
				exibiDialogoINFO("Cliente cadastrando com sucesso!");
				//btn_cad_limpar();
				txt_cliente_nome.clear();
				txt_cliente_cpf.clear();
				txt_cliente_email.clear();
				txt_cliente_telefone.clear();
				btn_cliente_pesquisar();
				
			} catch (Exception e) {
				// TODO: handle exception
				exibiDialogoERRO("ERRO! Falha ao cadastrar cliente.");
				e.printStackTrace();
			}
	    	

	    }

	    @FXML
	    void btn_cliente_pesquisar() {
	    	try {
	    		List<locadoraDTO> resultado =  dao.consultar_cliente();
	        	if(resultado.isEmpty()) {
	        		exibiDialogoINFO("Nenhum cliente encontrado!");
	        	}else {
	        		tableview_cliente.setItems(FXCollections.observableArrayList(resultado));
	        	}
			} catch (Exception e) {
				// TODO: handle exception
				exibiDialogoERRO("Falha ao realizar a consulta!");
				e.printStackTrace();
			}
	    }
	    
	    ////////////////////////////////////
	    //CARRO
	    @FXML
	    void btn_carro_cadastrar() {
	    	locadoraDTO carro = new locadoraDTO();
			
	    	carro.setCarro_placa(txt_carro_placa.getText());
	    	carro.setCarro_marca(txt_carro_marca.getText());
	    	carro.setCarro_cor(txt_carro_cor.getText());
	    	carro.setCarro_modelo(txt_carro_modelo.getText());
		
			try {
				dao.cadastrar_carro(carro);
				exibiDialogoINFO("Carro cadastrando com sucesso!");
				//btn_cad_limpar();
				txt_carro_placa.clear();
				txt_carro_marca.clear();
				txt_carro_cor.clear();
				txt_carro_modelo.clear();
				btn_carro_pesquisar();
				
			} catch (Exception e) {
				// TODO: handle exception
				exibiDialogoERRO("ERRO! Falha ao cadastrar carro.");
				e.printStackTrace();
			}
	    	

	    }

	    
	    @FXML
	    void btn_carro_pesquisar() {
	    	try {
	    		List<locadoraDTO> resultado =  dao.consultar_carro();
	        	if(resultado.isEmpty()) {
	        		exibiDialogoINFO("Nenhum carro encontrado!");
	        	}else {
	        		tableview_carro.setItems(FXCollections.observableArrayList(resultado));
	        	}
			} catch (Exception e) {
				// TODO: handle exception
				exibiDialogoERRO("Falha ao realizar a consulta!");
				e.printStackTrace();
			}
	    }
	    
	   ////////////////////////////////////
	   //func
	    @FXML
	    void btn_func_cadastrar() {
	    	locadoraDTO func = new locadoraDTO();
			
	    	func.setFunc_nome(txt_func_nome.getText());
	    	func.setFunc_cpf(txt_func_cpf.getText());
	    	func.setFunc_funcao(txt_func_funcao.getText());
	    	func.setFunc_salario(txt_func_salario.getText());
		
			try {
				dao.cadastrar_func(func);
				exibiDialogoINFO("Funcinário cadastrando com sucesso!");
				//btn_cad_limpar();
				txt_func_nome.clear();
				txt_func_cpf.clear();
				txt_func_funcao.clear();
				txt_func_salario.clear();
				btn_func_pesquisar();
				
			} catch (Exception e) {
				// TODO: handle exception
				exibiDialogoERRO("ERRO! Falha ao cadastrar funcionário.");
				e.printStackTrace();
			}

	    }

	    @FXML
	    void btn_func_pesquisar() {
	    	try {
	    		List<locadoraDTO> resultado =  dao.consultar_func();
	        	if(resultado.isEmpty()) {
	        		exibiDialogoINFO("Nenhum carro encontrado!");
	        	}else {
	        		tableviewFunc.setItems(FXCollections.observableArrayList(resultado));
	        	}
			} catch (Exception e) {
				// TODO: handle exception
				exibiDialogoERRO("Falha ao realizar a consulta!");
				e.printStackTrace();
			}

	    }
	    
	    ///////////////////////////////////////////////////////////////////////////////////////////////////////
	    
	    //INFOS ERRO/SUCESSO
	    
	    private void exibiDialogoINFO(String informacao) {
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Informação");
	    	alert.setHeaderText(null);
	    	alert.setContentText(informacao);
	    	
	    	alert.showAndWait();
	    	
	    }
	    
	     void exibiDialogoERRO(String erro) {
	    	Alert alert = new Alert(AlertType.ERROR);
	    	alert.setTitle("Informação");
	    	alert.setHeaderText(null);
	    	alert.setContentText(erro);
	    	
	    	alert.showAndWait();
	    	
	    }
	     

}
