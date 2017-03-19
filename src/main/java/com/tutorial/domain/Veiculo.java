package com.tutorial.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.tutorial.domain.pk.VeiculoId;

/**
 * Entity implementation class for Entity: Veiculo
 *
 */
@Entity
@Table(name="tab_veiculo")
public class Veiculo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private VeiculoId id;
	
//	private Long codigo;
	private String fabricante;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private BigDecimal valor;
	private TipoCombustivel tipoCombustivel;
	private Date dataCadastro;
	private String especificacoes;
	private Proprietario proprietario;
	private Set<Acessorio> acessorios=new HashSet<>();
	
	public Veiculo() {
		super();
	}

//	@Id
//	@GeneratedValue(generator="inc")
//	@GenericGenerator(name="inc", strategy="increment")
//	public Long getCodigo() {
//		return codigo;
//	}

//	public void setCodigo(Long codigo) {
//		this.codigo = codigo;
//	}
	
	/**
	 * @return the id
	 */
	@EmbeddedId
	public VeiculoId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(VeiculoId id) {
		this.id = id;
	}

	@Column(length=60, nullable=false)
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Column(length=60, nullable=false)
	public String getModelo() {
		return modelo;
	}

	/**
	 * @return the acessorios
	 */
	@ManyToMany
	@JoinTable(name="veiculo_acessorios",
		joinColumns={@JoinColumn(name="cidade"),@JoinColumn(name="placa")},
		inverseJoinColumns=@JoinColumn(name="cod_acessorio"))
	public Set<Acessorio> getAcessorios() {
		return acessorios;
	}

	/**
	 * @param acessorios the acessorios to set
	 */
	public void setAcessorios(Set<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Column(name="ano_fabricacao", nullable=false)
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	@Column(name="ano_modelo", nullable=false)
	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	@Column(precision=10, scale=2,nullable=true)
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	/**
	 * @return the tipoCombustivel
	 */

	@Column(name="tipo_combustivel", nullable=false)
	@Enumerated(EnumType.STRING)
	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	/**
	 * @param tipoCombustivel the tipoCombustivel to set
	 */
	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	/**
	 * @return the dataCadastro
	 */
	@Temporal(TemporalType.DATE)
	@Column(name="data_cadastro",nullable=false)
	public Date getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Transient
	public String getDescription(){
		return this.getFabricante()+" "+this.getModelo()
		+" "+this.getAnoFabricacao()+"/"+this.getAnoModelo()
		+" por apenas "+this.getValor();
	}

	/**
	 * @return the especificacoes
	 */
	@Lob
	public String getEspecificacoes() {
		return especificacoes;
	}

	/**
	 * @param especificacoes the especificacoes to set
	 */
	
	public void setEspecificacoes(String especificacoes) {
		this.especificacoes = especificacoes;
	}

	/**
	 * @return the proprietario
	 */
	@ManyToOne
	@JoinColumn(name="cod_proprietario")
	public Proprietario getProprietario() {
		return proprietario;
	}

	/**
	 * @param proprietario the proprietario to set
	 */
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", anoFabricacao="
				+ anoFabricacao + ", anoModelo=" + anoModelo + ", valor=" + valor + ", tipoCombustivel="
				+ tipoCombustivel + ", dataCadastro=" + dataCadastro + ", especificacoes=" + especificacoes
				+ ", proprietario=" + proprietario + "]";
	}
}
