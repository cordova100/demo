<%-- 
    Document   : principal
    Created on : 19-jun-2015, 11:42:03
    Author     : lcordovas
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Clinica Peluchin | Login</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- Bootstrap 3.3.4 -->
        <link href="<%=request.getContextPath()%>/lte/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- Font Awesome Icons -->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="<%=request.getContextPath()%>/lte/dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />
        <!-- iCheck -->
        <link href="<%=request.getContextPath()%>/lte/plugins/iCheck/square/blue.css" rel="stylesheet" type="text/css" />

    </head>
    <body class="login-page">
        <div class="login-box">
            <div class="login-logo">
                <a href="#"><b>Clinica</b> Peluchin</a>
            </div><!-- /.login-logo -->
            <div class="login-box-body">
                <p class="login-box-msg">Ingrese su cuenta</p>
                <form method="post" name="f" action="<%=request.getContextPath()%>/j_spring_security_check">
                    <div class="form-group has-feedback">                        
                        <input type="text" class="form-control" name="j_username" placeholder="Email"/>
                        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" name="j_password" placeholder="Password"/>
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <div class="row">            
                        <div class="col-xs-4">
                            <button type="submit" class="btn btn-primary btn-block btn-flat">Login</button>
                        </div>
                    </div>
                    <div class="form-group has-feedback"> 
                        <c:if test="${loginError}">
                            <p style="color:red"><br>Usuario / Clave incorrectos.</p>
                        </c:if>
                    </div>
                </form>
            </div>
        </div>

        <!-- jQuery 2.1.4 -->
        <script src="<%=request.getContextPath()%>/lte/plugins/jQuery/jQuery-2.1.4.min.js"></script>
        <!-- Bootstrap 3.3.2 JS -->
        <script src="<%=request.getContextPath()%>/lte/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <!-- iCheck -->
        <script src="<%=request.getContextPath()%>/lte/plugins/iCheck/icheck.min.js" type="text/javascript"></script>
    </body>
</html>