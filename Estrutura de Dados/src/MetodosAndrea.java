
public class MetodosAndrea {
	private int dados[];
	private int tamanho;

	public MetodosAndrea(int capMax) {
		dados = new int[capMax];
		tamanho = 0;
		
	}
	
	
	public boolean cheia(){
		return tamanho == dados.length;
		
		
	}
	
	public boolean vazia(){
		return tamanho == 0;
	}
	
	
	public void adicionaInicio(int e) {
		if(cheia()) {
			System.out.println("Infelizmente a lista está cheia!!");
			}
				for(int i = tamanho; i >= 1; i = i - 1) {
					dados[i] = dados[ i - 1];
				}
				dados[0] = e;
				tamanho++;
			
		
	}
	
	
	public String leiTura() {
		String s = " ";
		for(int i = 0; i <= tamanho;i++) {
			s =  s + dados[i];
			}
		return s + " ";
	}
	
	
	public int removeInicio() {
		int r = -1;
		if(vazia()){
			System.out.println(" Infelizmente a lista está vazia!");
		}
		for(int i = 0; i <= tamanho;i++) {
			dados[i - 1] = dados[1];
		}
		return r;
	}
	
	
	public int removeFinal(){
		int r = -1;
		if(vazia()){
			System.out.println(" Infelizmente a lista está vazia!");
		}else{
			r = dados[tamanho-1];
			tamanho--;
		}
		return r;
		
	}
	
	
	public void adicionaFinal(int e){
				
		if(vazia()){
			System.out.println(" Infelizmente a lista está vazia!");
		}else if(cheia()){
			System.out.println("Infelizmente a lista está cheia!!");
		}else{
			tamanho++;
			dados[tamanho] = e;
			}
	}
	
	
	public void obtemPrimeiro(){
		System.out.println(" O Primeiro número selecionado = " + dados[0]);
	}
	
	public void obtemUltimo(){
		System.out.println(" O Último número selecionado = " + dados[tamanho -1]);
		
	}
	
}

