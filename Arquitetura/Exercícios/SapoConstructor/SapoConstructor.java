package SapoConstructor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class SapoConstructor implements ActionListener{
	
	private JLabel sapo1;
	private JLabel sapo2;
	private JLabel sapo3;
	private JLabel sapo4;
	private JLabel sapo5;
	private JButton iniciar;
	private JLabel faixa;

	
	
	public SapoConstructor (JLabel sapo1, JLabel sapo2 ,JLabel sapo3, JLabel sapo4 ,JLabel sapo5, JButton iniciar, JLabel faixa) {
		this.sapo1 = sapo1;
		this.sapo2 = sapo2;
		this.sapo3 = sapo3;
		this.sapo4 = sapo4;
		this.sapo5 = sapo5;
		this.iniciar = iniciar;
		this.faixa = faixa;
		
	}
	
	
	public void botaoSapo() {
		Thread sap1 = new ThreadSapos(sapo1, iniciar);
		Thread sap2 = new ThreadSapos(sapo2, iniciar);
		Thread sap3 = new ThreadSapos(sapo3, iniciar);
		Thread sap4 = new ThreadSapos(sapo4, iniciar);
		Thread sap5 = new ThreadSapos(sapo5, iniciar);
	sap1.start();
	sap2.start();
	sap3.start();
	sap4.start();
	sap5.start();
		
	}
	
	
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		botaoSapo();
		
	}
	
	
	
	
	
	
	
}
