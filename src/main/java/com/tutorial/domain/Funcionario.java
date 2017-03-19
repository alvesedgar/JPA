package com.tutorial.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Funcionario
 *
 */

@Entity
@Table(name="funcionario")
public class Funcionario extends Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private BigDecimal salario;
	private String cargo;

	public Funcionario() {
		super();
	}

	
	public Funcionario(BigDecimal salario, String cargo) {
		super();
		this.salario = salario;
		this.cargo = cargo;
	}

	/**
	 * @return the salario
	 */
	@Column(nullable=true)
	public BigDecimal getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	/**
	 * @return the cargo
	 */
	@Column(length=60, nullable=true)
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", cargo=" + cargo + "]";
	}
   
}
