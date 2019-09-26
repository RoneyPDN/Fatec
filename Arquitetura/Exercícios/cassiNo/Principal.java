package cassiNo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class Principal extends JFrame{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JPanel contentPane;
	public static void main(String[] args) {
 		EventQueue.invokeLater(new Runnable() 
 		{  	 	 	public void run() { 
 	 	 	 	try { 
 	 	 	 	 	Principal frame = new Principal();
 	 	 	 	 	frame.setVisible(true); 
 	 	 	 	} catch (Exception e) { 
 	 	 	 	 	e.printStackTrace(); 
 	 	 	 	} 
 	 	 	} 
 	 	}); 


	}
	public Principal() {
		
	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	 	setBounds(250, 300, 800, 400);
	 	contentPane = new JPanel(); 
	 	contentPane.setBorder(new EmptyBorder(10, 10,10,10) );
	 	setContentPane(contentPane);
	 	contentPane.setBackground(Color.DARK_GRAY);
	 	contentPane.setLayout(null); 
	 	
	 	JTextField rando = new JTextField("   ");
	 	rando.setFont(new Font("Tahoma", Font.BOLD, 50));
	 	rando.setBounds(400, 100, 150,100);
	 	rando.setEditable(false);
	 	rando.setBackground(Color.white);
	 	rando.setHorizontalAlignment(rando.CENTER);
	 	contentPane.add(rando);
	 	rando.setVisible(false);
	 	
	 	JTextField campo1 = new JTextField("   ");
	 	campo1.setFont(new Font("Tahoma", Font.BOLD, 50));
	 	campo1.setBounds(100, 100, 150,100);
	 	campo1.setEditable(false);
	 	campo1.setBackground(Color.white);
	 	campo1.setHorizontalAlignment(campo1.CENTER);
	 	contentPane.add(campo1);
	 	
	 	JTextField campo2 = new JTextField("   ");
	 	campo2.setFont(new Font("Tahoma", Font.BOLD, 50));
	 	campo2.setBounds(300, 100, 150,100);
	 	campo2.setEditable(false);
	 	campo2.setBackground(Color.white);
	 	campo2.setHorizontalAlignment(campo2.CENTER);
	 	contentPane.add(campo2);
	 	
	 	JTextField campo3 = new JTextField("   ");
	 	campo3.setFont(new Font("Tahoma", Font.BOLD, 50));
	 	campo3.setBounds(500, 100, 150,100);
	 	campo3.setEditable(false);
	 	campo3.setBackground(Color.white);
	 	campo3.setHorizontalAlignment(campo3.CENTER);
	 	contentPane.add(campo3);

	 	JButton iniciar = new JButton("Jogar");
	 	iniciar.setBounds(600, 300, 89, 23);  	 	
	 	contentPane.add(iniciar); 
	 	 
	 	Cassino teste =  
	 	 	 	new Cassino(campo1, campo2,campo3, iniciar, rando);
	 	iniciar.addActionListener(teste); 
}
}