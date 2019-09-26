package corridaAlunos;

import java.util.concurrent.Semaphore;

public class Principal {
	
public static Semaphore semaforo;

	public static void main(String[] args) {
		int alunos = 4;
		int porta = 1;
		semaforo = new Semaphore(porta);
		
	
			Thread corrida1 = new Controller( 1, semaforo);
			corrida1.start();
			Thread corrida2 = new Controller( 2, semaforo);
			corrida2.start();
			Thread corrida3 = new Controller( 3, semaforo);
			corrida3.start();
			Thread corrida4 = new Controller( 4, semaforo);
			corrida4.start();
		

	}

}
