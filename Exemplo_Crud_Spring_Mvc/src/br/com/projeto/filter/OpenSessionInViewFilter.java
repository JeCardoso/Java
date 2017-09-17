package br.com.projeto.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.hibernate.SessionFactory;
import org.springframework.web.filter.DelegatingFilterProxy;

import br.com.projeto.hibernate.HibernateUtil;

@WebFilter
public class OpenSessionInViewFilter extends DelegatingFilterProxy {

	protected static SessionFactory sf;

	// Filtra as requisi��es para p�ginas *.jsp
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		try {

			sf.getCurrentSession().beginTransaction();
			chain.doFilter(request, response);
			sf.getCurrentSession().getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
			if (sf.getCurrentSession().isOpen()) {
				sf.getCurrentSession().close();
			}

		}
	}

	/* M�todo executado ao iniciar - cria uma sessao */
	@Override
	protected void initFilterBean() throws ServletException {
		sf = HibernateUtil.getSessionFactory();
	}

	@Override
	public void destroy() {
	}

}
