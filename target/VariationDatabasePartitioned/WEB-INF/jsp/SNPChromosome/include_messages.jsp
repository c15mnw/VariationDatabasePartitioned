<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <c:if test="${feedbackMessage != null}">
      <div class="row spacer">
        <div class="span12">
          <div class="messages alert alert-info"><c:out value="${feedbackMessage}"/></div>
        </div><!-- close span12 -->    
      </div><!-- close row --> 
    </c:if>
    
    <c:if test="${errorMessage != null}">
      <div class="row spacer">
        <div class="span12">
          <div class="messages alert alert-danger"><c:out value="${errorMessage}"/></div>
        </div><!-- close span12 -->    
      </div><!-- close row --> 
    </c:if>
    
