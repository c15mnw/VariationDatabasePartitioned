<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${SNPChromosome != null && totalPages != 0}">

<div class="row">
  <div class="span12">
    <div class="pagination">
        
<c:url var="firstUrl" value="/results/1?chr=${dtoSearch.getSearchChromosomeAsString()}&low=${dtoSearch.searchLowRange}&high=${dtoSearch.searchHighRange}&ref=${dtoSearch.getSearchReferenceAsString()}&alt=${dtoSearch.getSearchAlternativeAsString()}&sortfield=${dtoSearch.getSearchSortFieldAsString()}&sortdir=${dtoSearch.getSearchSortDirectionAsString()}" />
<c:url var="lastUrl" value="/results/${totalPages}?chr=${dtoSearch.getSearchChromosomeAsString()}&low=${dtoSearch.searchLowRange}&high=${dtoSearch.searchHighRange}&ref=${dtoSearch.getSearchReferenceAsString()}&alt=${dtoSearch.getSearchAlternativeAsString()}&sortfield=${dtoSearch.getSearchSortFieldAsString()}&sortdir=${dtoSearch.getSearchSortDirectionAsString()}" />
<c:url var="prevUrl" value="/results/${currentIndex - 1}?chr=${dtoSearch.getSearchChromosomeAsString()}&low=${dtoSearch.searchLowRange}&high=${dtoSearch.searchHighRange}&ref=${dtoSearch.getSearchReferenceAsString()}&alt=${dtoSearch.getSearchAlternativeAsString()}&sortfield=${dtoSearch.getSearchSortFieldAsString()}&sortdir=${dtoSearch.getSearchSortDirectionAsString()}" />
<c:url var="nextUrl" value="/results/${currentIndex + 1}?chr=${dtoSearch.getSearchChromosomeAsString()}&low=${dtoSearch.searchLowRange}&high=${dtoSearch.searchHighRange}&ref=${dtoSearch.getSearchReferenceAsString()}&alt=${dtoSearch.getSearchAlternativeAsString()}&sortfield=${dtoSearch.getSearchSortFieldAsString()}&sortdir=${dtoSearch.getSearchSortDirectionAsString()}" />

<c:if test="${dtoSearch.isSearchSortDirectionAsc()}">
    <c:url var="sortPostionUrl" value="/results/1?chr=${dtoSearch.getSearchChromosomeAsString()}&low=${dtoSearch.searchLowRange}&high=${dtoSearch.searchHighRange}&ref=${dtoSearch.getSearchReferenceAsString()}&alt=${dtoSearch.getSearchAlternativeAsString()}&sortfield=position&sortdir=desc" />
</c:if>
<c:if test="${dtoSearch.isSearchSortDirectionDesc()}">
    <c:url var="sortPostionUrl" value="/results/1?chr=${dtoSearch.getSearchChromosomeAsString()}&low=${dtoSearch.searchLowRange}&high=${dtoSearch.searchHighRange}&ref=${dtoSearch.getSearchReferenceAsString()}&alt=${dtoSearch.getSearchAlternativeAsString()}&sortfield=position&sortdir=asc" />
</c:if>

  <ul>
    <c:choose>
      <c:when test="${currentIndex == 1}">
        <li class="disabled">
          <a href="#">&lt;&lt;</a>
        </li>
        <li class="disabled">
          <a href="#">&lt;</a>
        </li>
      </c:when>
      <c:otherwise>
        <li>
          <a href="${firstUrl}">&lt;&lt;</a>
        </li>
        <li>
          <a href="${prevUrl}">&lt;</a>
        </li>
      </c:otherwise>
    </c:choose>
    <c:forEach var="i" begin="${beginIndex}" end="${endIndex}">
      <c:url var="pageUrl" value="/results/${i}?chr=${dtoSearch.getSearchChromosomeAsString()}&low=${dtoSearch.searchLowRange}&high=${dtoSearch.searchHighRange}&ref=${dtoSearch.getSearchReferenceAsString()}&alt=${dtoSearch.getSearchAlternativeAsString()}&sortfield=${dtoSearch.getSearchSortFieldAsString()}&sortdir=${dtoSearch.getSearchSortDirectionAsString()}" />
      <c:choose>
        <c:when test="${i == currentIndex}">
          <li class="active">
            <a href="${pageUrl}"><c:out value="${i}" /></a>
          </li>
        </c:when>
        <c:otherwise>
          <li>
            <a href="${pageUrl}"><c:out value="${i}" /></a>
          </li>
        </c:otherwise>
      </c:choose>
    </c:forEach>
    <c:choose>
      <c:when test="${currentIndex == totalPages}">
        <li class="disabled">
          <a href="#">&gt;</a>
        </li>
        <li class="disabled">
          <a href="#">&gt;&gt;</a>
        </li>
      </c:when>
      <c:otherwise>
        <li>
          <a href="${nextUrl}">&gt;</a>
        </li>
        <li>
          <a href="${lastUrl}">&gt;&gt;</a>
        </li>
      </c:otherwise>
    </c:choose>
  </ul>
    
    </div><!-- /.pagination -->
  </div><!-- /.span12 -->
</div><!-- /.row spacer -->

</c:if>
