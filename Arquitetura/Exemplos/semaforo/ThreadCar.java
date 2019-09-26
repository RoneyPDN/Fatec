package semaforo;

import java.util.concurrent.Semaphore;

public class ThreadCar extends Thread{

	private int idCar;
	private static int posChegada;
	private static int posSaida;
	private Semaphore semaforo;
	
	
	public ThreadCar(int idCar, Semaphore semaforo){
		this.idCar = idCar;
		this.semaforo = semaforo;
	}
	
	public void run (){
				carroAndando();
				try {
					semaforo.acquire();
					carroParado();
					carroSaindo();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
				
				semaforo.release();
	}
	}
	
	private void carroAndando(){
		int disFinal = (int) ((Math.random()*2001) + 1000);
		int disPercorrida = 0;
		int deslocamento = (int) ((Math.random() * 6) + 10);
		int tempo = 30;
		while(disPercorrida < disFinal){
			disPercorrida += deslocamento;
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Carro " + idCar + " andou " + disPercorrida + " Metros");
		}
		posChegada++;
		System.out.println("Carro " + idCar + " foi o" + posChegada + "° carro a chegar");
	}
	
	private void carroParado(){
		System.out.println("Carro " + idCar + " Estacionou");
		int tempoParado = (int) ((Math.random()* 20501) + 500);
		try {
			Thread.sleep(tempoParado);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	private void carroSaindo(){
		posSaida ++;
		System.out.println(" O carro " + idCar + " foi o " + posSaida + " a sair" );
	}
	

	}


