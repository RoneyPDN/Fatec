package formulaOne;

import java.util.concurrent.Semaphore;

public class Principal {
	public static Semaphore semaforo;
	
	public static void main(String[] args) {
		int totalcarros = 1;
		semaforo = new Semaphore(1);
		for(int i = 0; i <=totalcarros ; i++) {
			Thread corridateste = new Construtor(i);
			Thread corridateste2 = new Construtor(i);
		corridateste.start();	
		
			
		}
		
	}

}
