<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import ="java.util.Date,java.text.SimpleDateFormat" %>
<%
//運勢をランダム表記
String[] luckArray= {"超スッキリ","スッキリ","最悪","外に出ないほうがいい"};
int index =(int)(Math.random()* 4);
String luck =luckArray[index];

//実行日を取得
Date date =new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
String today =sdf.format(date);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ占い</title>
</head>
<body>
<p><%= today %>の運勢は「<%= luck %>」です</p>
</body>
</html>