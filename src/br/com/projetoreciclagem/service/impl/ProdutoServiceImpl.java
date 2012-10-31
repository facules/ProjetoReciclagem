package br.com.projetoreciclagem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoreciclagem.business.entity.Produto;
import br.com.projetoreciclagem.dao.ProdutoDAO;
import br.com.projetoreciclagem.service.ProdutoService;

@Service
public class ProdutoServiceImpl extends GenericServiceImpl<Produto> implements ProdutoService {
	
	private ProdutoDAO produtodao;
	@Autowired
	public ProdutoServiceImpl(ProdutoDAO produtodao){
		this.produtodao=produtodao;
	}
	
}
