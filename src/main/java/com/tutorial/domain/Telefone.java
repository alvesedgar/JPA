package com.tutorial.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telefone {

	
	private String prefixo;
	private String numero;
	private String ramal;
	
	
	public Telefone(String prefixo, String numero, String ramal) {
		super();
		this.prefixo = prefixo;
		this.numero = numero;
		this.ramal = ramal;
	}
	public Telefone() {
		super();
	}
	/**
	 * @return the prefixo
	 */
	@Column(length=3,nullable=false)
	public String getPrefixo() {
		return prefixo;
	}
	/**
	 * @param prefixo the prefixo to set
	 */
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	/**
	 * @return the numero
	 */
	@Column(length=9, nullable=false)
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the ramal
	 */
	@Column(length=5)
	public String getRamal() {
		return ramal;
	}
	/**
	 * @param ramal the ramal to set
	 */
	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((prefixo == null) ? 0 : prefixo.hashCode());
		result = prime * result + ((ramal == null) ? 0 : ramal.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (prefixo == null) {
			if (other.prefixo != null)
				return false;
		} else if (!prefixo.equals(other.prefixo))
			return false;
		if (ramal == null) {
			if (other.ramal != null)
				return false;
		} else if (!ramal.equals(other.ramal))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Telefone [prefixo=" + prefixo + ", numero=" + numero + ", ramal=" + ramal + "]";
	}
	
}
