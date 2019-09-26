package montados;

public class Ordem {

	No base;
	No topo;
	
	public Ordem() {
		topo = null;
	}
	
	public boolean vazia() {
		return topo == null;
	}
	
	public void adiciona (int e) {
		No novo = new No (e);
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
	public int remove () {
		int t = -1;
		if(vazia()) {
			System.out.println("Lista vazia");
		}else {
			t = topo.dado;
			topo = topo.prox;
			topo.ant = null;
		}
		return t;
	}
	
	public void percorre() {
		No aux;
		aux = topo;
		while(aux!= null) {
			System.out.println( " Núumero " + aux.dado);
			aux = aux.prox;
		}
	}
	
	public void percorreA() {
		No aux;
		aux = base;
		while(aux!= null) {
			System.out.println( " Núumero " + aux.dado);
			aux = aux.ant;
		}
	
	}
	
}
