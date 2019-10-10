package roney.webaplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String URL = "jdbc:mysql://localhost:3306/entregas";
	private static final String USER = "root";
	private static final String PASSWORD = "senha";
	private static DBUtil instancia;
	private Connection con;
	
	
	private DBUtil() throws DAOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new DAOException(e);
		}
	}

	public Connection getConnection() throws DAOException {
		try {
			if (con == null || !con.isValid(500)) {
				con = DriverManager.getConnection(URL,USER,PASSWORD);
			}
		} catch (SQLException e) {
			throw new DAOException(e);
		}
		return con;
	
}
	
	public static DBUtil getInstance() throws DAOException{
		if (instancia == null) {
			instancia = new DBUtil();
		}
		
		return instancia;
		
	}
	
	
	
}