package matriz;

import java.util.Random;

public class Mconstructor {

	static int coluna;
	private static int linha;
	static int[][] matriz = new int [3][5];
	
	public int[][] carrega() {
			Random n = new Random();
			
			for(linha = 0 ; linha < 3 ; linha++){
				for(coluna = 0; coluna < 5 ; coluna++) {
				matriz[linha][coluna] = n.nextInt(100);
				}
			}
			System.out.println("!!!!!Matriz!!!!! \n");
			for (int i = 0; i < 3 ; i ++) {
				for (int c = 0; c < 5; c ++) {
				System.out.print(" " + matriz[i][c]);
				}
				System.out.println(" ");
			}
			return matriz;
		}
		
	public Thread contagem1 = new Thread(){
		public void run () {
			
			
			System.out.println("\n \n Thread N° 1 \n \n");
			int soma = 0 ;
			System.out.print("Os numeros da  1° linha são: \n" );
			for (int i = 0 ; i < 1 ; i++) {
				for (int c = 0; c < 5 ; c++) {
					 soma = soma + matriz[i][c];
					 System.out.print(" " + matriz[i][c]);
				}
			}
			System.out.print("\n A soma deles é igual = " + soma );
		}
		
	};
	
	public Thread contagem2 = new Thread(){
		public void run () {
			
			System.out.println("\n \n Thread N° 2 \n \n");
			int soma = 0 ;
			System.out.print("Os numeros da  2° linha são: \n" );
			for (int i = 1 ; i < 2 ; i++) {
				for (int c = 0; c < 5 ; c++) {
					 soma = soma + matriz[i][c];
					 System.out.print(" " + matriz[i][c]);
				}
			}
			System.out.print("\n A soma deles é igual = " + soma );
		}
		
	};
	
	public Thread contagem3 = new Thread(){
		public void run () {
			
			System.out.println("\n \n Thread N° 3 \n \n");
			int soma = 0 ;
			System.out.print("Os numeros da  3° linha são: \n" );
			for (int i = 2 ; i < 3 ; i++) {
				for (int c = 0; c < 5 ; c++) {
					 soma = soma + matriz[i][c];
					 System.out.print(" " + matriz[i][c]);
				}
			}
			System.out.print("\n A soma deles é igual = " + soma );
		}
		
	};
	
	
		
	}
	
	
	
	
	
	
	
	

