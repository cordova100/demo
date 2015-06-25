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
        <link href="<%=request.getContextPath()%>/lte/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
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
                        <div class="col-md-6">
                            <div class="box box-primary">
                                <div class="box-header">
                                    <h3 class="box-title">Editar Especie</h3>
                                </div><!-- /.box-header -->
                                <!-- form start -->
                                <form role="form" id="form" data-toggle="validator" action="<%=request.getContextPath()%>/especie/modificar">
                                    <div class="box-body">
                                        <div class="form-group">
                                            <label for="nombre" class="control-label">Nombre</label>
                                            <input type="text" class="form-control" id="nombres" placeholder="Nombre" name="nombre" value="${especie.nombre}"/>
                                        </div>
                                    </div><!-- /.box-body -->

                                    <div class="box-footer">
                                        <button type="submit" class="btn btn-primary">Registrar</button>
                                        <button type="button" class="btn btn-danger" onclick="location = '<%=request.getContextPath()%>/especie'">Cancelar</button>
                                        <input type="hidden" name="id" id="id" value="${especie.id}" />
                                    </div>
                                </form>
                            </div><!-- /.box -->
                        </div>
                    </div>
                </section>
            </div><!-- /.content-wrapper -->
            <%@include file= "/public/footer.jsp" %>
        </div><!-- ./wrapper -->

        <script src="<%=request.getContextPath()%>/lte/plugins/jQuery/jQuery-2.1.4.min.js"></script>        
        <script src="<%=request.getContextPath()%>/lte/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>        
        <script src="<%=request.getContextPath()%>/lte/plugins/datatables/jquery.dataTables.min.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/lte/plugins/datatables/dataTables.bootstrap.min.js" type="text/javascript"></script>        
        <script src="<%=request.getContextPath()%>/lte/plugins/slimScroll/jquery.slimscroll.min.js" type="text/javascript"></script>        
        <script src='<%=request.getContextPath()%>/lte/plugins/fastclick/fastclick.min.js'></script>        
        <script src="<%=request.getContextPath()%>/lte/dist/js/app.min.js" type="text/javascript"></script>        
        <script src="<%=request.getContextPath()%>/lte/dist/js/demo.js" type="text/javascript"></script>        
        <script src="<%=request.getContextPath()%>/js/idioma.js" type="text/javascript"></script>  
        <script src="<%=request.getContextPath()%>/js/jquery.validate.js" type="text/javascript"></script> 
        <script src="<%=request.getContextPath()%>/lte/plugins/input-mask/jquery.inputmask.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/lte/plugins/input-mask/jquery.inputmask.date.extensions.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/lte/plugins/input-mask/jquery.inputmask.extensions.js" type="text/javascript"></script>

        <script type="text/javascript">
            $("#datemask").inputmask("dd/mm/yyyy", {"placeholder": "dd/mm/yyyy"});
            $("#datemask2").inputmask("mm/dd/yyyy", {"placeholder": "mm/dd/yyyy"});
            $("[data-mask]").inputmask();

            $("#form").validate({
                rules: {
                    nombre: {
                        required: true,
                        minlength: 5
                    }                    
                },
                messages: {
                    nombre: {
                        required: "Ingrese Nombre de especie",
                        minlength: "Ingrese como minimo 5 caracteres"
                    }
                }
            });
        </script>         
    </body>
</html>