<%!
  String companyName = "Wipro Technologies Limited"; //instance variable

  public int add(int x, int y){
	  return x + y;
  }
%>
<h2>
<%
 out.println("my company name = " + companyName + "<br><br>");
 int x = 12; //local variable
 int y = 25; //local variable
 int z = x + y;
 out.println(String.format("%2d + %2d = %3d", x, y, z));
%>
</h2>