<%@page contentType="text/html" pageEncoding="UTF-8"%>

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

    </head>
    <body class="skin-blue sidebar-mini">
        <div class="wrapper">

            <%@include file= "/public/header.jsp" %>
            <!-- Left side column. contains the logo and sidebar -->
            <%@include file= "/public/menu.jsp" %>


            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Principal
                        <small>Version 1.0</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Inicio</a></li>
                        <li class="active">Principal</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">
                    <!-- COLOR PALETTE -->
                    <div class='box box-default color-palette-box'>                        
                        <div class='box-body'>
                            <div class='row'>
                                <div class='col-sm-2 col-md-6'>
                                    <img src="<%=request.getContextPath()%>/images/principal.jpg" class="img-circle" height="550px" alt="Clinica Peluchin" />
                                </div><!-- /.col -->                                
                            </div><!-- /.row -->
                        </div><!-- /.box-body -->
                    </div><!-- /.box -->
                </section>
            </div><!-- /.content-wrapper -->
            <%@include file= "/public/footer.jsp" %>
        </div><!-- ./wrapper -->
        <!-- jQuery 2.1.4 -->
        <script src="<%=request.getContextPath()%>/lte/plugins/jQuery/jQuery-2.1.4.min.js"></script>
        <!-- Bootstrap 3.3.2 JS -->
        <script src="<%=request.getContextPath()%>/lte/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <!-- FastClick -->
        <script src='<%=request.getContextPath()%>/lte/plugins/fastclick/fastclick.min.js'></script>
        <!-- AdminLTE App -->
        <script src="<%=request.getContextPath()%>/lte/dist/js/app.min.js" type="text/javascript"></script>
        <!-- Sparkline -->
        <script src="<%=request.getContextPath()%>/lte/plugins/sparkline/jquery.sparkline.min.js" type="text/javascript"></script>
        <!-- jvectormap -->
        <script src="<%=request.getContextPath()%>/lte/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/lte/plugins/jvectormap/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script>
        <!-- SlimScroll 1.3.0 -->
        <script src="<%=request.getContextPath()%>/lte/plugins/slimScroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <!-- ChartJS 1.0.1 -->
        <script src="<%=request.getContextPath()%>/lte/plugins/chartjs/Chart.min.js" type="text/javascript"></script>
        <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
        <script src="<%=request.getContextPath()%>/lte/dist/js/pages/dashboard2.js" type="text/javascript"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="<%=request.getContextPath()%>/lte/dist/js/demo.js" type="text/javascript"></script>
    </body>
</html>