<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <!-- NAVBAR
    ================================================== -->
  <div class="navbar-wrapper">
    <!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <div id="sm-navbar-logo">
            <div class="visible-phone visible-tablet"><a class="brand" href="http://www.narf.ac.uk/index.html"><img src="${pageContext.request.contextPath}/static/img/navbar/logo-sm.png"></a></div>
          </div>
          <div class="navbar-logo collapse visible-desktop"><a class="brand" href="http://www.narf.ac.uk/index.html"><img src="${pageContext.request.contextPath}/static/img/navbar/narf-logo-wide.png" alt="NARF"></a></div>
          <div class="nav-collapse collapse">
            <ul class="nav pull-right">
              <li><a href="http://www.narf.ac.uk/about/index.html">About NARF</a></li>
              <li><a href="http://www.narf.ac.uk/chickens/index.html">Chickens</a></li>
              <li><a href="http://www.narf.ac.uk/biological-toolbox/index.html">Biological Toolbox</a></li>
              <li><a href="http://www.narf.ac.uk/transgenics/index.html">Transgenics</a></li>
              <li><a href="http://www.narf.ac.uk/genomics/index.html">Genomics</a></li>
              <li><a href="http://www.narf.ac.uk/education/index.html">Education &amp; Events</a></li>
              <li><a href="http://www.narf.ac.uk/about/contact.html">Contact us</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div><!-- /.container -->
      </div><!-- /.navbar-inner -->
    </div> <!-- /.navbar navbar-fixed-top -->
  </div><!-- /.navbar-wrapper -->

  <div id="push"></div>
  <div id="push"></div>
  <div id="push"></div>
    