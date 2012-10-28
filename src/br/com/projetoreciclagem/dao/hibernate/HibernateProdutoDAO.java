package br.com.projetoreciclagem.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.projetoreciclagem.business.entity.Produto;
import br.com.projetorecilcagem.dao.ProdutoDAO;

@Repository
public class HibernateProdutoDAO extends HibernateGenericDAO<Produto> implements ProdutoDAO {

	@Autowired
	public HibernateProdutoDAO(Class<Produto> classe,
			SessionFactory sessionfactory) {
		super(classe, sessionfactory);
		// TODO Auto-generated constructor stub
	}

}
