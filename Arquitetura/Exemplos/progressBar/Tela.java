package progressBar;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel; 
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JButton; 
import progressController.ProgressBarController; 
 
public class Tela extends JFrame { 
 	private static final long serialVersionUID = 1L;  
 	private JPanel contentPane; 
 
 	public static void main(String[] args) {
 		EventQueue.invokeLater(new Runnable() 
 		{  	 	 	public void run() { 
 	 	 	 	try { 
 	 	 	 	 	Tela frame = new Tela();
 	 	 	 	 	frame.setVisible(true); 
 	 	 	 	} catch (Exception e) { 
 	 	 	 	 	e.printStackTrace(); 
 	 	 	 	} 
 	 	 	} 
 	 	}); 
 	} 
 
 	/** 
 	 * Create the frame. 
 	 */ 
 
 	public Tela() { 
 	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 	 	setBounds(200, 200, 500, 400);
 	 	contentPane = new JPanel(); 
 	 	contentPane.setBorder(new EmptyBorder(10, 10,10,10) );
 	 	setContentPane(contentPane);  	 	
 	 	contentPane.setLayout(null); 
 
 	 	final JLabel lblNewLabel = new JLabel("2");
 	 	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
 	 	lblNewLabel.setBounds(50, 100, 150,100);
 	 	contentPane.add(lblNewLabel); 
 
 	 	final JProgressBar progressBar = new JProgressBar();
 	 	progressBar.setBounds(30, 55, 200, 60); 
 	 	contentPane.add(progressBar); 
 
 	 	JButton btnIniciar = new JButton("In\u00EDcio");
 	 	btnIniciar.setBounds(10, 228, 89, 23);  	 	
 	 	contentPane.add(btnIniciar); 
 	 	 
 	 	ProgressBarController pbController =  
 	 	 	 	new ProgressBarController(lblNewLabel, progressBar, btnIniciar);
 	 	btnIniciar.addActionListener(pbController); 
 
 	} 
} 
