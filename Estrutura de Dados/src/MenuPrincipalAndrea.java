import javax.swing.JOptionPane;

public class MenuPrincipalAndrea {

	public static void main (String [] args) {
		MetodosAndrea Lista = new MetodosAndrea(4);
		int op = 0;
		JOptionPane.showMessageDialog(null,"\n \n " + 
		        "______________________Bem vindo______________________\n "+
				" \n                                                            Ao                          \n" +
				"\n------------------------------- Sistemas de Listas ------------------------------\n" +  
				"                                                \n" +
				"                                              \n" +
		        "Clique em OK para continuar            \n   ");
		while(op != 99) {
		op = Integer.parseInt(JOptionPane.showInputDialog(null,"                                MENU                       \n" +
		"            1 -- Adicionar n�mero no �nicio                            \n" +
	    "            2 -- Adicionar no Final                                    \n" + 
		"            3 -- Adicionar em posi��o especifica                       \n" +
		"            4 -- Remover do �nicio                                     \n" + 
		"            5 -- Remover do Final                                      \n" + 
		"            6 -- Remover de posi��o espec�fica                         \n" + 
		"            7 -- Primeiro Elemento                                     \n" +
		"            8 -- �ltimo Elemento                                       \n" +
		"            9 -- Todos elementos                                       \n" +
		"            99 -- Sair                                                   "));
		
			switch (op) {
			case 1:
				int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Adicione o n�mero"));
				Lista.adicionaInicio(x);
				break;
			case 2:
				int e = Integer.parseInt(JOptionPane.showInputDialog(null,"Adicione o n�mero"));
				Lista.adicionaFinal(e);
				break;
			case 3:
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"O N�mero " + Lista.removeInicio() + " Foi removido!");
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"O N�mero " + Lista.removeFinal() + " Foi removido!");
				break;
			case 6:
				break;
			case 7:
				Lista.obtemPrimeiro();
				break;
			case 8:
				Lista.obtemUltimo();
				break;
			case 9:
				Lista.leiTura();
				System.out.println(Lista.leiTura());
				break;
			case 99:
				JOptionPane.showMessageDialog(null,"Emcerrando..");
				System.exit(0);
				break;
			default: System.out.println("Op��o Inv�lida");
			}
			}
		
	}
	
}
