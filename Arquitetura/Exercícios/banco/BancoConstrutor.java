package banco;
import javax.swing.JOptionPane;
public class BancoConstrutor extends Thread {
	private static int numeroconta;
	private static double saldo;
	private static double saque;
	private static double deposito;
	private int op;
	
	public BancoConstrutor (int numeroconta) {
		this.numeroconta = numeroconta;
	}
	
	
	public void run() {
		JOptionPane.showMessageDialog(null,"\n\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Bem vindo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n"
				+ "\n                           Ao Sistema                            \n "
				+ "\n                                 De                                 \n"
				+ "\n                       Caixa Eletronico                         \n\n\n " +
				"      Pressione ok para acessar o menu             ");
		while(op != 5) { 
		op = Integer.parseInt(JOptionPane.showInputDialog("    "
				+ "\n 1 - Saque \n"
				+ "\n 2 - Deposito \n"
				+ "\n 3 - Ver conta \n "
				+ "\n 5 - Sair \n "));
		
		switch(op) {
		case 1:
			saque();
			break;
		case 2 :
			deposito();
			break;
		case 3:
			mostrardados();
			break;
		case 5:
			break;
		}
		}
	}


	private void mostrardados() {
		JOptionPane.showMessageDialog(null," A conta Número " + numeroconta + " Possui saldo de " + "R$" + saldo + " Reais");
		
	}


	private double deposito() {
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor para deposito"));
		saldo = saldo + deposito;
		return saldo;
		
	}


	private double saque() {
		saque = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de saque"));
		if (saque > saldo) {
			JOptionPane.showMessageDialog(null,"Valor indisponível para saque");
		}else {saldo = saldo - saque;}
		return saldo;
	}
	
	
	
	
	
	
	
}
