package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.AcessoBean;

// Servlet, mini servidor que recebe uma requisição e da uma resposta

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		AcessoBean bean = new AcessoBean(); 
		  
		if(bean.validarLoginSenha(login,senha)){ //acesso OK
			RequestDispatcher dispatcher = request.getRequestDispatcher("cabecalho.jsp");
			dispatcher.forward(request, response);
		}else{ //acesso negado
			RequestDispatcher dispatcher = request.getRequestDispatcher("pagina_erro.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
