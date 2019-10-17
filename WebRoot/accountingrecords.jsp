<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta name="description" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="robots" content="all,follow">
<!-- Bootstrap CSS-->
<link rel="stylesheet" href="static/css/bootstrap.css" type="text/css"></link>
<!-- Font Awesome CSS-->
<link rel="stylesheet" href="static/css/font-awesome.min.css" type="text/css"></link>
<!-- Fontastic Custom icon font-->
<link rel="stylesheet" href="static/css/fontastic.css">
<!-- Google fonts - Poppins -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,700">
<!-- theme stylesheet-->
<link rel="stylesheet" href="static/css/style.default.css"
	id="theme-stylesheet">
<!-- Custom stylesheet - for your changes-->
<link rel="stylesheet" href="static/css/custom.css">
<!-- Favicon-->
<link rel="shortcut icon" href="static/img/favicon.ico">
  <!-- Tweaks for older IEs-->
  <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>

<body>
  <div class="page">
    <!-- Main Navbar-->
    <header class="header">
      <nav class="navbar">
        <div class="search-box">
          <button class="dismiss"><i class="icon-close"></i></button>
          <form id="searchForm" action="#" role="search">
            <input type="search" placeholder="What are you looking for..." class="form-control">
          </form>
        </div>
        <div class="container-fluid">
          <div class="navbar-holder d-flex align-items-center justify-content-between">
            <!-- Navbar Header-->
            <div class="navbar-header">
              <!-- Navbar Brand -->
              <div href="index.jsp class="navbar-brand d-none d-sm-inline-block">
                <div class="brand-text d-none d-lg-inline-block"><span>ONE MALL</span> <strong>万摩购物中心</strong></div>
                <div class="brand-text d-none d-sm-inline-block d-lg-none"><strong>ONE MALL</strong></div>
              </div>
              <!-- Toggle Button--><a id="toggle-btn" href="#"
                class="menu-btn active"><span></span><span></span><span></span></a>
            </div>
            <!-- Navbar Menu -->
            <ul class="nav-menu list-unstyled d-flex flex-md-row align-items-md-center">
              <!-- Search-->
              <li class="nav-item d-flex align-items-center"><a id="search" href="#"><i class="icon-search"></i></a>
              </li>
              <!-- Notifications-->
              <li class="nav-item dropdown"> <a id="notifications" rel="nofollow" data-target="#" href="#"
                  data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="nav-link"><i
                    class="fa fa-bell-o"></i><span class="badge bg-red badge-corner">12</span></a>
                <ul aria-labelledby="notifications" class="dropdown-menu">
                  <li><a rel="nofollow" href="#" class="dropdown-item">
                      <div class="notification">
                        <div class="notification-content"><i class="fa fa-envelope bg-green"></i>You have 6 new messages
                        </div>
                        <div class="notification-time"><small>4 minutes ago</small></div>
                      </div>
                    </a></li>
                  <li><a rel="nofollow" href="#" class="dropdown-item">
                      <div class="notification">
                        <div class="notification-content"><i class="fa fa-twitter bg-blue"></i>You have 2 followers
                        </div>
                        <div class="notification-time"><small>4 minutes ago</small></div>
                      </div>
                    </a></li>
                  <li><a rel="nofollow" href="#" class="dropdown-item">
                      <div class="notification">
                        <div class="notification-content"><i class="fa fa-upload bg-orange"></i>Server Rebooted</div>
                        <div class="notification-time"><small>4 minutes ago</small></div>
                      </div>
                    </a></li>
                  <li><a rel="nofollow" href="#" class="dropdown-item">
                      <div class="notification">
                        <div class="notification-content"><i class="fa fa-twitter bg-blue"></i>You have 2 followers
                        </div>
                        <div class="notification-time"><small>10 minutes ago</small></div>
                      </div>
                    </a></li>
                  <li><a rel="nofollow" href="#" class="dropdown-item all-notifications text-center"> <strong>view all
                        notifications </strong></a></li>
                </ul>
              </li>
              <!-- Logout    -->
              <li class="nav-item"><a href="login.html" class="nav-link logout"> <span
                    class="d-none d-sm-inline">退出</span><i class="fa fa-sign-out"></i></a></li>
            </ul>
          </div>
        </div>
      </nav>
    </header>
    <div class="page-content d-flex align-items-stretch">
      <!-- Side Navbar -->
      <nav class="side-navbar">
        <!-- 用户头像-->
        <div class="sidebar-header d-flex align-items-center">
          <div class="avatar"><img src="static/img/avatar-1.jpg" alt="..." class="img-fluid rounded-circle"></div>
          <div class="title">
            <h1 class="h4"><span>&nbsp;&nbsp;</span>用户名：${loginUname }</h1>
          </div>
        </div>
        <ul class="list-unstyled">
          <!-- <li class="active"><a href="index.html"> <i class="icon-home"></i>主页面 </a></li> -->
          <li><a href="index.jsp" aria-expanded="false"> <i class="icon-interface-windows"></i>主页 </a></li>
          <li><a href="#rs" aria-expanded="false" data-toggle="collapse"> <i class="icon-interface-windows"></i>人事部</a>
            <ul id="rs" class="collapse list-unstyled ">
              <li><a href="EmployeeServlet?index=1&pg=">人员信息</a></li>
              <li><a href="memberexchange.jsp">人员变动</a></li>
            </ul>
          </li>
          <li><a href="#cw" aria-expanded="false" data-toggle="collapse"> <i class="icon-interface-windows"></i>财务部 </a>
            <ul id="cw" class="collapse list-unstyled ">
              <li><a href="accountsstatistics.jsp">账目统计</a></li>
              <li><a href="accountmanager.jsp">账目审批</a></li>
              <li><a href="accountingrecords.jsp">财务记录</a></li>
            </ul>
          </li>
          <li><a href="#cg" aria-expanded="false" data-toggle="collapse"> <i class="icon-interface-windows"></i>采购部 </a>
            <ul id="cg" class="collapse list-unstyled ">
              <li><a href="purchase.jsp">采购单</a></li>
              <li><a href="purchasereport.jsp">采购报表</a></li>
              <li><a href="purchaserecord.jsp">采购记录</a></li>
            </ul>
          </li>
          <li><a href="#wx" aria-expanded="false" data-toggle="collapse"> <i class="icon-interface-windows"></i>维修部 </a>
            <ul id="wx" class="collapse list-unstyled ">
              <li><a href="repairbill.jsp">维修单</a></li>
              <li><a href="repairrecord.jsp">维修记录</a></li>
            </ul>
          </li>
          </li>
          <li><a href="#ch" aria-expanded="false" data-toggle="collapse"> <i class="icon-interface-windows"></i>策划部 </a>
            <ul id="ch" class="collapse list-unstyled ">
              <li><a href="plot.jsp">策划单</a></li>
              <li><a href="plotrecord.jsp">活动记录</a></li>
            </ul>
          </li>
        </ul><span class="heading">管理</span>
        <ul class="list-unstyled">
          <li><a href="#dp" aria-expanded="false" data-toggle="collapse"> <i class="icon-flask"></i>店铺管理 </a>
            <ul id="dp" class="collapse list-unstyled ">
              <li><a href="dpgl(1).html">店铺管理</a></li>
              <li><a href="dpxg(1).html">店铺信息</a></li>
            </ul>
          </li>
          <li><a href="#hy" aria-expanded="false" data-toggle="collapse"> <i class="icon-mail"></i>会员管理 </a>
            <ul id="hy" class="collapse list-unstyled ">
              <li><a href="hygl(1).html">会员管理</a></li>
              <li><a href="hyxg(1).html">会员信息</a></li>
            </ul>
          </li>
          <li><a href="#gly" aria-expanded="false" data-toggle="collapse"><i class="icon-picture"></i>管理员中心 </a>
            <ul id="gly" class="collapse list-unstyled ">
              <li><a href="glygl(1).html">管理员管理</a></li>
              <li><a href="glyxg(1).html">管理员信息</a></li>
            </ul>
          </li>
        </ul>
      </nav>
      <div class="content-inner">
            <!-- Page Header-->
            <header class="page-header">
              <div class="container-fluid">
                <h2 class="no-margin-bottom">财务记录</h2>
              </div>
            </header>
            <!-- Breadcrumb-->
            <div class="breadcrumb-holder container-fluid">
              <ul class="breadcrumb">
                <li class="breadcrumb-item"><a href="index.jsp">主页</a></li>
                <li class="breadcrumb-item active">财务记录</li>
              </ul>
            </div>
            <section class="tables">   
              <div class="container-fluid">
                <div class="row">
                  <div class="col-lg-12">
                    <div class="card">
                      <div class="card-close">
                        <div class="dropdown">
                          <button type="button" id="closeCard1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="dropdown-toggle"><i class="fa fa-ellipsis-v"></i></button>
                          <div aria-labelledby="closeCard1" class="dropdown-menu dropdown-menu-right has-shadow"><a href="#" class="dropdown-item remove"> <i class="fa fa-times"></i>Close</a><a href="#" class="dropdown-item edit"> <i class="fa fa-gear"></i>Edit</a></div>
                        </div>
                      </div>
                      <div class="card-header d-flex align-items-center">
                        <h3 class="h4">采购部财务记录</h3>
                      </div>
                      <div class="card-body">
                        <div class="table-responsive">
                          <table class="table">
                            <thead>
                              <tr>
                                <th>#</th>
                                <th>名称</th>
                                <th>数量</th>
                                <th>单价</th>
                                <th>类别</th>
                                <th>时间</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <th scope="row">1</th>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                              </tr>
                              <tr>
                                <th scope="row">2</th>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>@fat</td>
                              </tr>
                              <tr>
                                <th scope="row">3</th>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>@twitter</td>
                              </tr>
                            </tbody>
                          </table>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="col-lg-12">
                    <div class="card">
                      <div class="card-close">
                        <div class="dropdown">
                          <button type="button" id="closeCard2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="dropdown-toggle"><i class="fa fa-ellipsis-v"></i></button>
                          <div aria-labelledby="closeCard2" class="dropdown-menu dropdown-menu-right has-shadow"><a href="#" class="dropdown-item remove"> <i class="fa fa-times"></i>Close</a><a href="#" class="dropdown-item edit"> <i class="fa fa-gear"></i>Edit</a></div>
                        </div>
                      </div>
                      <div class="card-header d-flex align-items-center">
                        <h3 class="h4">维修部财务记录</h3>
                      </div>
                      <div class="card-body">
                        <div class="table-responsive">  
                          <table class="table table-striped">
                            <thead>
                              <tr>
                                <th>#</th>
                                <th>名称</th>
                                <th>数量</th>
                                <th>单价</th>
                                <th>类别</th>
                                <th>时间</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <th scope="row">1</th>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                              </tr>
                              <tr>
                                <th scope="row">2</th>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>@fat</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                              </tr>
                              <tr>
                                <th scope="row">3</th>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>@twitter</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                              </tr>
                            </tbody>
                          </table>
                        </div>
                      </div>
                    </div>
                  </div>
                  <!--<div class="col-lg-6">
                    <div class="card">
                      <div class="card-close">
                        <div class="dropdown">
                          <button type="button" id="closeCard3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="dropdown-toggle"><i class="fa fa-ellipsis-v"></i></button>
                          <div aria-labelledby="closeCard3" class="dropdown-menu dropdown-menu-right has-shadow"><a href="#" class="dropdown-item remove"> <i class="fa fa-times"></i>Close</a><a href="#" class="dropdown-item edit"> <i class="fa fa-gear"></i>Edit</a></div>
                        </div>
                      </div>
                      <div class="card-header d-flex align-items-center">
                        <h3 class="h4">Striped table with hover effect</h3>
                      </div>
                      <div class="card-body">
                        <div class="table-responsive">                       
                          <table class="table table-striped table-hover">
                            <thead>
                              <tr>
                                <th>#</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Username</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <th scope="row">1</th>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                              </tr>
                              <tr>
                                <th scope="row">2</th>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>@fat</td>
                              </tr>
                              <tr>
                                <th scope="row">3</th>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>@twitter                            </td>
                              </tr>
                            </tbody>
                          </table>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="col-lg-6">
                    <div class="card">
                      <div class="card-close">
                        <div class="dropdown">
                          <button type="button" id="closeCard4" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="dropdown-toggle"><i class="fa fa-ellipsis-v"></i></button>
                          <div aria-labelledby="closeCard4" class="dropdown-menu dropdown-menu-right has-shadow"><a href="#" class="dropdown-item remove"> <i class="fa fa-times"></i>Close</a><a href="#" class="dropdown-item edit"> <i class="fa fa-gear"></i>Edit</a></div>
                        </div>
                      </div>
                      <div class="card-header d-flex align-items-center">
                        <h3 class="h4">Compact Table</h3>
                      </div>
                      <div class="card-body">
                        <div class="table-responsive">   
                          <table class="table table-striped table-sm">
                            <thead>
                              <tr>
                                <th>#</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Username</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <th scope="row">1</th>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                              </tr>
                              <tr>
                                <th scope="row">2</th>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>@fat</td>
                              </tr>
                              <tr>
                                <th scope="row">3</th>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>@twitter      </td>
                              </tr>
                              <tr>
                                <th scope="row">4</th>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                              </tr>
                              <tr>
                                <th scope="row">5</th>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>@fat</td>
                              </tr>
                              <tr>
                                <th scope="row">6</th>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>@twitter      </td>
                              </tr>
                            </tbody>
                          </table>
                        </div>
                      </div>
                    </div>
                  </div> -->
                </div>
              </div>
            </section>
            <!--底部版权说明-->
            <footer class="main-footer">
              <div class="container-fluid">
                <div class="row">
                  <div class="col-sm-6">
                    <p>Copyright &copy; 2019.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
                  </div>
                  <div class="col-sm-6 text-right">
                    <p></p>
                    <!-- Please do not remove the backlink to us unless you support further theme's development at https://bootstrapious.com/donate. It is part of the license conditions. Thank you for understanding :)-->
                  </div>
                </div>
              </div>
            </footer>
          </div>
        
      </div>
      
    </div>
    <!-- JavaScript files-->
  <script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-1.9.0.min.js"></script>
	<script type="text/javascript" src="static/vendor/popper.js/umd/popper.min.js"></script>
	<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="static/vendor/jquery.cookie/jquery.cookie.js"></script>
	<script type="text/javascript" src="static/js/Chart.js"></script>
	<script src="static/vendor/jquery-validation/jquery.validate.min.js"></script>
	<!-- Main File-->
	<script type="text/javascript" src="static/js/front.js"></script>
</body>

</html>