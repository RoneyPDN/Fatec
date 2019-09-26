package getPropertyes;

public class Controller {

	public static void main(String[] args) {
		ProcController proc = new ProcController();
		//String os = proc.os();
		//System.out.println(os);
		proc.propriedades();

		String caminhoProcesso = "C:\\Windows\\regedit";
		proc.chamaProcesso(caminhoProcesso);
		
		proc.chamaProcesso(caminhoProcesso);
		System.out.println();
	}
}
