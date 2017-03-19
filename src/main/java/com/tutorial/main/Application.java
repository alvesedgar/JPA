package com.tutorial.main;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
//	    Veiculo veiculo=manager.find(Veiculo.class, 4L);
//
//	    tx.commit();
//
//	    manager.close();
//	    
//	    veiculo.setValor(veiculo.getValor().add(new BigDecimal(500)));
//	    
//	    manager=PersistenceManager.INSTANCE.getEntityManager();
//	    tx=manager.getTransaction();
//	    tx.begin();
//	    veiculo=manager.merge(veiculo);

//		4.2 Composite Keys
	    
	    
//	    Veiculo veiculo= new Veiculo();
//	    veiculo.setId(new VeiculoId("61-FV-72","Setubal"));
//	    veiculo.setAnoFabricacao(2006);
//	    veiculo.setAnoModelo(2008);
//	    veiculo.setFabricante("Opel");
//	    veiculo.setModelo("Astra");
//	    veiculo.setValor(BigDecimal.valueOf(19000.00));
//	    veiculo.setTipoCombustivel(TipoCombustivel.DIESEL);
//	    
//	    manager.persist(veiculo);
//	    
//	    VeiculoId id=new VeiculoId("61-FV-72","Setubal"); 
//	    
//	    Veiculo veiculo2=manager.find(Veiculo.class, id);
//	    System.out.println(veiculo2.toString());

//	    Veiculo veiculo= new Veiculo();
//	    veiculo.setId(new VeiculoId("71-FV-61","Setubal"));
//	    veiculo.setAnoFabricacao(2006);
//	    veiculo.setAnoModelo(2008);
//	    veiculo.setFabricante("Opel");
//	    veiculo.setModelo("Astra");
//	    veiculo.setValor(BigDecimal.valueOf(19000.00));
//	    veiculo.setTipoCombustivel(TipoCombustivel.DIESEL);
//	    veiculo.setDataCadastro(new Date());
//	    manager.persist(veiculo);
//	    
//	    VeiculoId id=new VeiculoId("71-FV-61","Setubal"); 
//	    
//	    Veiculo veiculo2=manager.find(Veiculo.class, id);
//	    System.out.println(veiculo2.toString());
	    

	    //LOB objects
//	    StringBuilder especificacoes=new StringBuilder();
//	    especificacoes.append("1- asdasdasdasdasd");
//	    especificacoes.append("2- asdasdasdasdasd");
//	    especificacoes.append("3- asdasdasdasdasd");
//	    especificacoes.append("4- asdasdasdasdasd");
//	    especificacoes.append("5- asdasdasdasdasd");
//	    especificacoes.append("6- asdasdasdasdasd");
//	    
//	    Veiculo veiculo= new Veiculo();
//	    veiculo.setId(new VeiculoId("01-FP-61","Setubal"));
//	    veiculo.setAnoFabricacao(2006);
//	    veiculo.setAnoModelo(2008);
//	    veiculo.setFabricante("Opel");
//	    veiculo.setModelo("Astra");
//	    veiculo.setValor(BigDecimal.valueOf(19000.00));
//	    veiculo.setTipoCombustivel(TipoCombustivel.DIESEL);
//	    veiculo.setDataCadastro(new Date());
//	    veiculo.setEspecificacoes(especificacoes.toString());
//	    Proprietario proprietario= new Proprietario("Edgar", "966821778", "alves.edgar@gmail.com");
//	    manager.persist(proprietario);
//	    veiculo.setProprietario(proprietario);
//	    manager.persist(veiculo);
//	    
//	    VeiculoId id=new VeiculoId("01-FP-61","Setubal"); 
//	    
//	    Veiculo veiculo2=manager.find(Veiculo.class, id);
//	    System.out.println(veiculo2.toString());
//	    

	    //Associação Bidirecional 
	    
//	    Proprietario proprietario= new Proprietario("Edgar", "966821778", "alves.edgar@gmail.com");
//	    proprietario=manager.find(Proprietario.class, 5L);
//	    System.out.println(proprietario.toString());

// 4.9 Associações muitos para um 
//	    Proprietario proprietario= new Proprietario("Alves", "966821778", "alves.edgar@gmail.com");	    
//	    manager.persist(proprietario);
//	    Veiculo veiculo1=new Veiculo();
//	    VeiculoId id1=new VeiculoId("23-FV-34","Lisboa");
//	    veiculo1.setId(id1);
//	    veiculo1.setFabricante("SEAT");
//	    veiculo1.setModelo("Ateca");
//	    veiculo1.setAnoModelo(2016);
//	    veiculo1.setAnoFabricacao(2016);
//	    veiculo1.setValor(new BigDecimal(29000000));
//	    veiculo1.setTipoCombustivel(TipoCombustivel.DIESEL);
//	    veiculo1.setDataCadastro(new Date());
//	    veiculo1.setProprietario(proprietario);
//	    
//	    manager.persist(veiculo1);
//
//	    Veiculo veiculo2=new Veiculo();
//	    VeiculoId id2=new VeiculoId("23-FV-98","Lisboa");
//	    
//	    veiculo2.setId(id2);
//	    veiculo2.setFabricante("SEAT");
//	    veiculo2.setModelo("Leon");
//	    veiculo2.setAnoFabricacao(2016);
//	    veiculo2.setAnoModelo(2000);
//	    veiculo2.setValor(new BigDecimal(29000000));
//	    veiculo2.setTipoCombustivel(TipoCombustivel.DIESEL);
//	    veiculo2.setDataCadastro(new Date());
//	    veiculo2.setProprietario(proprietario);
//	    
//	    manager.persist(veiculo2);
	    
//	    Proprietario prop=manager.find(Proprietario.class, 13L);
//	    
//	    System.out.println("Proprietario: "+prop.getNome());
//	    
//	    for(Veiculo veiculo:prop.getVeiculos()){
//	    	System.out.println(veiculo.getModelo());
//	    }
	    
//	    Acessorio alarme=new Acessorio();
//	    alarme.setDescricao("Alarme");
//	    
//	    Acessorio arCodicionado=new Acessorio();
//	    arCodicionado.setDescricao("Ar Condicionado");
//	    
//	    Acessorio bancosDeCouro=new Acessorio();
//	    bancosDeCouro.setDescricao("Bancos de Couro");
//	    
//	    Acessorio direcaoHidraulica=new Acessorio();
//	    direcaoHidraulica.setDescricao("Direção Hidraulica");
//	    
//	    manager.persist(alarme);
//	    manager.persist(bancosDeCouro);
//	    manager.persist(arCodicionado);
//	    manager.persist(direcaoHidraulica);
//
//	    Veiculo veiculo1=new Veiculo();
//	    VeiculoId id1=new VeiculoId("23-AA-34","Lisboa");
//	    veiculo1.setId(id1);
//	    veiculo1.setFabricante("SEAT");
//	    veiculo1.setModelo("Ateca");
//	    veiculo1.setAnoModelo(2016);
//	    veiculo1.setAnoFabricacao(2016);
//	    veiculo1.setValor(new BigDecimal(29000000));
//	    veiculo1.setTipoCombustivel(TipoCombustivel.DIESEL);
//	    veiculo1.setDataCadastro(new Date());
//	    veiculo1.getAcessorios().add(direcaoHidraulica);
//	    veiculo1.getAcessorios().add(bancosDeCouro);
//	    manager.persist(veiculo1);
//	    
//	    
//	    Veiculo veiculo2=new Veiculo();
//	    VeiculoId id2=new VeiculoId("23-SS-98","Lisboa");
//	    veiculo2.setId(id2);
//	    veiculo2.setFabricante("SEAT");
//	    veiculo2.setModelo("Leon");
//	    veiculo2.setAnoFabricacao(2016);
//	    veiculo2.setAnoModelo(2000);
//	    veiculo2.setValor(new BigDecimal(29000000));
//	    veiculo2.setTipoCombustivel(TipoCombustivel.DIESEL);
//	    veiculo2.setDataCadastro(new Date());
//	    veiculo2.getAcessorios().add(alarme);
//	    veiculo2.getAcessorios().add(arCodicionado);
//	    manager.persist(veiculo2);
	    
//	    Veiculo veiculo=manager.find(Veiculo.class, new VeiculoId("23-SS-98","Lisboa"));
//	    for(Acessorio acessorio:veiculo.getAcessorios()){
//	    	System.out.println("Acessorio: "+acessorio.getDescricao());
//	    }

	    
//	    Proprietario proprietario=new Proprietario();
//	    proprietario.setNome("Edgar Barradas Alves");
//	    proprietario.getTelefones().add("966821778");
//	    proprietario.getTelefones().add("211234234234");
//	    manager.persist(proprietario);
	    

//	    Proprietario proprietario=manager.find(Proprietario.class, 18L);
//	    
//	    for(String telefone:proprietario.getTelefones()){
//	    	System.out.println("Telefone:"+telefone);
//	    }

	    
//	    Proprietario proprietario=new Proprietario();
//	    proprietario.setNome("Jhon Doe");
//	    proprietario.getTelefones().add(new Telefone("34","1234-5678","104"));
//	    proprietario.getTelefones().add(new Telefone("11","9876-5432",null));
//	    
//	    manager.persist(proprietario);

//	    Funcionario funcionario=new Funcionario();
//	    funcionario.setCargo("Gerente");
//	    funcionario.setNome("Edgar");
//	    funcionario.setSalario(new BigDecimal(12_000));
//	    
//	    Cliente cliente=new Cliente();
//	    cliente.setNome("Miss daisy");
//	    cliente.setRendaMensal(new BigDecimal(8_500));
//	    cliente.setLimiteCredito(new BigDecimal(2_000));
//	    cliente.setBloqueado(true);
	    
//	    manager.persist(funcionario);
//	    manager.persist(cliente);

//	    List<Pessoa> pessoas=manager.createQuery("from Pessoa", Pessoa.class).getResultList();
//	    
//	    for(Pessoa pessoa: pessoas){
//	    	System.out.println(pessoa.getNome());
//	    	if(pessoa instanceof Cliente){
//	    		System.out.println(" - é um cliente");
//	    	}else{
//	    		System.out.println(" - é um funcionario");
//	    	}
//	    }

	    
//	    Categoria categoria=new Categoria();
//	    categoria.setNome("Bebidas");
//	    
//	    Produto produto1=new Produto();
//	    produto1.setName("Refrigerante");
//	    produto1.setCategoria(categoria);
//	    
//	    Produto produto2=new Produto();
//	    produto2.setName("Água");
//	    produto2.setCategoria(categoria);
//
//	    Produto produto3=new Produto();
//	    produto3.setName("Cerveja");
//	    produto3.setCategoria(categoria);
//
//	    manager.persist(categoria);
//	    manager.persist(produto1);
//	    manager.persist(produto2);
//	    manager.persist(produto3);

//	    Produto produto=manager.find(Produto.class, 25L);
//	    System.out.println("Nome: " + produto.getName());
//	    System.out.println("Categoria: "+produto.getCategoria().getNome());
	    
//	    Produto produto=manager.find(Produto.class, 25L);
//	    System.out.println("Nome: " + produto.getName());
//
//	    tx.commit();
//	    manager.close();
//
//	    System.out.println("Categoria: "+produto.getCategoria().getNome());

//	    Categoria categoria=manager.find(Categoria.class, 24L);
//	    System.out.println("Categoria: "+categoria.getNome());
//	    
//	    for(Produto produto: categoria.getProdutos()){
//	    	System.out.println("Produtos: "+produto.getName());
//	    }

//	    Categoria categoria=new Categoria();
//	    categoria.setNome("Bebidas");
//	    
//	    Produto produto1=new Produto();
//	    produto1.setName("Refrigerante");
//	    produto1.setCategoria(categoria);
//
//	    manager.persist(produto1);

//	    Categoria categoria=manager.find(Categoria.class, 31L);
//	    manager.remove(categoria);
	    
	    
	    
//	    Produto produto2=new Produto();
//	    produto2.setName("Água");
//	    produto2.setCategoria(categoria);
//
//	    Produto produto3=new Produto();
//	    produto3.setName("Cerveja");
//	    produto3.setCategoria(categoria);
//
//	    manager.persist(categoria);
//	    manager.persist(produto2);
//	    manager.persist(produto3);
	    
	    
//	    Usuario user=new Usuario();
//	    user.setEmail("alves.edgar@gmai.com");
//	    user.setAtivo(true);
//
//	    Usuario user1=new Usuario();
//	    user1.setEmail("edy19_273@hotmai.com");
//	    user1.setAtivo(true);
//	    
//	    manager.persist(user);
//	    manager.persist(user1);


//	    Query query=manager.createQuery("update Usuario set ativo=false where email like :email");
//	    query.setParameter("email","%hotmai.com");
//	    
//	    int linhasAfetadas=query.executeUpdate();
//	    
//	    System.out.println(linhasAfetadas+ " registos atualizados.");
	    
	    Calendar dataNascimento=Calendar.getInstance();
	    dataNascimento.set(2011, 2, 1);
	    
//	    Animal animal=new Animal();
//	    animal.setNome("Mimosa");
//	    animal.setDataNascimento(dataNascimento.getTime());
//	    animal.setDataUltimaAtualizacao(new Date());
//	    
//	    System.out.println("Idade antes de persistir: "+animal.getIdade());
//	    
//	    manager.persist(animal);
//	    
//	    System.out.println("Idade depois de persistir:"+animal.getIdade());
	    

//	    Animal animal=new Animal();
//	    animal.setNome("Campeao");
//	    animal.setDataNascimento(dataNascimento.getTime());
//	    
//	    manager.persist(animal);
	    
//	    CentroCusto cc1=new CentroCusto();
//	    cc1.setNome("Tecnologia");
//	    
//	    
//	    CentroCusto cc2=new CentroCusto();
//	    cc2.setNome("Comercial");
//	    
//	    manager.persist(cc1);
//	    manager.persist(cc2);

//	    CentroCusto cc1=manager.find(CentroCusto.class, 38L);
//	    System.out.println("Centro de Custos:"+cc1.getNome());

	    
//	    Query query=manager.createQuery("from Veiculo where anoFabricacao=2016");
//	    List<Veiculo> veiculos=query.getResultList();
//	    
//	    for(Veiculo veiculo:veiculos){
//	    	System.out.println(veiculo.getModelo() + " "+veiculo.getFabricante()+": "+veiculo.getAnoFabricacao());
//	    }
	    
//	    Query query=manager.createQuery("from Veiculo where anoFabricacao >=:ano and valor <=:preco");
//	    query.setParameter("ano", 2014);
//	    query.setParameter("preco", new BigDecimal(400000_000));
//	    List<Veiculo> veiculos=query.getResultList();
//	    
//	    for(Veiculo veiculo:veiculos){
//	    	System.out.println(veiculo.getModelo() + " "+veiculo.getFabricante()+": "+veiculo.getAnoFabricacao());
//	    }

//	    TypedQuery<Veiculo> query=manager.createQuery("from Veiculo",Veiculo.class);
//
//	    List<Veiculo> veiculos=query.getResultList();
//	    
//	    for(Veiculo veiculo:veiculos){
//	    	System.out.println(veiculo.getModelo() + " "+veiculo.getFabricante()+": "+veiculo.getAnoFabricacao());
//	    }

	    
//	    TypedQuery<Veiculo> query=manager.createQuery("from Veiculo",Veiculo.class);
//	    query.setFirstResult(0);
//	    query.setMaxResults(3);
//	    
//	    List<Veiculo> veiculos=query.getResultList();
//	    
//	    for(Veiculo veiculo:veiculos){
//	    	System.out.println(veiculo.getModelo() + " "+veiculo.getFabricante()+": "+veiculo.getAnoFabricacao());
//	    }


	    // Projeções
	    
//	    TypedQuery<String> query=manager.createQuery("select modelo from Veiculo",String.class);
//	    List<String> modelos=query.getResultList();
//	    
//	    for(String modelo: modelos){
//	    	System.out.println("Modelo: "+modelo);
//	    }
	    
//	    TypedQuery<Proprietario> query=manager.createQuery("select p from Proprietario p inner join p.veiculos v", Proprietario.class);	    
//	    List<Proprietario> proprietarios=query.getResultList();
//	    
//	    for(Proprietario proprietario: proprietarios){
//	    	System.out.println(proprietario.getNome());
//	    }
	    

	    //Critéria API
	    
//	    CriteriaBuilder builder=manager.getCriteriaBuilder();
//	    CriteriaQuery<Veiculo> criteriaQuery=builder.createQuery(Veiculo.class);
//	    
//	    Root<Veiculo> veiculo=criteriaQuery.from(Veiculo.class);
//	    criteriaQuery.select(veiculo);
//	    
//	    TypedQuery<Veiculo> query=manager.createQuery(criteriaQuery);
//	    List<Veiculo> veiculos=query.getResultList();
//	    
//	    for(Veiculo v: veiculos){
//	    	System.out.println(v.getModelo());
//	    }
	    
//	    CriteriaBuilder builder=manager.getCriteriaBuilder();
//	    CriteriaQuery<Veiculo> criteriaQuery=builder.createQuery(Veiculo.class);
//	    
//	    Root<Veiculo> veiculo=criteriaQuery.from(Veiculo.class);
//	    Predicate predicate=builder.not(builder.equal(veiculo.get("tipoCombustivel"), TipoCombustivel.BIOCOMBUSTVEL));
//	    criteriaQuery.select(veiculo);
//	    criteriaQuery.where(predicate);
//	    
//	    TypedQuery<Veiculo> query=manager.createQuery(criteriaQuery);
//	    List<Veiculo> veiculos=query.getResultList();
//	    
//	    for(Veiculo v: veiculos){
//	    	System.out.println(v.getModelo());
//	    }
	    

//	    CriteriaBuilder builder=manager.getCriteriaBuilder();
//	    CriteriaQuery<String> criteriaQuery=builder.createQuery(String.class);
//	    
//	    Root<Veiculo> veiculo=criteriaQuery.from(Veiculo.class);
//	    criteriaQuery.select(veiculo.<String>get("modelo"));
//	    
//	    
//	    TypedQuery<String> query=manager.createQuery(criteriaQuery);
//	    List<String> modelos=query.getResultList();
//	    
//	    for(String modelo: modelos){
//	    	System.out.println("Modelo: "+modelo);
//	    }
	    

	    CriteriaBuilder builder=manager.getCriteriaBuilder();
	    CriteriaQuery<BigDecimal> criteriaQuery=builder.createQuery(BigDecimal.class);
	    
	    Root<Veiculo> veiculo=criteriaQuery.from(Veiculo.class);
	    criteriaQuery.select(builder.sum(veiculo.<BigDecimal>get("valor")));
	    
	    TypedQuery<BigDecimal> query=manager.createQuery(criteriaQuery);
	    BigDecimal total=query.getSingleResult();
	    
	    System.out.println("Valor Total:"+total);
	    
	    
	    
	    
	    
	    tx.commit();
	    manager.close();

//	    System.out.println("--------------");
//	    EntityManager manager2 = PersistenceManager.INSTANCE.getEntityManager();
//	    EntityTransaction tx2=manager2.getTransaction();
//
//	    tx2.begin();
//
//	    CentroCusto cc2=manager2.find(CentroCusto.class, 38L);
//	    System.out.println("Centro de Custos:"+cc2.getNome());
//
//	    tx2.commit();
//	    manager2.close();
	    
	    PersistenceManager.INSTANCE.close();
	}
}
