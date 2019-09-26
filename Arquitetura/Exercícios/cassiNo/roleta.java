package cassiNo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class roleta extends Thread {

	private JTextField campo1;
	private JTextField campo2;
	private JTextField campo3;
	private JButton iniciar;
	private JTextField rando = new JTextField();
	
	public roleta(JTextField campo1,  JTextField campo2, JTextField campo3,JButton iniciar, JTextField rando) {
		this.campo1 = campo1;
		this.campo2 = campo2;
		this.campo3 = campo3;
		this.iniciar = iniciar;
		this.rando = rando;
	}
	
	public void gira1() {
	
		int inicio = 0;
		String tcampo = " ";
		String scampo = " ";
		String pcampo = " ";
		while(inicio < 100) {
			
			int p = (int) ((Math.random()* 12) + 1);
			int s = (int) ((Math.random()* 12) + 1);
			int t = (int) ((Math.random()* 12) + 1);
			pcampo = String.valueOf(p);
			scampo = String.valueOf(s);
			tcampo = String.valueOf(t);
 	 	 	try { 
 	 	 	 	Thread.sleep(50); 
 	 	 	} catch (InterruptedException ex) {  
 	 	 		ex.printStackTrace(); 
 	 	 	} 
	 	 	campo1.setText(pcampo);
	 	 	campo2.setText(scampo);
	 	 	campo3.setText(pcampo);
	 	 	inicio++;
		}
		iniciar.setEnabled(true);
	}

	
	
	
	public void run() {
		gira1();
		
	}
	}
