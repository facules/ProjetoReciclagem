package br.com.projetoreciclagem.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Resource;
import br.com.projetoreciclagem.business.entity.HelloWorld;
import br.com.projetoreciclagem.business.entity.Produto;
import br.com.projetoreciclagem.dao.HelloWorldDAO;
import br.com.projetoreciclagem.service.ProdutoService;

@Resource
public class InicioController {
	
	@Autowired
	private HelloWorldDAO helloWorldDao;
	@Autowired
	private ProdutoService produtoservice;
	public InicioController() {}
	
	public void testarProduto(){
		Produto produto=new Produto();
		produto.setCodigo(1);
		produto.setDescricao("placa mae danificada");
		produto.setProduto("placa mae");
		
		try {
			produtoservice.adicionar(produto);
			System.out.println("produto: "+produto.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
