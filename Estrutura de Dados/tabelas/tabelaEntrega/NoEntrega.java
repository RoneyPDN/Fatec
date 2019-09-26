package tabelaEntrega;

public class NoEntrega {

	NoEntrega prox;
	Entrega dado;
	NoEntrega ant;
	
	public NoEntrega(Entrega e) {
	
		prox = null;
		dado = e;
		ant = null;
		
	}

}
