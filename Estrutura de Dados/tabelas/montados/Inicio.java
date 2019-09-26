package montados;

import javax.swing.JOptionPane;

public class Inicio {
	
	public static void main(String[] args) {
Ordem p = new Ordem();
		int t = 0;
		while(t!=8) {
		t = Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Adiciona \n "
				+ "2 - Remover \n"
				+ "3 - percorrer frente \n"
				+ "4 - percorrer traz \n"));
		
		switch(t) {
		case 1:
			int r = Integer.parseInt(JOptionPane.showInputDialog(null,"Adicione \n "));
			p.adiciona(r);
			break;
		case 2:
			p.remove();
			break;
		case 3:
			p.percorre();
			break;
		case 4:
			p.percorreA();
			break;
		}
	}

}
}

