package edu.ifam.dra.chat.model;

import java.util.Calendar;

public class Mensagem {
	private Calendar dataHora;
	private String conteudo;
	private Contato emissor;
	private Contato Receptor;
	
	public Mensagem() {
		super();
	}
	
	public Mensagem(Calendar dataHora, String conteudo, Contato emissor, Contato receptor) {
		super();
		this.dataHora = dataHora;
		this.conteudo = conteudo;
		this.emissor = emissor;
		Receptor = receptor;
	}
	
	public Calendar getDataHora() {
		return dataHora;
	}
	
	public void setDataHora(Calendar dataHora) {
		this.dataHora = dataHora;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public Contato getEmissor() {
		return emissor;
	}
	
	public void setEmissor(Contato emissor) {
		this.emissor = emissor;
	}
	
	public Contato getReceptor() {
		return Receptor;
	}
	
	public void setReceptor(Contato receptor) {
		Receptor = receptor;
	}
	
	
}
