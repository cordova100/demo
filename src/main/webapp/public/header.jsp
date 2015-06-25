<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%
    Date ahora = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
    String hoy = ft.format(ahora);
%>
<header class="main-header">
    <a href="<%=request.getContextPath()%>/principal" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>C</b>-PEL</span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>Clinica</b> Peluchin</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top" role="navigation">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>
        <!-- Navbar Right Menu -->
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">               
                <!-- User Account: style can be found in dropdown.less -->
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="<%=request.getContextPath()%>/lte/dist/img/user2-160x160.jpg" class="user-image" alt="Yo"/>
                        <span class="hidden-xs">cordova100@gmail.com</span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="<%=request.getContextPath()%>/lte/dist/img/user2-160x160.jpg" class="img-circle" alt="Yo" />
                            <p>
                                cordova100@gmail.com
                                <small>Fecha: <%=hoy%></small>
                            </p>
                        </li>                        
                        <!-- Menu Footer-->
                        <li class="user-footer">

                            <div class="pull-right">
                                <a href="<%=request.getContextPath()%>/logout" class="btn btn-default btn-flat">Salir</a>
                            </div>
                        </li>
                    </ul>
                </li>                
            </ul>
        </div>
    </nav>
</header>

