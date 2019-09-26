package corridaAlunos;

import java.util.concurrent.Semaphore;

public class Controller extends Thread{
	
	private int chegada = 1000;
	private Semaphore semaforo;
	private int numaluno;
	
	public Controller (int numAluno, Semaphore semaforo) {
	this.numaluno = numAluno;
	this.semaforo = semaforo;
		
	}
	
	public void run() {
		try {
			correndo();
			semaforo.acquire();
			
			esperandoporta();
			alunoentra();
		} catch (Exception e) {
			// TODO: handle exception
		}
		semaforo.release();
		
	}

	private void correndo() {
		System.out.println("O aluno N° " + numaluno + " esta correndo!");
	int correndo = (int) ((Math.random() + 10) * 5);	
	int inicio = 0;
	int tempo = 40;
		while(inicio < chegada){
			inicio += correndo;
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("O aluno " + numaluno + " esta correndo " + inicio + " metros");
		}
	}
	
	public void esperandoporta() {
		System.out.println("O aluno " + numaluno + " esta esperando ");
		int espera = 2;
		try {
			Thread.sleep(espera);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	private void alunoentra() {
		System.out.println("O aluno " + numaluno + " entrou na sala ");
	}
	
}
