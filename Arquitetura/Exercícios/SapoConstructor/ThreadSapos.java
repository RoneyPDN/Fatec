package SapoConstructor;

import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ThreadSapos extends Thread {
	
	private JLabel sapos;
	private JButton iniciar;

	
	public ThreadSapos(JLabel sapos, JButton iniciar) {
		this.sapos = sapos;
		this.iniciar = iniciar;
		
	}
	
		public void correSapos() {
			
			iniciar.setEnabled(false); 

			Rectangle posicao;
		 	posicao = sapos.getBounds(); 
		 	sapos.setBounds(posicao);  
		 	int contadorDeMov = 0;  
		 	while (contadorDeMov <= 12) {  
		 		if (contadorDeMov <= 2) { 
		 	 	 	posicao.y = posicao.y + 10; 
		 	 	} else { 
		 	 	 	if (contadorDeMov > 2 && contadorDeMov <= 6) { 
		 	 	 	 	posicao.x = posicao.x + 20; 
		 	 	 	} else { 
		 	 	 	 	if (contadorDeMov > 6 && contadorDeMov <= 9) {  
		 	 	 	 		posicao.y = posicao.y - 10; 
		 	 	 	 	} else { 
		 	 	 	 	 	if (contadorDeMov > 9 && contadorDeMov <= 12) {  	 
		 	 	 	 	 		posicao.x = posicao.x - 20; 
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
		 	 	contadorDeMov++; 
		 	} 

		 	iniciar.setEnabled(true); 
		} 
	
	public void run() {
		correSapos();
	}
	
	
	
	
}
