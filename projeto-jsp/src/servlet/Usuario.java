package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BeanUsuario;
import dao.DaoUsuario;


@WebServlet("/SalvarUsuario")
public class Usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DaoUsuario daoUsuario = new DaoUsuario();
	
    public Usuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String acao = request.getParameter("acao");
			String user = request.getParameter("user");
			
			if(acao.equalsIgnoreCase("delete")){
				daoUsuario.delete(user);
				RequestDispatcher view = request.getRequestDispatcher("/cadastroUsuario.jsp");
				
					request.setAttribute("usuarios", daoUsuario.listarTodos());
					view.forward(request, response);
			}
			
			else if(acao.equalsIgnoreCase("editar")){
				BeanUsuario usuario = daoUsuario.consultar(user);
				
				RequestDispatcher view = request.getRequestDispatcher("/cadastroUsuario.jsp");
				
				request.setAttribute("user", usuario);
				view.forward(request, response);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String login = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		BeanUsuario usuario = new BeanUsuario(login, senha);
		usuario.setId(!id.isEmpty()?Long.parseLong(id):0);
		
		if(id == null || id.isEmpty()){
			daoUsuario.salvar(usuario);
		}else{
			daoUsuario.atualizar(usuario);
		}
		
		try {
			RequestDispatcher view = request.getRequestDispatcher("/cadastroUsuario.jsp");
			request.setAttribute("usuarios", daoUsuario.listarTodos());
			view.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
