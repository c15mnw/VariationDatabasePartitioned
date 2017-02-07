<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form action="${pageContext.request.contextPath}/upload" commandName="dtoSearch" enctype="multipart/form-data" method="POST">
 
    <fieldset>
    
        <legend><spring:message code="snpchromosome.upload.form.legend"/></legend>

        <input type="button" value="Show/Hide Upload Options" name="no" onclick="toggle_visibility('filterform2')">

        <br />

        <div id="filterform2" style="display: none;">

        <div class="row">
            <div class="span4">

                <div>
        <h3><spring:message code="snpchromosome.upload.form.subtitle0"/></h3>
                </div><!-- close spacer --> 
                
            </div><!-- close span4 --> 
            <div class="span4">

                <div>
                </div> 
        
            </div><!-- close span4 --> 
            <div class="span4">

                <div>
                </div><!-- close spacer --> 
        
            </div><!-- close span4 -->
        </div><!-- close row -->

        <div class="row">
            <div class="span4">

                <div>
            <form:label path="searchUploadFile"><spring:message code="snpchromosome.search.upload.label"/>
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_help#searchUploadFile" target="_blank" data-toggle="tooltip" data-placement="right" title="Search Upload File">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
            </form:label>
            
            <form:input class="input-large" path="searchUploadFile" name="searchUploadFile" type="file"/>
                </div><!-- close spacer --> 
                
            </div><!-- close span4 --> 
            <div class="span4">

            </div><!-- close span4 --> 
            <div class="span4">

            </div><!-- close span4 -->
        </div><!-- close row -->
        
        <div class="row spacer">
            <div class="span12">
                <input type="submit" value="<spring:message code="snpchromosome.search.upload.submit.label"/>"/>
            </div><!-- close span12 -->
        
        </div><!-- close row spacer -->

        </div><!-- close filterform2 -->
        
    </fieldset>
    
</form:form>

