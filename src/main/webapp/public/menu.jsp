<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="<%=request.getContextPath()%>/lte/dist/img/user2-160x160.jpg" class="img-circle" alt="Yo" />
            </div>
            <div class="pull-left info">
                <p>Cordova100@gmail.com</p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>

        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">MENU DE NAVEGACION</li>            
            <li><a href="<%=request.getContextPath()%>/persona"><i class="fa fa-user"></i> <span>Persona</span></a></li>
            <li><a href="<%=request.getContextPath()%>/usuario"><i class="fa fa-user-plus"></i> <span>Usuario</span></a></li>                       
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-medium"></i> <span>Mascotas</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                    <li><a href="<%=request.getContextPath()%>/especie"><i class="fa fa-minus-square"></i> <span>Especie</span></a></li>                       
                    <li><a href="<%=request.getContextPath()%>/raza"><i class="fa fa-heartbeat"></i> <span>Raza</span></a></li>  
                </ul>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->

</aside>
