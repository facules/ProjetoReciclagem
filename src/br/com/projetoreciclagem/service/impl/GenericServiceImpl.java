package br.com.projetoreciclagem.service.impl;

import java.util.List;

import br.com.projetoreciclagem.business.entity.Produto;
import br.com.projetoreciclagem.service.GenericService;
import br.com.projetorecilcagem.dao.GenericDAO;

public class GenericServiceImpl implements GenericService<Produto>{

	private GenericDAO dao;
	
	@Override
	public void adicionar(Produto entidade) throws Exception {
		// TODO Auto-generated method stub
		dao.adicionar(entidade);
	}

	@Override
	public void alterar(Produto entidade) throws Exception {
		// TODO Auto-generated method stub
		dao.alterar(entidade);
	}

	@Override
	public void deletar(Produto entidade) throws Exception {
		// TODO Auto-generated method stub
		dao.deletar(entidade);
		
	}

	@Override
	public List<Produto> list() {
		// TODO Auto-generated method stub
	
		return 	dao.list();
	}

	@Override
	public Produto buscar(long id) {
		// TODO Auto-generated method stub
		return (Produto) dao.buscar(id);
	}

}
