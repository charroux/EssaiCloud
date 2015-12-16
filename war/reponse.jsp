<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Nom saisi dans le  formulaire : <%=request.getAttribute("name")%><br>
	
	Lien vers la page d'admin qui permet de voir les données dans la base de données :
	<a href="http://localhost:8888/_ah/admin">http://localhost:8888/_ah/admin</a><br>
	
	Lien vers la page d'admin qui permet de choisir le domain (namespace) où sont stockée les données de chaque client :
	<a href="http://localhost:8888/_ah/admin/datastore?namespace=&kind=">http://localhost:8888/_ah/admin/datastore?namespace=&kind=</a>
	Saisir client1 ou client2 comme Namespace.	
</body>
</html>