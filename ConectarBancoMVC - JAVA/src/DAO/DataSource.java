package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
	public String hostname;
	public int port;
	public String database;
	public String username;
	public String password;
	
	private Connection connection;
	
	public DataSource(){
		try{
			hostname = "localhost";
			port = 3306;
			database = "javabd";
			username = "root";
			password = "mysql";
			
			String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			connection = DriverManager.getConnection(url, username, password);
			
			System.out.println("Conectado");
			
		}
		catch(SQLException ex){
			System.err.println("Erro na conexão " + ex.getMessage());
		}
		catch(Exception err){
			System.err.println("Erro Geral " + err.getMessage());
		}
	}
	
	public Connection getConnection(){
		return this.connection; 
	}
	
	public void CloseDataSource(){
		try{
			connection.close();
		}
		catch(Exception err){
			System.err.println("Erro ao desconectar" + err.getMessage());
		}
	}
	
}
