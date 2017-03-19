package com.tutorial.domain;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class AuditorAnimal {

	
	@PreUpdate
	@PrePersist
	public void alterarDataUltimaAtualizacao(Animal animal){
		animal.setDataUltimaAtualizacao(new Date());
	}
}
