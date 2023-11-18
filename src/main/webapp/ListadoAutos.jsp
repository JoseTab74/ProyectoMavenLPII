<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="model.TblAuto" %>
    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de autos</title>
</head>
<body bgcolor="#FBFCFC">
<div color="#641E16">
<h1 align="center" style="color:#17202A;">Listado de Autos</h1>
</div>
<table align="center" border="1"  bgcolor="#D6EAF8" >

<tr style="color:#004DFF">
<th>Codigo</th>
<th>Marca</th>
<th>Modelo</th>
<th>Color</th>
<th>Motor</th>
<th>Nro_Tareje</th>
</tr>
<%
List<TblAuto> listar=(List<TblAuto>)request.getAttribute("listado");
//aplicamos
for(TblAuto lis:listar){
	//aplicamos una cndicion
	if(lis!=null){
		%>
		<tr>
		<td><%=lis.getIdauto() %></td>
		<td><%=lis.getMarca() %></td>
		<td><%=lis.getModelo() %></td>
		<td><%=lis.getColor() %></td>
		<td><%=lis.getMotor() %></td>
		<td><%=lis.getNroTarje() %></td>
		</tr>
		
		<% 
	}//fin del if
	
}//Fin del bucle

%>

</table>


</body>
</html>