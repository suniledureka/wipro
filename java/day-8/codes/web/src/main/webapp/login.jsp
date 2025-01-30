<%!
 String user, pass;
%>

<%
 user = request.getParameter("txt_uid");
 pass = request.getParameter("txt_pwd"); 
%>

<h2>
 user name = <%=user %> <br>
 password = <%=pass %>
</h2>

<%
 if(user.equals("admin") && pass.equals("1234")){
	 response.sendRedirect("https://www.wipro.com");
 }else{
	 response.sendError(response.SC_UNAUTHORIZED, "Authentication Failed .. Invalid Username/ Password");
 }
%>