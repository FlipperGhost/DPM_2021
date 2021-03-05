package revisaodm2021m.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSource {
	

	protected static java.sql.Connection getConexaoMySQL() {
		
		Connection con = null;

		try {

			String driverName = "com.mysql.jdbc.Driver";
			

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cacau?createDatabaseIfNotExist=true&serverTimezone=UTC"
					, "root"
					, "kyaaby56R#vuash");
	
			return con;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");

		}
		return null;

	}

	
	
	
	protected static void finalizarConnexoes(Connection con,ResultSet rs, PreparedStatement pst) {
		
		
		try {
			con.close();
			pst.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	protected static void finalizarConnexoes(Connection con, PreparedStatement pst) {
		
		
		try {
			con.close();
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
