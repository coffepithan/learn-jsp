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
	                                          
		                                            <form>
													  	<div class="m-3 form-group row">
															<label for="login" class="col-sm-1 col-form-label">Login</label>
															
															<div class="col-sm-4">
															    <input type="text" class="form-control" placeholder="Login" id="exampleInputEmail1" name="login">
															</div>
															
														</div>
														
														<div class="m-3 form-group row">
														    <label for="pwd" class="col-sm-1 col-form-label">Password</label>
														    
														  	<div class="col-sm-4">
															    <input type="password" class="form-control" placeholder="Password" id="pwd" name="pwd">
														  	</div>
														  	<div class="col-sm-1">
														  	
														  		<button type="submit" class="btn btn-primary btn-sm">Submit</button>
														  	</div>
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
