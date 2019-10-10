package roney.webaplication.controller;
import java.io.IOException;

import com.google.gson.*;

import roney.webaplication.dao.EntregaDAO;
import roney.webaplication.dao.EntregaDAOImpl;

public class EntregaControllerJSON extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, 
			HttpServletResponse response) {
		try {
			BufferedReader reader = request.getReader();
			StringBuffer texto = new StringBuffer();
			while (reader.ready()) { 
				texto.append(reader.readLine());
			}
			
			System.out.println(texto.toString());
			
			Gson gson = new Gson();
			Entrega e = gson.fromJson(texto.toString(), Entrega.class);
					
			EntregaDAO entregaDAO = new EntregaDAOImpl();
		
			entregaDAO.adicionar(e);
			System.out.println("Entrega gravada com sucesso");
			response.getWriter().println("Ok funcionou");
			response.setStatus(200);
		} catch (DAOException e1) {
			System.out.println("Erro ao gravar a entrega");
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}

}