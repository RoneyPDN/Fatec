package cavaleiro;

import java.util.concurrent.Semaphore;

public class Principal {
	public static Semaphore onlyone;
	public static void main(String[] args) {
		int portas  = 1;
		onlyone = new Semaphore(portas);
			Cavaleiro cavaleiros = new Cavaleiro(0,onlyone);
			Cavaleiro cavaleiros2 = new Cavaleiro(1,onlyone);
			Cavaleiro cavaleiros3 = new Cavaleiro(2,onlyone);
			Cavaleiro cavaleiros4 = new Cavaleiro(3,onlyone);
			cavaleiros.start();
			cavaleiros2.start();
			cavaleiros3.start();
			cavaleiros4.start();
			
	
	}

}
