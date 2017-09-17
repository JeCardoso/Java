package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoLogin;

/**
 * Servlet, mini servidor que recebe uma requisi��o e da uma resposta
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DaoLogin daoLogin = new DaoLogin();
 
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			
			if(daoLogin.validarLogin(login, senha)){ //acesso OK
				RequestDispatcher dispatcher = request.getRequestDispatcher("acesso.jsp");
				dispatcher.forward(request, response);
			}else{ //acesso negado
				RequestDispatcher dispatcher = request.getRequestDispatcher("erro_pagina.jsp");
				dispatcher.forward(request, response);
			}
		}
		catch(Exception e){
			
		}
	}

}