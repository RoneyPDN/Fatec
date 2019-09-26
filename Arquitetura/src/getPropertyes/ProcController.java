package getPropertyes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

import javax.swing.JOptionPane;


public class ProcController {

	public String os(){
		String os = System.getProperty("os.name");
	return os;
	}
	
	public void propriedades(){
		Properties prop = System.getProperties();
		Set<Object> chaves = prop.keySet();
		for (Object key : chaves){
			String chave = key.toString();
			System.out.println(chave);
			System.out.println(" ==> ");
			String Propiedade = System.getProperty(chave);
			System.out.println(Propiedade);
			
		}
	}
	public void chamaProcesso(String caminhoProcesso){
		try {
			Runtime.getRuntime().exec(caminhoProcesso);
		} catch (IOException e) {
			
			//e.printStackTrace();
			String errMSG = e.getMessage();
			if(errMSG.contains("740")){
				StringBuffer Buffer = new StringBuffer();
				Buffer.append("cmd/ c");
				Buffer.append(" ");
				Buffer.append(caminhoProcesso);
				try {
					Runtime.getRuntime().exec(Buffer.toString());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}else{
				JOptionPane.showInternalMessageDialog(null,e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}
	
	public void leProcesso(String caminhoProcesso){
		try {
			Process processo = Runtime.getRuntime().exec(caminhoProcesso);
			InputStream fluxo=
					processo.getInputStream();
			InputStreamReader leito=
					new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leito);
			String linha = buffer.readLine();
			while(linha != null){
				System.out.println(linha);
				linha = buffer.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
