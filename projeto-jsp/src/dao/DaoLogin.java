package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.SingleConnection;

/***
 * Objeto que dá acesso aos dados do Banco de Dados
 */
public class DaoLogin {
private Connection connection;
	
	public DaoLogin(){
		connection = SingleConnection.getConnection();
	}
	
	public boolean validarLogin(String login, String senha) throws Exception{
		String sql = "select * from usuario where login = '"+login+"' and senha='"+senha+"'";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();
		
		if(resultado.next()){
			// possui usuario
			return true; 
		}else{
			// não possui usuario
			return false; 
		}
	} 
	
}
