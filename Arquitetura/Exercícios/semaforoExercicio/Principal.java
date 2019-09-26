package semaforoExercicio;

import java.util.concurrent.Semaphore;

public class Principal {
	public static Semaphore semaforo;
	public static void main(String[] args) {
		int totalcarros = 4;
		int farol = 2;
		semaforo = new Semaphore(farol);
		for (int i = 0; i <= totalcarros;i++) {
			Thread sem = new Controller(i,semaforo);
			sem.start();
			
		}
	}

}
