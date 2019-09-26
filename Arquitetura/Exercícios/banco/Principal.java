package banco;

public class Principal {

	public static void main(String[] args) {
		
		Thread conta1 = new BancoConstrutor(1);
		conta1.start();
	}

}
