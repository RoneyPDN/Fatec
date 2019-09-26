package tabelaEntrega;

public class ListadeEntrega {

	private NoEntrega topo;
	private NoEntrega base;
	
	public void ListadeEntrega() {
		topo = null;
		base = null;
		
	}
	
	public boolean vazia () {
		return topo == null;
		
	}
	
	public void adiciona (Entrega e){
		NoEntrega novo = new NoEntrega(e);
		if(vazia()) {
			topo = novo;
			base = novo;
		}else {
			topo.ant = novo;
			novo.prox = topo;
			topo = novo;
			topo.ant = null;
		}
	}
	
	public Entrega remove () {
		Entrega ret = null;
		if(vazia()) {
			System.out.println("!Erro! A Lista está vazia!");
		}else {
			ret = topo.dado;
			topo = topo.prox;
			topo.ant = null;
		}
		return ret;
	}
	
	
	public String percorre() {
		NoEntrega aux = topo;
		String tx = " ";
		while(aux != null) {
			tx = " " + aux.dado;
			aux = aux.prox;
		}
		return tx;
	}
	public String percorretraz() {
		NoEntrega aux = base;
		String tx = " ";
		while (aux != null) {
			tx = " " + aux.dado;
			aux = aux.ant;
		}
		return tx;
	}
	
	
}
