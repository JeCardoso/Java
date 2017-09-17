package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.BeanUsuario;
import connection.SingleConnection;

public class DaoUsuario {
	
	private Connection connection;
	
	public DaoUsuario(){
		connection = SingleConnection.getConnection();
	}

	public void salvar(BeanUsuario usuario){
		try {
			String sql = "insert into usuario(login,senha) values (?,?)";
			PreparedStatement insert;
			insert = connection.prepareStatement(sql);
			insert.setString(1, usuario.getLogin());
			insert.setString(2, usuario.getSenha());
			insert.execute();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}

	public List<BeanUsuario> listarTodos() throws SQLException{
			List<BeanUsuario> usuarios = new ArrayList<BeanUsuario>();
			
			String sql = "select * from usuario";
			PreparedStatement select = connection.prepareStatement(sql);
			ResultSet resultado = select.executeQuery();
			while(resultado.next()){
				BeanUsuario usuario = new BeanUsuario(resultado.getString("login"), resultado.getString("senha"));
				usuario.setId(resultado.getLong("id"));
				usuarios.add(usuario);
			}
			return usuarios;
	}
	
	public void delete(String login){
		try{
			String sql = "delete from usuario where login = '" + login + "'";
			PreparedStatement deletar = connection.prepareStatement(sql);
			deletar.execute();
			connection.commit();
		}catch(Exception e){
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public BeanUsuario consultar(String login) throws SQLException {
		String sql = "select * from usuario where login='"+login+"'";
		PreparedStatement consulta = connection.prepareStatement(sql);
		ResultSet resultado = consulta.executeQuery();
		
		if(resultado.next()){
			BeanUsuario usuario = new BeanUsuario();
			usuario.setLogin(resultado.getString("login"));
			usuario.setSenha(resultado.getString("senha"));
			usuario.setId(resultado.getLong("id"));
			return usuario;
		}
		
		return null;
	}

	public void atualizar(BeanUsuario usuario) {
	
		try {
			String sql = "update usuario set login=?, senha=? where id='"+usuario.getId()+"'";
			PreparedStatement atualiza = connection.prepareStatement(sql);
			atualiza.setString(1, usuario.getLogin());
			atualiza.setString(2, usuario.getSenha());
			
			atualiza.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		
	}
	
}