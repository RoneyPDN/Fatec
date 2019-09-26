package cassiNo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cassino  implements ActionListener {

	private JTextField campo1;
	private JTextField campo2;
	private JTextField campo3;
	private JButton iniciar;
	private JTextField rando;

	public Cassino(JTextField  campo1, JTextField campo2 , JTextField campo3 , JButton iniciar, JTextField rando) {
		this.campo1 = campo1;
		this.campo2 = campo2;
		this.campo3 = campo3;
		this.iniciar = iniciar;
		this.rando = rando;
		
	}
	
	public void play() {
		iniciar.setEnabled(false);
		Thread roleta1 = new roleta(campo1,campo2,campo3,iniciar, rando);
		roleta1.start();
	}
	
	


@Override
public void actionPerformed(ActionEvent arg0) {
	play();
	
}


}