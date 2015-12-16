package com;

import java.io.IOException;

import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;

@SuppressWarnings("serial")
public class TacheDeFondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		 DatastoreService dataStore = DatastoreServiceFactory.getDatastoreService();
		 Entity entity = new Entity("Etudiants");	// neoud fils du noeud Etudiants
		 
		 String nom = req.getParameter("nom");
		 entity.setProperty("nom",  nom);
		 dataStore.put(entity);
	}
	
}
