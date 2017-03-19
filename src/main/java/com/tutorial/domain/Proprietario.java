package com.tutorial.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="proprietario")
public class Proprietario {
	
	private Long codigo;
	private String nome;
	private String email;
	private List<Telefone> telefones=new ArrayList<>();
	private List<Veiculo> veiculos;
	
	public Proprietario(){
		
	}
	
	public Proprietario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	/**
	 * @return the nome
	 */
	
	@Column(name="nome",length=60, nullable=false)
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the telefone
	 */
	@ElementCollection
	@CollectionTable(name="proprietario_telefones",joinColumns=@JoinColumn(name="cod_proprietario"))
	@AttributeOverrides({@AttributeOverride(name="numero",column=@Column(name="num_telefone",length=20,nullable=false))})
	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	/**
	 * @param telefone the telefone to set
	 */
	
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	
	@Column(length=255)
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the codigo
	 */

	@Id
	@GeneratedValue
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Proprietario [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefones + ", email=" + email
				+ ", veiculos=" + veiculos + "]";
	}

	/**
	 * @return the veiculos
	 */
	@OneToMany(mappedBy="proprietario")
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	/**
	 * @param veiculos the veiculos to set
	 */
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

}
