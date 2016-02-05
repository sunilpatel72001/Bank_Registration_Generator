package controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.BankBeans;

/**
 * Servlet implementation class BankServlet
 */
@WebServlet("/create")
public class BankServlet extends HttpServlet {
	
	SessionFactory sf;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		sf = cfg.buildSessionFactory();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		int balance =Integer.parseInt(req.getParameter("balance"));

		BankBeans bb= new BankBeans(null, name, email, phone, balance);
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		String ac =(String)s.save(bb);
		t.commit();
		s.close();
		
		resp.getWriter().println("Id = "+ac);
		
	}
	
	@Override
	public void destroy() {
		
		sf.close();
	}

}
