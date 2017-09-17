package filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import connection.SingleConnection;

/***
 * Classe para subir o banco 
 * @author Jean
 */
//Todas url passarao pelo filtro
@WebFilter(urlPatterns = {"/*"})
public class Filter implements javax.servlet.Filter {

private static Connection connection;
	
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// Intercepta os requests e da os responses
		try{
		arg2.doFilter(arg0, arg1);
		connection.commit();
		}catch(Exception ex){
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// Recebe a conexao iniciada
		connection = SingleConnection.getConnection();
	}
	
}
