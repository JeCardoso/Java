import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/* Exemplo de aplicação real, exemplo de autenticação */

// Aonde irá utilizar o filtro, se em todas requisições(*), ou apenas servlet(/Hello)
@WebFilter("/*")
public class MyFilter implements Filter{
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		Long initTime = System.currentTimeMillis();
		String endPoint = ((HttpServletRequest) request).getRequestURI();
		
		chain.doFilter(request, response);
		
		Long endTime = System.currentTimeMillis();
		Long result = endTime - initTime;
		
		System.out.println(String.format("%d", TimeUnit.MILLISECONDS.toSeconds(result)));
	}
	
	@Override
	public void destroy() {
		
	}

}
