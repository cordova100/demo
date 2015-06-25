<%-- 
    Document   : persona
    Created on : 19-jun-2015, 16:44:08
    Author     : lcordovas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>  
        <title>Clinica Veterinaria | Peluchin</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- Bootstrap 3.3.4 -->
        <link href="<%=request.getContextPath()%>/lte/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- Font Awesome Icons -->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
        <link href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <!-- jvectormap -->
        <link href="<%=request.getContextPath()%>/lte/plugins/jvectormap/jquery-jvectormap-1.2.2.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="<%=request.getContextPath()%>/lte/dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />
        <!-- AdminLTE Skins. Choose a skin from the css/skins folder instead of downloading all of them to reduce the load. -->
        <link href="<%=request.getContextPath()%>/lte/dist/css/skins/_all-skins.min.css" rel="stylesheet" type="text/css" />

        <link href="<%=request.getContextPath()%>/lte/plugins/datatables/dataTables.bootstrap.css" rel="stylesheet" type="text/css" />         

    </head>
    <body class="skin-blue sidebar-mini">
        <div class="wrapper">

            <%@include file= "/public/header.jsp" %>          
            <%@include file= "/public/menu.jsp" %>

            <div class="content-wrapper">
                <section class="content">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title">
                                        <button class="btn btn-block btn-success" onclick="location = '<%=request.getContextPath()%>/especie/nuevo'">
                                            Nuevo
                                        </button>
                                    </h3>
                                </div><!-- /.box-header -->
                                <div class="box">
                                    <div class="box-header">
                                        <h3 class="box-title">Listar Especies</h3>
                                    </div><!-- /.box-header -->
                                    <div class="box-body">
                                        <table id="example1" class="table table-bordered table-striped">
                                            <thead>
                                                <tr>
                                                    <th>Nombre</th>                                                    
                                                    <th>Conf</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach items="${especies}" var="p">
                                                    <tr>
                                                        <td>${p.nombre}</td>                                                        
                                                        <td>
                                                            <a href="<%=request.getContextPath()%>/especie/editar/${p.id}">Editar</a>
                                                            <a href="<%=request.getContextPath()%>/especie/eliminar/${p.id}">Eliminar</a>                                                            
                                                        </td>
                                                    </tr> 
                                                </c:forEach>
                                            </tbody>
                                            <tfoot>
                                                <tr>
                                                    <th>Nombre</th>
                                                    <th></th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div><!-- /.box-body -->
                                </div><!-- /.box -->
                            </div>
                        </div>
                    </div>
                </section>
            </div><!-- /.content-wrapper -->
            <%@include file= "/public/footer.jsp" %>
        </div><!-- ./wrapper -->

        <script src="<%=request.getContextPath()%>/lte/plugins/jQuery/jQuery-2.1.4.min.js"></script>
        <!-- Bootstrap 3.3.2 JS -->
        <script src="<%=request.getContextPath()%>/lte/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <!-- DATA TABES SCRIPT -->
        <script src="<%=request.getContextPath()%>/lte/plugins/datatables/jquery.dataTables.min.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/lte/plugins/datatables/dataTables.bootstrap.min.js" type="text/javascript"></script>
        <!-- SlimScroll -->
        <script src="<%=request.getContextPath()%>/lte/plugins/slimScroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <!-- FastClick -->
        <script src='<%=request.getContextPath()%>/lte/plugins/fastclick/fastclick.min.js'></script>
        <!-- AdminLTE App -->
        <script src="<%=request.getContextPath()%>/lte/dist/js/app.min.js" type="text/javascript"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="<%=request.getContextPath()%>/lte/dist/js/demo.js" type="text/javascript"></script>
        <!-- page script -->
        <script src="<%=request.getContextPath()%>/js/idioma.js" type="text/javascript"></script>     
    </body>
</html>