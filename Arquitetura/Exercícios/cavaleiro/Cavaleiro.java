package cavaleiro;

import java.util.concurrent.Semaphore;

public class Cavaleiro extends Thread{
	private int inicio =0;
	private int movimento = (int) ((Math.random() * 2) + 2);
	private int chegada = 2000;
	private int cavaleiro;
	private static int porta =  (int)((Math.random() * 3) + 1);
	private int escolha = (int)((Math.random() * 3) + 1);
	
	private static int tocha = 1;
	Semaphore portas;
	private static int pedra= 1;
	
	public Cavaleiro(int cavaleiro, Semaphore portas){
		this.portas = portas;
		this.cavaleiro = cavaleiro;
	}
	
	public void run (){
		corrida();
		try {
			portas.acquire();
			saida();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		portas.release();
	}

	private void corrida() {
		if(cavaleiro == 0) {
			System.out.println(" O cavaleiro N° " + cavaleiro + " esta correndo devagar " );
			while (inicio < 2000){
				inicio += movimento * 30;
				System.out.println(" O cavaleiro N° " + cavaleiro + " esta correndo à " + inicio + " metros");
			}
		}else {
		while (inicio < 2000){
	
		inicio += movimento * 50;
		System.out.println(" O cavaleiro N° " + cavaleiro + " esta correndo à " + inicio + " metros");
		if(inicio >= 500 && tocha == 1){
				movimento = (int) ((Math.random() * 2) + 4);
				inicio += movimento * 50;
			tocha = 0;
			System.out.println("\n O cavaleiro N° " + cavaleiro + " pegou a tocha!\n");
		}
		
		if(inicio >= 1500 && pedra == 1){
			movimento = (int) ((Math.random() * 2) + 4);
			inicio += movimento * 50;
		pedra = 0;
		System.out.println("\n O cavaleiro N° " + cavaleiro + " pegou a Pedra!\n");
		}
		
		}
		}
	}
	public void saida(){
		
		if(porta == escolha){
			System.out.println("\nO cavaleiro N° " + cavaleiro + " enfrentou o monstro e se salvou! \n");
			porta = 0;
		}else {
			System.out.println("\nO cavaleiro N° " + cavaleiro + " foi devorado pelo monstro! \n");
		}
		

	}
}

