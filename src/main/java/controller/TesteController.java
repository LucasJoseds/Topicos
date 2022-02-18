package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TesteController {

	private String nome;
	private String email;
	private String mensagem;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
	public void mandarMsg() {
	
		System.out.println(nome);
		System.out.println(mensagem);
	}
	
	public void limpar() {
		
		nome="";
		email="";
		mensagem="";
	}
}
