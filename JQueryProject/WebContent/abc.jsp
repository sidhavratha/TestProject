<%@ page language="java" contentType="text/html"%>

<%
 	String country = request.getParameter("country");
    String flavour = request.getParameter("flavour");
    String apg = request.getParameter("apg");
    String jsonOutput = "{";
    System.out.println(country+":"+flavour+":"+apg);
    %>

<%jsonOutput+=((country==null || country.equalsIgnoreCase(""))?"\"country\":\"<select name=\\\"country\\\"><option value=\\\"\\\" selected=\\\"selected\\\"></option><option value=\\\"Canada\\\">Canada</option><option value=\\\"Nepal\\\">Nepal</option></select>\"":"");%>
<%jsonOutput+=((flavour==null || flavour.equalsIgnoreCase(""))?((country==null || country.equalsIgnoreCase(""))?",":"")+"\"flavour\":\"<select name=\\\"flavour\\\"><option value=\\\"\\\" selected=\\\"selected\\\"></option><option value=\\\"sweet\\\">Sweet</option><option value=\\\"sour\\\">Sour</option></select>\"":"");%>
<%jsonOutput+=((apg==null || apg.equalsIgnoreCase(""))?((flavour==null || flavour.equalsIgnoreCase("")) || (country==null || country.equalsIgnoreCase(""))?",":"")+"\"apg\":\"<select name=\\\"apg\\\"><option value=\\\"\\\" selected=\\\"selected\\\"></option><option value=\\\"A\\\">A</option><option value=\\\"P\\\">P</option><option value=\\\"G\\\">G</option></select>\"":"");%>




<%

jsonOutput+="}";

System.out.println(jsonOutput);
%>
<%=jsonOutput%>

