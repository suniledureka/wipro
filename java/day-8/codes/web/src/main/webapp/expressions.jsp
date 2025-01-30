<%!
  String companyName = "Wipro Technologies Limited"; //instance variable

  public int add(int x, int y){
	  return x + y;
  }
%>
<h2>
 Company Name = <%=companyName %>
 <br><br>
 <%="sum = " + add(12, 45) %>
</h2>