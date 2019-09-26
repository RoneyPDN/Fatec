package progressController; 

import javax.swing.JButton;
import javax.swing.JLabel; 
import javax.swing.JProgressBar; 
 public class ThreadBanner extends Thread { 
 
 	private JLabel lblNewLabel;
 	private JProgressBar progressBar;
 	private JButton btnIniciar; 
 
 	public ThreadBanner(JLabel lblNewLabel, JProgressBar progressBar, JButton btnIniciar) { 
 	 	this.lblNewLabel = lblNewLabel;
 	 	this.progressBar = progressBar; 
 	 	this.btnIniciar = btnIniciar; 
 	} 
 
 	private void geraBanner() { 
 	 	btnIniciar.setEnabled(false); 
 	 	Thread tBarra = new ThreadProgressBar(progressBar); 
 	 	tBarra.start(); 
 	 	int inicio = 0;
 	 	int fim = 1000;
 	 	int contador = 1;
 	 	String texto = "";
 	 	while (inicio < fim) { 
 	 	 	switch (contador) { 
 	 	 	case 1: 
 	 	 		texto = "Boa"; 
 	 	 	 	break;  	 	 	
 	 	 	 	case 2: 
 	 	 	 	texto = "Noite"; 
 	 	 	 	break;  	 	
 	 	 	 	case 3:
 	 	 	 	texto = "Roney";
 	 	 	 break;
 	 	 	 case 4: 
  	 	 	 	texto = "Carregando N";
  	 	 	 	break;
 	 	 	case 5: 
 	 	 	 	texto = "Still Loading";
 	 	 	 break;
 	 	 	case 6: 
 	 	 	 	texto = "Almost finish";
 	 	 	 break;
 	 	 	case 7: 
 	 	 	 	texto = "The end";
 	 	 	 break;
 	 	 	} 
 	 	 	lblNewLabel.setText(texto); 
  	 	 	contador++; 
 	 	 	if (contador == 7) {  	 	
 	 	 		contador = 1; 
 	 	 	} 
 	 	 	try { 
 	 	 	 	Thread.sleep(200); 
 	 	 	} catch (InterruptedException ex) {  
 	 	 		ex.printStackTrace(); 
 	 	 	} 
 	 	} 
 	 	btnIniciar.setEnabled(true); 
 	} 
 
 	@Override  	public void run() {  	 	geraBanner(); 
 	} 
 
 	 
} 
