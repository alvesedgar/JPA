package com.tutorial.main;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.tutorial.domain.Veiculo;
import com.tutorial.utils.PersistenceManager;

public class Application {

	public static void main(String[] args) {
		
	    EntityManager manager = PersistenceManager.INSTANCE.getEntityManager();
	    EntityTransaction tx=manager.getTransaction();

	    tx.begin();

//		2.9 persist object on database
	    
//	    Veiculo veiculo=new Veiculo();
//	    veiculo.setFabricante("Opel");
//	    veiculo.setModelo("Astra");
//	    veiculo.setAnoFabricacao(2008);
//	    veiculo.setAnoModelo(2006);
//	    veiculo.setValor(BigDecimal.valueOf(4850));
//	    
//	    manager.persist(veiculo);
	    

//		2.10 retrieve object 
//		2.10.1 retrieve object by Id	    
//	    Veiculo veiculo=manager.find(Veiculo.class, 3L);
//	    
//	    System.out.println(veiculo);

//		2.10.1 retrieve object by reference
//	    Veiculo veiculo=manager.getReference(Veiculo.class, 3L);
//	    System.out.println("Before call getter's");
//	    System.out.println("Veiculo de código "+veiculo.getCodigo() + " é um "+veiculo.getModelo());

//		2.11 List Object using JPQL
//	    Query query=manager.createQuery("from Veiculo");
//	    List<Veiculo> veiculos=query.getResultList();
//	    
//	    for(Veiculo veiculo:veiculos){
//	    	System.out.println(veiculo.toString());
//	    }

//		2.12 update object
//	    Veiculo veiculo=manager.find(Veiculo.class, 3L);
//	    System.out.println(String.format("Current value %s",veiculo.getValor().intValue()));
//	    veiculo.setValor(veiculo.getValor().add(BigDecimal.valueOf(500)));
//	    System.out.println(String.format("After changing value %d",veiculo.getValor().intValue()));

//		2.13 delete object
//	    Veiculo veiculo=manager.find(Veiculo.class, 3L);
//	    
//	    manager.remove(veiculo);
	    
// 		3.2 Persist Context

//	    3.2.1 L1 Cache
//	    Veiculo v1=manager.find(Veiculo.class, 4L);
//	    System.out.println("First retrived object "+v1.toString());
//	    Veiculo v2=manager.find(Veiculo.class, 4L);
//	    System.out.println("Second retrived object "+v2.toString());
//	    
//	    System.out.println("Is the same objects ? "+(v1==v2));

	    
//	    3.2.1 Detached object
	    
//	    Veiculo v1=manager.find(Veiculo.class, 4L);
//	    System.out.println("First retrived object "+v1.toString());
//
//	    System.out.println("Managed: "+manager.contains(v1));
//	    manager.detach(v1);
//	    System.out.println("Managed: "+manager.contains(v1));
//	    Veiculo v2=manager.find(Veiculo.class, 4L);
//	    System.out.println("Second retrived object "+v2.toString());
//	    
//	    System.out.println("Is the same objects ? "+(v1==v2));

// 		3.2.2 Synchronization
	    
//	    Veiculo veiculo=manager.find(Veiculo.class, 4L);
//	    System.out.println("Current value:"+veiculo.getValor());
//	    veiculo.setValor(veiculo.getValor().add(new BigDecimal(500)));
//	    System.out.println("New value:"+veiculo.getValor());
	     
// 		3.2.2 Synchronization using flush operation
//	    Veiculo veiculo=manager.find(Veiculo.class, 4L);
//	    System.out.println("Current value:"+veiculo.getValor());
//	    veiculo.setValor(veiculo.getValor().add(new BigDecimal(500)));
//	    manager.flush();
//	    System.out.println("New value:"+veiculo.getValor());

	    
//		3.4 Save detached Objects with merge	    
	    Veiculo veiculo=manager.find(Veiculo.class, 4L);

	    tx.commit();

	    manager.close();
	    
	    veiculo.setValor(veiculo.getValor().add(new BigDecimal(500)));
	    
	    manager=PersistenceManager.INSTANCE.getEntityManager();
	    tx=manager.getTransaction();
	    tx.begin();
	    veiculo=manager.merge(veiculo);
	    tx.commit();
	    manager.close();
	    PersistenceManager.INSTANCE.close();
	}
}
