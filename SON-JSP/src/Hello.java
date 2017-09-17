

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

/**
 * Servlet implementation class Hello
 */
// Rota http://localhost:8080/SON-JSP/Hello?name=Jean
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	// Construtor
    public Hello() {
    	// herda do construtor de HttpServlet
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath()); // padrão
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(0);
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		request.setAttribute("name", "cardoso");
		request.setAttribute("age", 20);
		request.setAttribute("numbers", numeros);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		
		view.forward(request, response);
		
		/*** response ***/
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println("Hello World - SON JSP By "+name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doGet(request, response); // padrão
		
		/*** Trabalhando com response ***/
		JSONObject json = new JSONObject();
		int i = 10;
		for (int a = 0; a < i; a++) {
			json.put("count", a);
		}
		response.setContentType("application/json");
		response.getWriter().write(json.toString());
		
		/*** Trabalhando com request ***/
		/* JSONObject json = formatJson(request.getReader());
		System.out.println(json.toString());
		System.out.println(json.get("name")); */
		
		/* // Pegar o corpo do POST
		String body = request.getReader()
				.lines()
				.reduce("", (acc, actual) -> acc + actual);
		System.out.println(body); */
	}
	
	private JSONObject formatJson(BufferedReader reader){	
		StringBuffer bs = new StringBuffer();
		String line = null;
		
		try{
			while((line = reader.readLine()) != null){
				bs.append(line);
			}
		}
		catch(Exception ex){
			ex.getStackTrace();
		}
		
		JSONObject json = new JSONObject(bs.toString());
		return json;
	}

}
