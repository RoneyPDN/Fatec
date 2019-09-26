package sapofiveThreads;

import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

		public class Principal extends JFrame { 
		 	private static final long serialVersionUID = 1L;
		 	private JPanel contentPane; 
		 
		 	public static void main(String[] args) {  
		 		EventQueue.invokeLater(new Runnable(){
		 			public void run() { 
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
		 	 	setBounds(100, 100, 450, 300); 
		 	 	contentPane = new JPanel(); 
		 	 	contentPane.setBorder(new EmptyBorder(20,20,20,20));  
		 	 	setContentPane(contentPane); 
		 	 	contentPane.setLayout(null); 
		 	 	
		 	 	ImageIcon s1 = new ImageIcon(getClass().getResource("sapom.gif"));
		 	 	JLabel sapo1= new JLabel(s1); 
		 	 	sapo1.setBounds(0, 150, 200, 100); 
		 	 	contentPane.add(sapo1); 
		 
			 	ImageIcon s2 = new ImageIcon(getClass().getResource("sapom.gif"));
		 	 	JLabel sapo2= new JLabel(s2); 
		 	 	sapo2.setBounds(0,250,200,150); 
		 	 	contentPane.add(sapo2); 
		 
			 	ImageIcon s3 = new ImageIcon(getClass().getResource("sapom.gif"));
		 	 	JLabel sapo3= new JLabel(s3); 
		 	 	sapo3.setBounds(0, 350, 200, 200); 
		 	 	contentPane.add(sapo3); 
		 	 	
			 	ImageIcon s4 = new ImageIcon(getClass().getResource("sapom.gif"));
		 	 	JLabel sapo4= new JLabel(s4); 
		 	 	sapo4.setBounds(0,450,200,250); 
		 	 	contentPane.add(sapo4);
		 	 	
			 	ImageIcon s5 = new ImageIcon(getClass().getResource("sapom.gif"));
		 	 	JLabel sapo5= new JLabel(s5); 
		 	 	sapo5.setBounds(0, 550, 200, 300); 
		 	 	contentPane.add(sapo5); 
		 	 	
		 	 	ImageIcon fx = new ImageIcon(getClass().getResource("Faixa.png"));
		 	 	JLabel faixa = new JLabel(fx); 
		 	 	faixa.setBounds(0, 65,2000,800); 
		 	 	contentPane.add(faixa); 
		 	 	
		 	 	JButton iniciar = new JButton("Iniciar");
		 	 	iniciar.setBounds(0, 0, 89, 23); 
		 	 	contentPane.add(iniciar); 
		 	 	 
		 	 	SapoConstructor  sapoConstructor =  
		 	 	new SapoConstructor (sapo1,  sapo2 , sapo3, sapo4 , sapo5,iniciar, faixa);
		 	 	iniciar.addActionListener(sapoConstructor); 
		 	 	
		 	} 
		
		 

	}


