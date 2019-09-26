package sapofiveThreads;

import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ThreadSapos extends Thread {
	
	private JLabel sapos;
	private JButton iniciar;
	public static int inicio = 0;
	public static int saltos = 0;
	public static int tempo = 0;
	public  static int n;
	Random m = new Random();
	SapoConstructor p = new SapoConstructor(sapos, sapos, sapos, sapos, sapos, iniciar, sapos);
	
	public ThreadSapos(JLabel sapos, JButton iniciar) {
		this.sapos = sapos;
		this.iniciar = iniciar;
		
	}
	
		public void correSapos() {
			
			iniciar.setEnabled(false); 
			Rectangle posicao;
		 	posicao = sapos.getBounds(); 
		 	sapos.setBounds(posicao);
		 	n = inicio;
			while (n <= 3000) {
				saltos = m.nextInt(100);
				n += saltos;
			 		if (saltos <= 30) { 
			 	 	 	posicao.x = posicao.x + 30 ; 
			 	 	} else { 
			 	 	 	if (saltos > 30 && saltos <= 60) { 
			 	 	 	 	posicao.x = posicao.x + 50; 
			 	 	 	} else { 
			 	 	 	 	if (saltos > 60 && saltos<= 70) {  
			 	 	 	 		posicao.x = posicao.x + 70 ; 
			 	 	 	 } else { 
					 	 	 	if (saltos > 70 && saltos <= 80) { 
					 	 	 	 	posicao.x = posicao.x + 85; 
					 	 	 	} else { 
					 	 	 	 	if (saltos > 80 && saltos<= 100) {  
					 	 	 	 		posicao.x = posicao.x + 150 ;
					 	 	 	 	}
					 	 	 	}
			 	 	 	 }
			 	 	 	}
					
			 		
				}
			 		
		
		 	 	sapos.setBounds(posicao); 
		 	 	try { 
		 	 	 	Thread.sleep(500); 
		 	 	} catch (InterruptedException ex) { 
		 	 		ex.printStackTrace(); 
		 	 	} 
		 	 	n++;
		 	 	colocacao(n);
		}
			
		 	iniciar.setEnabled(true); 
		} 
		
		public int colocacao(int n) {
			return n;
			
		}

			
		
	
	public void run() {
		correSapos();
		colocacao(getPriority());
	}
	
	
	
	
}
