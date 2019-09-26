import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonModel;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class SistemaCafeteira extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Throwable e) {
            e.printStackTrace();
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaCafeteira frame = new SistemaCafeteira();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Pag(double valor, double preco){
		double troco = 0;
		if(valor > preco){
			troco = valor - preco;
		}else{JOptionPane.showMessageDialog(null,"Informe um valor válido.");}
		JOptionPane.showMessageDialog(null,"Retire seu troco de : \n" + troco);
	}
	/**
	 * Create the frame.
	 */
	public SistemaCafeteira() {
		boolean pressed = false;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 519);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("InternalFrame.borderShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Trabalhos Roney\\Fatec\\Segundo Semestre\\EngenhariaDeSoftawareI\\botao-vermelho-brilhante_17-226025854.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cafec = "Café Curto";
				textField.setText(cafec);
				
			}
		});
		btnNewButton.setBounds(39, 122, 27, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Trabalhos Roney\\Fatec\\Segundo Semestre\\EngenhariaDeSoftawareI\\botao-vermelho-brilhante_17-226025854.jpg"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cafel = "Café Longo";
				textField.setText(cafel);
			button.isEnabled();
			}
		});
		button.setBounds(39, 171, 27, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Trabalhos Roney\\Fatec\\Segundo Semestre\\EngenhariaDeSoftawareI\\botao-vermelho-brilhante_17-226025854.jpg"));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cafecl = "Café Com leite";
				textField.setText(cafecl);
				
			}
		});
		button_1.setBounds(39, 221, 27, 23);
		contentPane.add(button_1);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon("C:\\Trabalhos Roney\\Fatec\\Segundo Semestre\\EngenhariaDeSoftawareI\\botao-vermelho-brilhante_17-226025854.jpg"));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cafecc = "Capuccino";
				textField.setText(cafecc);
			}
		});
		button_3.setBounds(39, 274, 27, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon("C:\\Trabalhos Roney\\Fatec\\Segundo Semestre\\EngenhariaDeSoftawareI\\botao-vermelho-brilhante_17-226025854.jpg"));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String moc = "Mocaccino";
				textField.setText(moc);
				
			}
		});
		button_4.setBounds(39, 323, 27, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon("C:\\Trabalhos Roney\\Fatec\\Segundo Semestre\\EngenhariaDeSoftawareI\\botao-vermelho-brilhante_17-226025854.jpg"));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String choc = "Chocolate Quente";
				textField.setText(choc);
			}
		});
		button_5.setBounds(39, 373, 27, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon("C:\\Trabalhos Roney\\Fatec\\Segundo Semestre\\EngenhariaDeSoftawareI\\botao-vermelho-brilhante_17-226025854.jpg"));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cha = "Chá";
				textField.setText(cha);
			}
		});
		button_6.setBounds(39, 419, 27, 23);
		contentPane.add(button_6);
		
		JEditorPane dtrpnCafCurto = new JEditorPane();
		dtrpnCafCurto.setEnabled(false);
		dtrpnCafCurto.setEditable(false);
		dtrpnCafCurto.setText("Caf\u00E9 Curto");
		dtrpnCafCurto.setBounds(81, 122, 106, 23);
		contentPane.add(dtrpnCafCurto);
		
		JEditorPane dtrpnMocaccino = new JEditorPane();
		dtrpnMocaccino.setEnabled(false);
		dtrpnMocaccino.setEditable(false);
		dtrpnMocaccino.setText("Mocaccino");
		dtrpnMocaccino.setBounds(81, 323, 106, 23);
		contentPane.add(dtrpnMocaccino);
		
		JEditorPane dtrpnCafLongo = new JEditorPane();
		dtrpnCafLongo.setEnabled(false);
		dtrpnCafLongo.setEditable(false);
		dtrpnCafLongo.setText("Caf\u00E9 Longo");
		dtrpnCafLongo.setBounds(81, 171, 106, 23);
		contentPane.add(dtrpnCafLongo);
		
		JEditorPane dtrpnCafComLeite = new JEditorPane();
		dtrpnCafComLeite.setEnabled(false);
		dtrpnCafComLeite.setEditable(false);
		dtrpnCafComLeite.setText("Caf\u00E9 Com Leite");
		dtrpnCafComLeite.setBounds(81, 221, 106, 23);
		contentPane.add(dtrpnCafComLeite);
		
		JEditorPane dtrpnCapuccino = new JEditorPane();
		dtrpnCapuccino.setEnabled(false);
		dtrpnCapuccino.setEditable(false);
		dtrpnCapuccino.setText("Capuccino");
		dtrpnCapuccino.setBounds(81, 274, 106, 23);
		contentPane.add(dtrpnCapuccino);
		
		JEditorPane dtrpnCh = new JEditorPane();
		dtrpnCh.setEditable(false);
		dtrpnCh.setEnabled(false);
		dtrpnCh.setText("Ch\u00E1");
		dtrpnCh.setBounds(81, 419, 106, 23);
		contentPane.add(dtrpnCh);
		
		JEditorPane dtrpnChocolateQuente = new JEditorPane();
		dtrpnChocolateQuente.setEnabled(false);
		dtrpnChocolateQuente.setEditable(false);
		dtrpnChocolateQuente.setText("Chocolate Quente");
		dtrpnChocolateQuente.setBounds(81, 373, 106, 23);
		contentPane.add(dtrpnChocolateQuente);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setText("0,65");
		formattedTextField_1.setForeground(Color.RED);
		formattedTextField_1.setBounds(200, 171, 75, 23);
		contentPane.add(formattedTextField_1);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setText("0,80");
		formattedTextField_2.setForeground(Color.RED);
		formattedTextField_2.setBounds(200, 221, 75, 23);
		contentPane.add(formattedTextField_2);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setText("0,80");
		formattedTextField_3.setForeground(Color.RED);
		formattedTextField_3.setBounds(200, 270, 75, 23);
		contentPane.add(formattedTextField_3);
		
		JFormattedTextField formattedTextField_4 = new JFormattedTextField();
		formattedTextField_4.setText("0,90");
		formattedTextField_4.setForeground(Color.RED);
		formattedTextField_4.setBounds(200, 323, 75, 23);
		contentPane.add(formattedTextField_4);
		
		JFormattedTextField formattedTextField_5 = new JFormattedTextField();
		formattedTextField_5.setText("0,75");
		formattedTextField_5.setForeground(Color.RED);
		formattedTextField_5.setBounds(200, 372, 75, 23);
		contentPane.add(formattedTextField_5);
		
		JFormattedTextField formattedTextField_7 = new JFormattedTextField();
		formattedTextField_7.setText("0,55");
		formattedTextField_7.setForeground(Color.RED);
		formattedTextField_7.setBounds(200, 419, 75, 23);
		contentPane.add(formattedTextField_7);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("0,70");
		formattedTextField.setForeground(Color.RED);
		formattedTextField.setBounds(200, 123, 75, 23);
		contentPane.add(formattedTextField);
		
		JTextArea txtrBebida = new JTextArea();
		txtrBebida.setBackground(UIManager.getColor("InternalFrame.borderShadow"));
		txtrBebida.setFont(new Font("Monotype Corsiva", Font.BOLD, 22));
		txtrBebida.setForeground(Color.BLACK);
		txtrBebida.setText("BEBIDA");
		txtrBebida.setBounds(81, 85, 100, 29);
		contentPane.add(txtrBebida);
		
		JTextArea txtrPreo = new JTextArea();
		txtrPreo.setBackground(UIManager.getColor("InternalFrame.borderShadow"));
		txtrPreo.setFont(new Font("Monotype Corsiva", Font.BOLD, 22));
		txtrPreo.setForeground(Color.RED);
		txtrPreo.setText("Pre\u00E7o");
		txtrPreo.setBounds(200, 85, 75, 27);
		contentPane.add(txtrPreo);
		
		JTextArea txtrMquinaDeCaf = new JTextArea();
		txtrMquinaDeCaf.setBackground(UIManager.getColor("InternalFrame.resizeIconShadow"));
		txtrMquinaDeCaf.setFont(new Font("Monotype Corsiva", Font.BOLD, 50));
		txtrMquinaDeCaf.setWrapStyleWord(true);
		txtrMquinaDeCaf.setText("M\u00C1QUINA DE CAF\u00C9");
		txtrMquinaDeCaf.setBounds(126, 11, 479, 50);
		contentPane.add(txtrMquinaDeCaf);
		
		JTextArea txtrOpoSelecionada = new JTextArea();
		txtrOpoSelecionada.setBackground(UIManager.getColor("InternalFrame.borderShadow"));
		txtrOpoSelecionada.setForeground(UIManager.getColor("info"));
		txtrOpoSelecionada.setText("Op\u00E7\u00E3o Selecionada :");
		txtrOpoSelecionada.setBounds(331, 156, 167, 23);
		contentPane.add(txtrOpoSelecionada);
		
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("C:\\Trabalhos Roney\\Fatec\\Segundo Semestre\\EngenhariaDeSoftawareI\\botao-vermelho-brilhante_17-226025854.jpg"));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cafecl = "    Extraçucar";
				textField_1.setText(cafecl);
			}
		});
		button_2.setBounds(331, 122, 27, 23);
		contentPane.add(button_2);
		
		JEditorPane dtrpnExtraAucar = new JEditorPane();
		dtrpnExtraAucar.setEnabled(false);
		dtrpnExtraAucar.setEditable(false);
		dtrpnExtraAucar.setText("Extra A\u00E7ucar");
		dtrpnExtraAucar.setBounds(368, 122, 75, 23);
		contentPane.add(dtrpnExtraAucar);
		
		JButton button_7 = new JButton("");
		button_7.setIcon(new ImageIcon("C:\\Trabalhos Roney\\Fatec\\Segundo Semestre\\EngenhariaDeSoftawareI\\botao-vermelho-brilhante_17-226025854.jpg"));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cafecl = "  Sem Açucar";
				textField_1.setText(cafecl);
			}
		});
		button_7.setBounds(525, 122, 27, 23);
		contentPane.add(button_7);
		
		JEditorPane dtrpnSemAucar = new JEditorPane();
		dtrpnSemAucar.setEnabled(false);
		dtrpnSemAucar.setEditable(false);
		dtrpnSemAucar.setText("Sem A\u00E7ucar");
		dtrpnSemAucar.setBounds(562, 122, 75, 23);
		contentPane.add(dtrpnSemAucar);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(503, 159, 134, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrComplemento = new JTextArea();
		txtrComplemento.setText("Complemento  :");
		txtrComplemento.setForeground(SystemColor.info);
		txtrComplemento.setBackground(UIManager.getColor("InternalFrame.borderShadow"));
		txtrComplemento.setBounds(331, 190, 167, 23);
		contentPane.add(txtrComplemento);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(503, 192, 134, 20);
		textField_1.setText("Açucar");
		contentPane.add(textField_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double valor,preco = 0;
				System.out.println("");
				if (button.isEnabled()){
					valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor"));
					preco = 0.65;
					Pag(valor,preco);
				}else if(btnNewButton.isEnabled() ){
					valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor"));
					preco = 0.70;
					Pag(valor,preco);
				
					}else if (button_1.isEnabled() ){
					valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor"));
					preco = 0.80;
					Pag(valor,preco);
				}else if(button_3.isEnabled()  ){
					valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor"));
					preco = 0.80;
					Pag(valor,preco);
				}else if(button_4.isEnabled()  ){
					valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor"));
					preco = 0.90;
					Pag(valor,preco);
				}else if (button_5.isEnabled()  ){
					valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor"));
					preco = 0.75;
					Pag(valor,preco);
				}else if (button_6.isEnabled() ){
					valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor"));
					preco = 0.55;
					Pag(valor,preco);
				}
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Trabalhos Roney\\Fatec\\Segundo Semestre\\EngenhariaDeSoftawareI\\InsiraMoeda.jpg"));
		btnNewButton_1.setBounds(537, 221, 100, 117);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Trabalhos Roney\\Fatec\\Segundo Semestre\\EngenhariaDeSoftawareI\\Nota2\\Troco.jpg"));
		btnNewButton_2.setBounds(537, 339, 100, 90);
		contentPane.add(btnNewButton_2);
		
		JTextArea txtrInsiraOValor = new JTextArea();
		txtrInsiraOValor.setFont(new Font("Monotype Corsiva", Font.BOLD, 22));
		txtrInsiraOValor.setText("   Insira o valor");
		txtrInsiraOValor.setForeground(UIManager.getColor("TextField.caretForeground"));
		txtrInsiraOValor.setBackground(SystemColor.controlShadow);
		txtrInsiraOValor.setBounds(337, 265, 167, 23);
		contentPane.add(txtrInsiraOValor);
		
		JTextArea txtrTroco = new JTextArea();
		txtrTroco.setFont(new Font("Monotype Corsiva", Font.BOLD, 22));
		txtrTroco.setText("        Troco");
		txtrTroco.setForeground(UIManager.getColor("TextField.caretForeground"));
		txtrTroco.setBackground(SystemColor.controlShadow);
		txtrTroco.setBounds(337, 372, 167, 23);
		contentPane.add(txtrTroco);
	}
}
