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
	                                        <div class="row">
	                                            
	                                            
	                                            
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
