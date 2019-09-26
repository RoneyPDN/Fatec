
import javax.swing.JOptionPane;
public class Exercicios {

	public static void main(String [] args){
		
		String nomeA;
		String nomeB;
		String W;
		nomeA = JOptionPane.showInputDialog(null,"Insira o primeiro nome abaixo");
		nomeB = JOptionPane.showInputDialog(null, "Insira o segundo nome abaixo");
	
		char c = nomeA.charAt(0);
		char b = nomeB.charAt(0);
		String d = Character.toString(c);
		String e = Character.toString(b);
		System.out.println(e);
		System.out.println(d);
		
		String[] a = new String [26];
		a[0] = "A";	a[1] = "B";	a[2] = "C";	a[3] = "D";
		a[4] = "E";	a[5] = "F";	a[6] = "G";	a[7] = "H";
		a[8] = "I";	a[9] = "J";a[10] = "K";a[11] = "L";
		a[12] = "M";a[13] = "N";a[14] = "O";a[15] = "P";
		a[16] = "Q";a[17] = "R";a[18] = "S";a[19] = "T";
		a[20] = "U";a[21] = "V";a[22] = "W";a[23] = "X";
		a[24] = "Y";a[25] = "Z";
		
		 
		if(d.equals(e)) {
			
			char f = nomeA.charAt(1);
			char g = nomeB.charAt(1);
			String h = Character.toString(c);
			String j = Character.toString(b);
			for (int i = 0; i <=26;i++) {
			if (h.equals(a[i])) {
				JOptionPane.showMessageDialog(null,"O primeiro nome é  " + nomeA + "\n"
						+ "O segundo nome é " + nomeB);
				
				}else if(j.equals(a[i])) {
					JOptionPane.showMessageDialog(null,"O primeiro nome é  " + nomeB + "\n"
				+ "O segundo nome é " + nomeA);
				}
			}JOptionPane.showMessageDialog(null,"Insira o nome com letras MAISCÚLAS");
		}
		
		
		if(! d.equals(e)) {
			for (int i = 0; i <=26;i++) {
			if (d.equals(a[i])) {
				JOptionPane.showMessageDialog(null,"O primeiro nome é  " + nomeA + "\n"
						+ "O segundo nome é " + nomeB);
				break;
				
				}else if(e.equals(a[i])) {
					JOptionPane.showMessageDialog(null,"O primeiro nome é  " + nomeB + "\n"
							+ "O segundo nome é " + nomeA);
				break;
				}
		
		
				
			        
			
	                                     
			
			}
	
		}else{JOptionPane.showMessageDialog(null,"Insira o nome com letras MAISCÚLAS");}
	}
}
