package semaforoExercicio;

import java.text.BreakIterator;
import java.util.concurrent.Semaphore;

public class Controller extends Thread {
	
	private int idCar;
	private static int posatravessou;
	private static int posparado;
	private Semaphore semaforo;
	
	
	public  Controller(int idCar, Semaphore semaforo ) {
	
		this.idCar = idCar;
		this.semaforo = semaforo;
		
		
	}
	
	public void run() {
		try {
			semaforo.acquire();
			cruzamento();
		} catch (Exception e) {
			// TODO: handle exception
		}
		semaforo.release();
		
	}

	private void cruzamento() {
		aguardando();
		sentido();
				
		}

	private void aguardando() {
		int tempofarol = (int) ((Math.random() + 1)* 5000);
	switch(idCar) {
	case 1:
		System.out.println("O Primeiro carro está aguardando o semaforo");
	break;
	case 2:
		System.out.println("O Segundo carro está aguardando o semaforo");
		break;
	case 3:
		System.out.println("O Terceiro carro está aguardando o semaforo");
		break;
	case 4:
	System.out.println("O Quarto carro está aguardando o semaforo");
		break;
	}
		try {
			Thread.sleep(tempofarol);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private void sentido() {
		switch(idCar) {
		case 1:
			System.out.println("O Primeiro carro está atravessando o semaforo no sentido Sul");
		break;
		case 2:
			System.out.println("O Segundo carro está atravessando o semaforo no sentido Norte");
			break;
		case 3:
			System.out.println("O Terceiro carro está atravessando o semaforo no sentido Leste");
			break;
		case 4:
		System.out.println("O Quarto carro está atravessando o semaforo no sentido Oeste");
			break;
		
		}
		
	}
	
	
	
	
	}
		
	
	

