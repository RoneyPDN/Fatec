package semaforo;

import java.util.concurrent.Semaphore;

public class Carpark {

	public static void main(String[] args) {
		int permissoes = 10;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for(int idCar = 0; idCar <10; idCar++){
			Thread tcar = new ThreadCar(idCar,semaforo);
			tcar.start();
			
			
		}
		
		
		
	}

}
