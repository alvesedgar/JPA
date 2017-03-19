package com.tutorial.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Cliente
 *
 */

@Entity
@Table(name="cliente")
public class Cliente extends Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private BigDecimal limiteCredito;
	private BigDecimal rendaMensal;
	private boolean bloqueado;
	
	

	public Cliente() {
		super();
	}



	public Cliente(BigDecimal limiteCredito, BigDecimal rendaMensal, boolean bloqueado) {
		super();
		this.limiteCredito = limiteCredito;
		this.rendaMensal = rendaMensal;
		this.bloqueado = bloqueado;
	}



	/**
	 * @return the limiteCredito
	 */
	@Column(name="limite_credito", nullable=true)
	public BigDecimal getLimiteCredito() {
		return limiteCredito;
	}



	/**
	 * @param limiteCredito the limiteCredito to set
	 */
	public void setLimiteCredito(BigDecimal limiteCredito) {
		this.limiteCredito = limiteCredito;
	}



	/**
	 * @return the rendaMensal
	 */
	@Column(name="renda_mensal", nullable=true)
	public BigDecimal getRendaMensal() {
		return rendaMensal;
	}



	/**
	 * @param rendaMensal the rendaMensal to set
	 */
	public void setRendaMensal(BigDecimal rendaMensal) {
		this.rendaMensal = rendaMensal;
	}



	/**
	 * @return the bloqueado
	 */
	@Column(nullable=true)
	public boolean isBloqueado() {
		return bloqueado;
	}



	/**
	 * @param bloqueado the bloqueado to set
	 */
	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (bloqueado ? 1231 : 1237);
		result = prime * result + ((limiteCredito == null) ? 0 : limiteCredito.hashCode());
		result = prime * result + ((rendaMensal == null) ? 0 : rendaMensal.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (bloqueado != other.bloqueado)
			return false;
		if (limiteCredito == null) {
			if (other.limiteCredito != null)
				return false;
		} else if (!limiteCredito.equals(other.limiteCredito))
			return false;
		if (rendaMensal == null) {
			if (other.rendaMensal != null)
				return false;
		} else if (!rendaMensal.equals(other.rendaMensal))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Cliente [limiteCredito=" + limiteCredito + ", rendaMensal=" + rendaMensal + ", bloqueado=" + bloqueado
				+ "]";
	}


	
	
}
