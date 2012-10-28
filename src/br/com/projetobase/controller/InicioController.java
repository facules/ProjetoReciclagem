package br.com.projetobase.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Resource;
import br.com.projetobase.business.entity.HelloWorld;
import br.com.projetobase.dao.HelloWorldDAO;

@Resource
public class InicioController {
	
	@Autowired
	private HelloWorldDAO helloWorldDao;
	
	public InicioController() {}
	
	public void hello(){
		System.out.println("Ola Mundo!");
	}
	
	public void testarBancoDeDados() {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setDescricao("Ola Mundo!");
		
		helloWorldDao.adicionar(helloWorld);

		System.out.println("Adicionou!");
	}

}
