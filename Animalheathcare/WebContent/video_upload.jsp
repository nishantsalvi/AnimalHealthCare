
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title> Animal Health Care</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="http://animalhealthcare.com/wp-content/themes/animalhealthcare/images/favicon.ico" rel="shortcut icon" type="image/x-icon"/>
<link href='http://fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'>
<link href="http://animalhealthcare.com/wp-content/themes/animalhealthcare/css/menu.css" rel="stylesheet" type="text/css" media="screen" />
<link href="http://animalhealthcare.com/wp-content/themes/animalhealthcare/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="http://animalhealthcare.com/wp-content/themes/animalhealthcare/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="http://animalhealthcare.com/wp-content/themes/animalhealthcare/js/modal_script.js"></script>

</style></head>
<body>


<%

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expire", "0");

if(session.getAttribute("email")==null){
	response.sendRedirect("login.jsp");
}
%>


<div id="header">
	<div class="wrapper">
    	<div id="logo"><a href="http://animalhealthcare.com"></a></div>
        <div id="contact_details">
        	<span>Phone: 123 4560 789</span>
            <span>Email: <a href="mailto:contact@animalhealthcare.com">Shraddhesh123@animalcare.com</a></span>
            <div id="socal-box">0
            	<span>Follow Us:</span>
                <a href="https://www.facebook.com" target="_blank"><img src="http://animalhealthcare.com/wp-content/themes/animalhealthcare/images/facebook.png" alt="facebook" /></a>
                <a href="https://www.twitter.com"><img src="http://animalhealthcare.com/wp-content/themes/animalhealthcare/images/twitter.png" alt="twitter" /></a>
                <a href="https://www.google.com" target="_blank"><img src="http://animalhealthcare.com/wp-content/themes/animalhealthcare/images/googleplus.png" alt="googleplus" /></a>
                <a href="https://www.instagram.com" target="_blank"><img src="http://animalhealthcare.com/wp-content/themes/animalhealthcare/images/instagram.png" alt="instagram" /></a>
                <a href="https://www.youtube.com" target="_blank"><img src="http://animalhealthcare.com/wp-content/themes/animalhealthcare/images/youtube.png" alt="youtube" /></a>
               <div class="clear"></div>
            </div>
        </div>
        <div class="clear"></div>
    </div>
    <div id="menu_wrapper">
        <div id="menu">
            <ul id="menu-main-menu" class="menu"><li id="menu-item-10" class="sm3 menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-21">
            <a href="home.jsp">Home</a></li>
            
				
<li id="menu-item-54" class="sm2 menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-54"><a href="aboutus.jsp">About Us</a>

</li>
<li id="menu-item-21" class="sm4 menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-56"><a href="#services">Services</a>
<ul class="sub-menu">
	<li id="menu-item-24" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-24"><a href="medical_care.jsp">Medical Care</a></li>
	<li id="menu-item-23" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-23"><a href="surgical_care.jsp">Surgical Care</a></li>
</ul>
</li>
<li id="menu-item-56" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-2 current_page_item menu-item-10""><a href="#pethealth">Pet Health</a>
<ul class="sub-menu">
	<li id="menu-item-208" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-208"><a href="article.jsp">Articles</a></li>
	<li id="menu-item-81" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-81"><a href="video.jsp">Video</a></li>
</ul>
</li><li id="menu-item-55" class="sm2 menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-54">
				<a href="#home1"><img src="img/user2.png" alt="Login" ></img></a>
					
				</li>
</ul></div>            <div class="clear"></div>
        </div>
    </div>
  
<div id="main_slider_box">
<img src="http://animalhealthcare.com/wp-content/themes/animalhealthcare/images/slide1.jpg" alt="slide" />
</div>
<div id="main">	<div id="content">
        	<div class="postbox">
			<div class="col_lft">
			<h1>Video</h1>
			 <form method="post" action="upload" >
            File:
            <input type="file" name="file" id="file" /> <br/>
            </br>
            <input type="submit" value="Upload" name="upload" id="upload" />
        </form>
			
			
			
			
			<div class="clear"></div>
			
			</div> <div class="clear"></div>
        </div>
	    </div>
      <div class="clear separator"></div>
    <div id="bottom_boxes">
		<div class="box"><div class="bb_title">Services</div>			<div class="textwidget"><ul>
<li><a href="medical_care.jsp">Medical Care</a></li>
<li><a href="surgical_care.jsp">Surgical Care</a></li>
<li><a href="emergency_care.jsp">Emergency Care</a></li>
</ul></div>
		
		</div><div class="box"><div class="bb_title">Pet Health</div>			<div class="textwidget"><ul>
<li><a href="article.jsp">Articles</a></li>
<li><a href="video.jsp">Videos</a></li>
</ul></div>
		</div>    	<div class="box last">
            <div class="big_btns last"><a href="review.jsp">Leave a Review</a></div>
        </div>
        <div class="clear"></div>
    </div>
</div>
<script type='text/javascript' src='http://animalhealthcare.com/wp-content/plugins/contact-form-7/includes/js/jquery.form.min.js?ver=3.46.0-2013.11.21'></script>
<script type='text/javascript'>
/* <![CDATA[ */
var _wpcf7 = {"loaderUrl":"http:\/\/animalhealthcare.com\/wp-content\/plugins\/contact-form-7\/images\/ajax-loader.gif","sending":"Sending ..."};
/* ]]> */
</script>
<script type='text/javascript' src='http://animalhealthcare.com/wp-content/plugins/contact-form-7/includes/js/scripts.js?ver=3.6'></script>
<script type='text/javascript' src='http://animalhealthcare.com/wp-includes/js/wp-embed.min.js?ver=5.0.10'></script>


<!-- Shortcodes Ultimate custom CSS - begin -->
<style type='text/css'>
.su-column-size-1-2 {
    width: 46%;
}
</style>
<!-- Shortcodes Ultimate custom CSS - end -->

</body>
</html>