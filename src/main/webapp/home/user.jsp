<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

	<jsp:include page="head.jsp"></jsp:include>

	  <body>
	  
	  <jsp:include page="theme-load.jsp"></jsp:include>
	  
	  <div id="pcoded" class="pcoded">
	      <div class="pcoded-overlay-box"></div>
	      <div class="pcoded-container navbar-wrapper">
	          
	          <jsp:include page="navbar.jsp"></jsp:include>
	         
	          <div class="pcoded-main-container">
	              <div class="pcoded-wrapper">
	                  
	                  <jsp:include page="navbarmainmenu.jsp"></jsp:include>
	                  
	                  <div class="pcoded-content">
	                      <!-- Page-header start -->
	                      
	                     <jsp:include page="page-header.jsp"></jsp:include>
	                     
	                      <!-- Page-header end -->
	                      
	                        <div class="pcoded-inner-content">
	                            <!-- Main-body start -->
	                            <div class="main-body">
	                                <div class="page-wrapper">
	                                    <!-- Page-body start -->
	                                    <div class="page-body">
	                                            <h3>User register!</h3>
	                                        <div class="row">
	                                            <div class="col-sm-12">
	                                          
		                                            <form class="form-material" action="<%= request.getContextPath() %>/ServletUserController" method="post">
													  	<div class="m-3 form-group row">
															<label for="login" class="col-sm-1 col-form-label">Id</label>
															
															<div class="col-sm-1">
															    <input type="text" required class="form-control" readonly placeholder="Id" id="id" name="id" value="${modelLogin.id}">
															</div>
															
														</div>
														
														<div class="m-3 form-group row">
														    <label for="pwd" class="col-sm-1 col-form-label">Login</label>
														    
														  	<div class="col-sm-4">
															    <input type="text" required class="form-control" placeholder="Login" id="login" name="login"  value="${modelLogin.login}">
														  	</div>
														
														</div>
														
														<div class="m-3 form-group row">
														    <label for="pwd" class="col-sm-1 col-form-label">Password</label>
														    
														  	<div class="col-sm-4">
															    <input type="password" required class="form-control" placeholder="Password" id="pwd" name="pwd" value="${modelLogin.pwd}">
														  	</div>
														
														</div>
														
														<div class="m-3 form-group row">
														    <label for="pwd" class="col-sm-1 col-form-label">Name</label>
														    
														  	<div class="col-sm-4">
															    <input type="text" required class="form-control" placeholder="Name" id="name" name="username" value="${modelLogin.username}">
														  	</div>
														
														</div>
														
														
														<div class="m-3 form-group row">
														    <label for="pwd" class="col-sm-1 col-form-label">Email</label>
														    
														  	<div class="col-sm-4">
															    <input type="email" required class="form-control" placeholder="Email" id="email" name="email" value="${modelLogin.email}">
														  	</div>
														
														</div>
														
													 	
													 	<div class="m-3 form-group row">
												  			<button type="submit" class="btn btn-primary btn-sm m-3">Create</button>
												  			<button type="submit" class="btn btn-success btn-sm m-3">Update</button>
												  			<button type="submit" class="btn btn-danger btn-sm m-3">Delete</button>
													 	</div>
													</form>
		                                            
	                                            
	                                            </div>
	                                           
	                                            	 
	                                        </div>
	                                    </div>
	                                    <!-- Page-body end -->
	                                </div>
	                                <div id="styleSelector"> </div>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	   
	   <jsp:include page="js.jsp"></jsp:include>
	  
	</body>


</html>
