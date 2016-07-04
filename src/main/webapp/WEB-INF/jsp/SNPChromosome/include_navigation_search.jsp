<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

      <ul class="breadcrumb">
        <li>
          <a href="http://www.narf.ac.uk/index.html">
            <spring:message code="snpchromosome.list.link.home"/>
          </a>
          <span class="divider">/</span>
        </li>
        <li>
          <a href="http://www.narf.ac.uk/genomics/index.html">
            <spring:message code="snpchromosome.list.link.genomics"/>
          </a>
          <span class="divider">/</span>
        </li>
        <li>
          <a href="http://www.narf.ac.uk/genomics/variation-database.html">
            <spring:message code="snpchromosome.list.link.variation"/>
          </a>
          <span class="divider">/</span>
        </li>
        <li class="active">
          <spring:message code="snpchromosome.list.link.search"/>
          <span class="divider">/</span>
        </li>
        <li>
          <a href="${pageContext.request.contextPath}/search_help" target="_blank">
            <spring:message code="snpchromosome.list.link.variation.search_help"/>
          </a>
        </li>
      </ul>
