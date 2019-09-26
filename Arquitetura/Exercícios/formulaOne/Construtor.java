package formulaOne;

import java.util.concurrent.Semaphore;

public class Construtor extends Thread {
	private Semaphore aguardando = new Semaphore(1);
	private Semaphore correndo;
	private static int colocacao1;
	private static int colocacao2;
	private static int n;
	private int carro;
	private static int melhorvolta;
	private static int contavolta;
	
	public Construtor(int carro ) {
	
		this.carro = carro;
		
	}
	
	public void run() {
		
			try {
				aguardando.acquire();
				carroaguarda();
				corrida();
				System.out.println("Este carro n° " + carro + " percorreu " + melhorvolta + " de tempo em voltas");
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			aguardando.release();
		
			
			
				
			
			
	}

	private int corrida() {
		int inicio =0;
		int cfinal = 3000;
		
		
		int primeira = 0;
		int segunda= 0;
		int terceira = 0;
		while (inicio < cfinal) {
			int correndo =  (int) ((Math.random() * 1) *10);
			System.out.println("Este carro n°" + carro + " esta percorrendo " + inicio + " Metros");
			inicio += correndo;
			contavolta++;
			
			if (inicio >= 1000 && inicio <=1050) {
				System.out.println("\n" + contavolta);
				primeira = contavolta;
				contavolta = 0;
			}else if (inicio >= 2000 && inicio <= 2050) {
				System.out.println("\n" + contavolta);
				segunda = contavolta;
				contavolta = 0;
			}else if (inicio >= 3000 && inicio <= 3050) {
				System.out.println("\n" + contavolta);
				terceira = contavolta;
				contavolta = 0;
			}
		
		}
		if(primeira < segunda && primeira < terceira) {
			melhorvolta = primeira;
		}else if (segunda < primeira && segunda < terceira) {
			melhorvolta = segunda;
		}else if(terceira < primeira && terceira < segunda) {
			melhorvolta = terceira;
		}
	
		return melhorvolta;
	}


	private void carroaguarda() {
		System.out.println(" O segundo carro deste time, esta aguardando...");
		int tempo = 10000;
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
}
