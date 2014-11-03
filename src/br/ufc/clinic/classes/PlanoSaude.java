package br.ufc.clinic.classes;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class PlanoSaude implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String razaoSocial;
	private long cnpj;
	private List<Telefone> telefones;
	private List<Endereco> enderecos;
	
	
	
	
	
	//GETS
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public long getCnpj() {
		return cnpj;
	}
	
	public List<Endereco> getEnderecos() {
		return Collections.unmodifiableList(this.enderecos);
	}
	
	public List<Telefone> getTelefones() {
		return Collections.unmodifiableList(this.telefones);
	}
	
	
	//SETS
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	//ADDS
	
	public void addEndereco(Endereco endereco){
		this.enderecos.add(endereco);
	}
	
	public void addTelefone(Telefone telefone){
		this.telefones.add(telefone);
	}
	
	//REMS
	
	public void remEnderecos(Endereco endereco){
		this.enderecos.remove(endereco);
	}
	
	public void remTelefone(Telefone telefone){
		this.telefones.remove(telefone);
	}
	
	
}
