<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html lang="en">
<head>
<meta charset="utf-8">

<title><spring:message code="spring.data.jpa.variation.title"/></title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Stylesheets
================ -->
<link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/docs.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/jquery.autocomplete.css" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Raleway:400,300,800' rel='stylesheet' type='text/css'>

<!-- IE Hack
============ -->
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
<script src="${pageContext.request.contextPath}/static/js/html5shiv.js"></script>
<![endif]-->

<!-- Fav and touch icons
======================== -->
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/static/img/ico/favicon.png">

<!-- Javascripts
================ -->
<script src="${pageContext.request.contextPath}/static/js/custom/toggle.js" ></script>
<script src="${pageContext.request.contextPath}/static/js/custom/search-example.js" ></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.min.js" ></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.autocomplete.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>

<style>
        input {
            font-size: 120%;
        }
</style>


<!-- Google Analytics
===================== -->
<script src="${pageContext.request.contextPath}/static/js/custom/google-analytics.js" ></script>

</head>

<body>

<div id="wrap">

  <jsp:include page="include_header.jsp"/>

  <div class="container">
    <div class="row">
      <div class="span4">
      </div><!-- /.span4 -->

      <div class="span8">

        <jsp:include page="include_navigation_search.jsp"/>

      </div><!-- /."span8" -->
    </div><!-- /.row -->

    <jsp:include page="include_messages.jsp"/>

    <div class="row spacer">
      <div class="span12">

        <h1><spring:message code="spring.data.jpa.variation.search"/></h1>

        <jsp:include page="include_form_search.jsp"/>
      
        <jsp:include page="include_form_upload.jsp"/>

      </div><!-- close span12 -->    
    </div><!-- close row --> 

  </div><!-- /.container -->
</div><!-- /.wrap -->

<jsp:include page="include_footer.jsp"/>

<script>
$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();
});
</script>

</body>
</html>