package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Responsável pela conexão com o banco de dados
 * @author jean
 */
public class SingleConnection {

	private static String banco = "jdbc:mysql://localhost:3306/curso-jsp?autoReconnect=true";
	private static String password = "";
	private static String user = "root";
	private static Connection connection = null;
	
	// Chamada estática ao método conectar quando invocar a classe
	// Garantir que a conexao esteja sempre ativa
	static{
		conectar();
	}
	
	public SingleConnection() {
		conectar();
	}
	
	private static void conectar(){
		try {
			if(connection == null){
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(banco, user, password);
				connection.setAutoCommit(false);
			}
		}
			catch (ClassNotFoundException ex) {
				throw new RuntimeException("Classe não encontrada, adicione o driver nas bibliotecas.");
				}
		 catch (Exception e) {
			throw new RuntimeException("Erro ao conectar com o banco de dados");
		}
	}
	
	public static Connection getConnection(){
		return connection;
	}
	
}
