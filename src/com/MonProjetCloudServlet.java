package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;
import com.google.appengine.api.taskqueue.TaskOptions.Method;

@SuppressWarnings("serial")
public class MonProjetCloudServlet extends HttpServlet {
	
	/*public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}*/
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupérer données formulaire wen
		String nom = req.getParameter("nom");
		Queue queue = QueueFactory.getDefaultQueue();
		queue.add(TaskOptions.Builder.withUrl("/urlTacheDeFond").method(Method.GET).param("nom", nom));
		req.setAttribute("name", nom);
		getServletContext().getRequestDispatcher("/reponse.jsp").forward(req, resp);
	}
}
