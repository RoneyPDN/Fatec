package roney.webaplication.dao;

import java.util.List;

import roney.webaplication.entidade.Entrega;

public interface EntregaDAO {
	void adicionar(Entrega e) throws DAOException;
	List<Entrega> pesquisar(String origem) throws DAOException;
	void removerPorID(long id) throws DAOException;

}
