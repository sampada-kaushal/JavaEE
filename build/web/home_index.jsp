<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home | JavaTs</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet"> 
    <link href="css/lightbox.css" rel="stylesheet"> 
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">





  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    var availableTags = [
      "ActionScript",
      "AppleScript",
      "Asp",
      "BASIC",
      "C",
      "C++",
      "Clojure",
      "COBOL",
      "ColdFusion",
      "Erlang",
      "Fortran",
      "Groovy",
      "Haskell",
      "Java",
      "JavaScript",
      "Lisp",
      "Perl",
      "PHP",
      "Python",
      "Ruby",
      "Scala",
      "Scheme"
    ];
    $( "#tags" ).autocomplete({
      source: availableTags
    });
  });
  </script>




    <!--[if lt IE 9]>
	    <script src="js/html5shiv.js"></script>
	    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body>
	<header id="header">      
        <div class="container">
            <div class="row">
                <div class="col-sm-12 overflow">
                   <div class="social-icons pull-right">
                        <ul class="nav nav-pills">
                           <li> <img src="images/mic.png" class="mic" height="24px"></li>
                           <li><p style="float:left"><b>Welcome <%= request.getParameter("username").toUpperCase() %>(<a href="login.jsp">Logout</a>)</b></p></li>
                           <% Date d = new Date(); %><li><p style="float:right"><b><%= d.toString() %></b></p></li>
                        </ul>
                    </div> 
                </div>
             </div>
        </div>
        <div class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>

                    <a class="navbar-brand" href="index.html">
                    	<h1><img src="images/logo.png" alt="logo" id="logo"></h1>
                    </a>
                    
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
					
                        <li class="active_main_header"><a href="index.html">Home</a></li>
						<li> <a href="core.html">Core Java</a></li>
						<li class="show_drop"> <a href="servlet.html">Advance Java</a>
						<ul class="drop">
						<li>
						<a href="Server_Enviorment.html">Servlet</a>
						</li>
						<li>
						<a href="jsp.html">JSP</a>
						</li>
						</ul>
						</li>
                        <li ><a href="hibernate.html">Hibernate</a>
                        </li>                    
                        <li><a href="spring.html">Spring
                     </a>
					 
                        </li>
						<li> <a href="android.html">Android</a></li>
                                             
                        <li><a href="contact.html ">Contact</a></li>
						<li><a href="feedback.html ">Feedback</a></li>
						<li><a href="interview.html ">Interview Q/A </a></li>
						
						
                    </ul>
                </div>
                <div class="search">
                    <form role="form">
                        <i class="fa fa-search"></i>
                        <div class="field-toggle">
<div class="ui-widget">
  <label for="tags">Tags: </label>
   <input type="text" id="tags" class="search-form" autocomplete="off" placeholder="Search" >

                           </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </header>
    <!--/#header-->
<br> 	
    <section id="home-slider">
        <div class="container">
		<hr class="hr">
            <div class="row">
                <div class="main-slider"> &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;Click to learn java8
                    <div class="slide-text">
                        &nbsp;&nbsp;&nbsp;<a href="index2.html"><img src="java8.png"></a>
                        <p></p>
                       
                    </div>
                    <img src="images/home/slider/java.png" class="slider-hill" alt="slider image">
					       
                    <img src="images/home/slider/spring-hibernate-logo.png" class="slider-house" alt="slider image">
        
                </div>
            </div>
        </div>
        <div class="preloader"><i class="fa fa-sun-o fa-spin"></i></div>
    </section>
    <!--/#home-slider-->

   <br><br><br><br><br><br><br><br>
   
   

    <footer id="footer">
        <div class="container">
            <div class="row">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<ul class="home-nav">
                <li class="home_header orange">
                  <a href="core.html">Core</a>
                </li>
				<li class="main">
				    <a href="core_fundamentals.html">  Java Fundamentals </a></li>
					<li class="main"><a href="jdk.html"> JDK File Structure </a></li>
                    <li> <a href="core_development.html">Development  </a></li>
					<li>
                     <a href="core_operators.html">  Operators and Assignments </a></li>
					 <li>
                     <a href="core_flowcontrol.html"> Flow Control </a></li>
					 <li><a href="core_accessmodifiers.html">  Declarations and Access Modifiers</a></li>
                     <li class="main"> <a href="core_garbage.html">Garbage Collector  </a></li>
					 	<li class="main"><a href="core_oops.html"> Oops Concepts </a></li>
						<li class ="main"><a href="java_object.html"> Java Object Class </a> </li>
				   <li><a href="core_innerclasses.html">Inner classes  </a></li>
				   <li><a href="core_package.html">Java Package</a></li>
				    <li class="main"> <a href="core_lang.html">Java.lang package  </a></li>
                    <li class="main"> <a href="core_io.html">Java.io package     </a></li>
					 <li class="main"> <a href="core_exception.html">Exception handling </a></li>
					 <li class="main"> <a href="core_multithreading.html">Multithreading </a>
				<li><a href="core_expression.html">  Regular Expressions   </a></li>
					 <li><a href="core_enumeration.html">  Enumerations </a></li>  
                    <li> <a href="core_internationalization.html">	Internationalization   </a></li>
					 <li><a href="core_assertion.html">Assertions  </a></li>
					 <li class="main"><a href="core_collection.html">Collection Framework     </a></li>
					 <li><a href="core_generics.html">  Generics   </a></li>
					<li class="main"><a href="core_jdbc.html"> JDBC </a></li>
					<li class="main"><a href="features_5.html"> Features of Java 5 </a></li>
		
			</ul>
			
			  <ul class="home-nav">
                 <li class="home_header yellow">
				 <a href="advance.html">Advance Java Servlet</a>
				 </li>
              <li class="active_page">
                
                                    <a href="Server_Enviorment.html">Server Enviorment</a> 
                </li>
				<li>
				<a href="servlet_intro.html">Introduction to servlet</a>
				</li>
					<li>
				<a href="servlet_architecture.html">Servlet Architecture</a>
				</li>
					<li>
				<a href="servlet_basic.html">Basic Example</a>
				</li>
					<li>
				<a href="servlet_requestresponse.html">Request and Response Interface</a>
				</li>
				
                <li >
                    <a href="Servlet_LifeCycle&Method.html">Servlet LifeCycle&Method</a>
                </li>
					<li>
				<a href="servlet_contextconfig.html">Servlet Context and Config</a>
				</li>
					<li>
				<a href="servlet_intercommunication.html">Inter Servlet Communication</a>
				</li>
              	<li>
				<a href="servlet_requestdispacture.html">Servlet Request Dispacture</a>
				</li>
					<li>
				<a href="servlet_sendredirect.html">Send Redirect</a>
				</li>
                  <li>
                    <a href="Session_Management.html">Session Management</a> 
                </li>
             	<li>
				<a href="servlet_httpsession.html">Http Session</a>
				</li>
					<li>
				<a href="servlet_cookies.html">Cookies</a>
				</li>
					<li>
				<a href="servlet_htmlhidden.html">Html Hidden</a>
				</li>
					<li>
				<a href="servlet_urlrewritten.html">Url Rewritten</a>
				</li>
				
                <li>
                    <a href="Handling_Error&Exception.html">Handling Error&Exception</a> 
                </li>
                	<li>
				<a href="servlet_filter.html">Servlet filter</a>
				</li>
					<li>
				<a href="servlet_filterlife.html">Servlet Filter LifeCycle</a>
				</li>
					<li>
				<a href="servlet_allinone.html">All in one Servlet</a>
				</li>
                 </ul>
				 
				   <ul class="home-nav" >
              
				<li class="home_header hibernate">
			<a href="hibernate.html" style="color:white;">Hibernate</a>
				</li>
				 <li class="main">
			<a href="hibernate.html">Hibernate</a>
				</li>
                <li >
				
                    <a href="hibernate_intro.html">Introduction</a>
                </li>
                <li >
                    <a href="hibernate_architecture.html">Architecture</a>
                </li>
                <li>
                    <a href="hibernate_filesystem.html">File System<a>
                </li>
	
                <li >
                    <a href="hibernate_annotation.html">Hibernate with  Annotation</a>
                </li>
                <li>
                    <a href="hibernate_webapplication.html">Web Application</a>
                </li>
                <li class="main">
                    <a href="hibernate_mapping.html">Hibernate Mapping</a>
                </li>
				    <li >
                    <a href="hibernate_tableperhierarchy.html">Table Per Hierarchy </a>
                </li>
				<li>
				 <a href="hibernate_concreate.html">Table Per Concrete </a>
                </li>
                <li >
                    <a href="hibernate_subclass.html">Table Per Subclass</a>
                </li>
                <li class="main">
                    <a href="hibernate_collection.html">Hibernate Collection</a>
                </li>
				<li class="main">
                    <a href="hibernate_list.html">Collection list Example </a>
                </li>
				
				
				<li class="main">
				<a href="hibernate_bagmap.htm">BagMap Example</a>
				</li>
				
							
				<li class="main">
                    <a href="hibernate_onetomany.html">One to Many Mapping</a>
                </li>
                
                <li class="main">
                    <a href="hibernate_namingqueries.html">Hibernate Naming Queries</a>
                </li>
                <li >
                    <a href="hibernate_caching.html">Hibernate Caching</a>
                </li>
                <li >
                    <a href="hibernate_second.html">Hibernate Second Level Caching</a>
                </li>

              
				</ul>
				
				
				
			 <ul class="home-nav">
           
					<li class="home_header green">
			<a href="spring.html">Spring
                     </a>
				</li>
                <li>
                    <a href="spring_intro.html">Introduction</a>
                </li>
				  <li>
                    <a href="spring_architecture.html">Architecture</a>
                </li>
                <li>
                    <a href="spring_filesystem.html">File System<a>
                </li>
				
                <li >
                    <a href="spring_basic.html">Basic Example</a>
                </li>
                <li  class="main">
                    <a href="spring_diioc.html">DI & IOC concept</a>
                </li>
                <li  class="main">
                    <a href="spring_constinjection.html">Constructor Injection</a>
                </li>
               <li>
                    <a href="spring_ciobject.html">CI Dependent Object</a>
                </li> 
				<li>
                    <a href="spring_collection.html">CI using Collection </a>
                </li> 
				<li>
                    <a href="spring_inheritance.html">CI using inheritance</a>
                </li> 
				<li  class="main">
                    <a href="spring_setterinjection.html">Setter Injection</a>
                </li> 
			  <li>
                    <a href="spring_siobject.html">SI Dependent Object</a>
                </li> 
				<li>
                    <a href="spring_sicollection.html">SI using Collection </a>
                </li> 
				<li  class="main">
                    <a href="spring_autowiring.html">Autowiring</a>
                </li>
				
				 <li  class="main">
                    <a href="spring_aop.html">Spring AOP</a>
                </li>
				 <li>
                    <a href="spring_aopbasic.html">AOP Basic </a>
                </li>
				 <li  class="main">
                    <a href="spring_jdbc.html">Spring JDBC</a>
                </li>
				 <li>
                    <a href="spring_jdbcfilesystem.html">JDBC File System</a>
                </li>
				 <li>
                    <a href="spring_jdbcbasic.html">Basic Example</a>
                </li>
				 <li  class="main">
                    <a href="spring_ormhibernate.html">Spring ORM/Hibernate</a>
                </li> <li>
                    <a href="spring_ormfilesystem.html">Spring ORM File system</a>
                </li>
				 <li>
                    <a href="spring_ormbasic.html">Basic Example</a>
                </li>
				 <li>
                    <a href="spring_basicwithannotation.html">Basic Example With Annotation</a>
                </li>
				 <li  class="main">
                    <a href="spring_mvc.html">Intro To Spring MVC</a>
                </li>
				 <li>
                    <a href="spring_mvcfilesystem.html">MVC File System</a>
                </li>
				 <li>
                    <a href="spring_mvcbasic.html">MVC Basic Example</a>
                </li>
            </ul>
			
			  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<ul class="home-nav">
                 <li class="home_header orange">
						<a href="java8.html">Java 8</a>
						</li>
						<li>
             <a href="java8.html">Introduction</a> 
                </li>
				<li >
				<a href="java8setup.html">Setup </a>
				</li>
				<li >
				<a href="java8basic.html">Basics of Lambda </a>
				</li>
				<li >
				<a href="java8lifecycle.html">Life Cycle</a>
				</li>
					<li >
				<a href="java8returntype.html">Return Type</a>
				</li>
					<li>
				<a href="java8capture.html">Capturing Satic Variable</a>
				</li>
					<li>
				<a href="java8method.html">Method Refrence</a>
				</li>
				
                <li>
                    <a href="java8parameter.html">Parameter Methods</a>
                </li>
				<li>
				<a href="java8date.html">Date & Time API</a>
				</li>
					<li>
				<a href="java8incoder.html">Incoder & Decoder</a>
				</li>
				<li>
				<a href="java8functional.html">Fuctional Interface</a>
				</li>
				
				
            </ul>
			
			
			
			  <ul class="home-nav">
                 <li class="home_header yellow">
						<a href="jsp.html">JSP</a>
						</li>
              <li class="active_page">
			  <a href="jsp.html">Java Server Pages</a>  
				</li>
				<li >
				
                    <a href="jsp_architecture.html">Architecture</a>
                </li>
                
                <li >
				
                    <a href="jsp_intro.html">Why JSP?</a>
                </li>
                <li >
                    <a href="jsp_advantage.html">Advantages of JSP over Servlet</a>
                </li>
                <li>
                    <a href="jsp_lifecycle.html">Life Cycle of JSP<a>
                </li>
				
              
                <li >
                    <a href="jsp_structure.html">JSP Directory Structure</a>
                </li>
                <li>
                    <a href="jsp_tags.html">Tags used in JSP</a>
                </li>
                <li class="main">
                    <a href="jsp_script.html">Scriptlet Tag</a>
                </li>
				    <li>
                    <a href="jsp_expression.html">Expression Tag </a>
                </li>
				<li>
				 <a href="jsp_declaration.html">Declaration Tag </a>
                </li>
                <li>
                    <a href="jsp_objects.html">JSP Implicit Objects</a>
                </li>
                
            </ul>
                
			
			
			
		 
				 
                 
                <div class="col-sm-12 text-center bottom-separator">
				  
                    <img src="images/home/under.png" class="img-responsive inline" alt="">
                </div>
              
                <div class="col-md-3 col-sm-9">

                </div>
                <div class="col-md-6 col-sm-12">
                    <div class="contact-form bottom">
                        <h2>Send a message</h2>
                        <form id="main-contact-form" name="contact-form" method="post" action="sendemail.php">
                            <div class="form-group">
                                <input type="text" name="name" class="form-control" required="required" placeholder="Name">
                            </div>
                            <div class="form-group">
                                <input type="email" name="email" class="form-control" required="required" placeholder="Email Id">
                            </div>
                            <div class="form-group">
                                <textarea name="message" id="message" required="required" class="form-control" rows="8" placeholder="Your text here"></textarea>
                            </div>                        
                            <div class="form-group">
                                <input type="submit" name="submit" class="btn btn-submit" value="Submit">
                            </div>
                        </form>
                    </div>
                </div>
                <div class="col-sm-12">
                    <div class="copyright-text text-center">
                        <p>&copy; Your Company 2015. All Rights Reserved.</p>
                        <p>Designed by <a target="_blank" href="#">CernSystem Technologies</a></p>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!--/#footer-->

    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/lightbox.min.js"></script>
    <script type="text/javascript" src="js/wow.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>   
</body>
</html>