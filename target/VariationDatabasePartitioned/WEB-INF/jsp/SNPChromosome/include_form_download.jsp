<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:if test="${SNPChromosome != null && totalPages != 0}">

<div class="row">
    <div class="span12">

<form:form action="${pageContext.request.contextPath}/download" commandName="dtoDownload" method="POST">

    <fieldset>
    
        <form:hidden path="searchChromosome" />
        <form:hidden path="searchLowRange" />
        <form:hidden path="searchHighRange" />
        <form:hidden path="searchReference" />
        <form:hidden path="searchAlternative" />
        <form:hidden path="searchUploadFileName" />

        <input type="button" value="Show/Hide Download Options" name="no" onclick="toggle_visibility('downloadform1')">
        
        <br />
        <hr>
        
        <div id="downloadform1" style="display: none;">
        
        <div class="row">
            <div class="span6">
            
            <form:label path="DownloadFormat"><h4><spring:message code="snpchromosome.download.format.label"/></h4></form:label>
                <div class="row-fluid">
                    <div class="span8">
            
            <form:label path="DownloadFormat"><spring:message code="DownloadFormat.FORMAT_CSV"/></form:label>
            
                    </div><!-- close span8 -->
                    <div class="span4">
            
            <form:radiobutton path="DownloadFormat" value="FORMAT_CSV"/>
            
                    </div><!-- close span4 -->
                    <div class="row-fluid">
                        <div class="span8">
            
            <form:label path="DownloadFormat"><spring:message code="DownloadFormat.FORMAT_TSV"/></form:label>
            
                        </div><!-- close span8 -->
                        <div class="span4">
            
            <form:radiobutton path="DownloadFormat" value="FORMAT_TSV"/>
            
                        </div><!-- close span4 -->
                    </div><!-- close row-fluid -->
                    <div class="row-fluid">
                        <div class="span8">
            
            <form:label path="DownloadFormat"><spring:message code="DownloadFormat.FORMAT_VCF"/></form:label>
            
                        </div><!-- close span8 -->
                        <div class="span4">
            
            <form:radiobutton path="DownloadFormat" value="FORMAT_VCF"/>
            
                        </div><!-- close span4 -->
                    </div><!-- close row-fluid -->
                </div><!-- close row-fluid -->
            </div><!-- close span6 -->
            
            <div class="span6">
            
            <form:label path="DownloadQuotes"><h4><spring:message code="snpchromosome.download.quotes.label"/></h4></form:label>
            
                <div class="row-fluid">
                    <div class="span8">
            
            <form:label path="DownloadQuotes"><spring:message code="DownloadQuotes.QUOTES_YES"/></form:label>
            
                    </div><!-- close span8 -->
                    <div class="span4">
            
            <form:radiobutton path="DownloadQuotes" value="QUOTES_YES"/>
            
                    </div><!-- close span4 -->
                    <div class="row-fluid">
                        <div class="span8">
            
            <form:label path="DownloadQuotes"><spring:message code="DownloadQuotes.QUOTES_NO"/></form:label>
            
                        </div><!-- close span8 -->
                        <div class="span4">
            
            <form:radiobutton path="DownloadQuotes" value="QUOTES_NO"/>
            
                        </div><!-- close span4 -->
                    </div><!-- close row-fluid -->
                </div><!-- close row-fluid -->
            </div><!-- close span6 -->
        </div><!-- close row -->
        
        <div class="row">
            <div class="span6">
            
            <form:label path="DownloadHeaders"><h4><spring:message code="snpchromosome.download.headers.label"/></h4></form:label>
                <div class="row-fluid">
                    <div class="span8">
            
            <form:label path="DownloadHeaders"><spring:message code="DownloadHeaders.HEADERS_YES"/></form:label>
            
                    </div><!-- close span8 -->
                    <div class="span4">
            
            <form:radiobutton path="DownloadHeaders" value="HEADERS_YES"/>
            
                    </div><!-- close span4 -->
                    <div class="row-fluid">
                        <div class="span8">
            
            <form:label path="DownloadHeaders"><spring:message code="DownloadHeaders.HEADERS_NO"/></form:label>
            
                        </div><!-- close span8 -->
                        <div class="span4">
            
            <form:radiobutton path="DownloadHeaders" value="HEADERS_NO"/>
            
                        </div><!-- close span4 -->
                    </div><!-- close row-fluid -->
                </div><!-- close row-fluid -->
            </div><!-- close span6 -->
            
            <div class="span6">
            
                <div class="row-fluid">
                    <div class="span8">
            
                    </div><!-- close span8 -->
                    <div class="span4">
            
                    </div><!-- close span4 -->
                    <div class="row-fluid">
                        <div class="span8">
            
                        </div><!-- close span8 -->
                        <div class="span4">
            
                        </div><!-- close span4 -->
                    </div><!-- close row-fluid -->
                </div><!-- close row-fluid -->
            </div><!-- close span6 -->
  
        </div><!-- close row -->

        <div class="row">
            <div class="span12">
                <input type="submit" value="<spring:message code="snpchromosome.download.form.submit.label"/>"/>
            </div><!-- close span12 -->
        </div><!-- close row spacer -->
        
        <hr>
        
        </div><!-- close downloadform1 -->
        
    </fieldset>
    
</form:form>

    </div><!-- close span12 -->

</div><!-- close row spacer -->

</c:if>
