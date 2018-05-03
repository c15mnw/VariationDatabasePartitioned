<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:if test="${SNPChromosome != null && totalPages != 0}">
  <div class="row spacer">
    <div class="span12">
 
       <table id="snps" class="display" cellspacing="0" width="100%">

        <thead>

            <tr>
              <th><spring:message code="snpchromosome.list.label.chromosomeId"/></th>
              <th><spring:message code="snpchromosome.list.label.position"/></th>
              <th><spring:message code="snpchromosome.list.label.reference"/></th>
              <th><spring:message code="snpchromosome.list.label.alternative"/></th>
              <th><spring:message code="snpchromosome.list.label.region"/></th>
              <th><spring:message code="snpchromosome.list.label.ensemblGene"/></th>
              <th><spring:message code="snpchromosome.list.label.ensemblTranscript"/></th>
              <th><spring:message code="snpchromosome.list.label.ensemblAnnotation"/></th>
              
              <c:if test="${dtoDownload.isSearchReference7()}">
                <th><spring:message code="snpchromosome.list.label.strain7Allele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceP()}">
                <th><spring:message code="snpchromosome.list.label.strainPAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceW()}">
                <th><spring:message code="snpchromosome.list.label.strainWAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceN()}">
                <th><spring:message code="snpchromosome.list.label.strainNAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReference15I()}">
                <th><spring:message code="snpchromosome.list.label.strain15IAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceZero()}">
                <th><spring:message code="snpchromosome.list.label.strainZeroAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReference6()}">
                <th><spring:message code="snpchromosome.list.label.strain6Allele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceC()}">
                <th><spring:message code="snpchromosome.list.label.strainCAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/></th>
              </c:if>

              <c:if test="${dtoDownload.isSearchAlternative7()}">
                <th><spring:message code="snpchromosome.list.label.strain7Allele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeP()}">
                <th><spring:message code="snpchromosome.list.label.strainPAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeW()}">
                <th><spring:message code="snpchromosome.list.label.strainWAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeN()}">
                <th><spring:message code="snpchromosome.list.label.strainNAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternative15I()}">
                <th><spring:message code="snpchromosome.list.label.strain15IAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeZero()}">
                <th><spring:message code="snpchromosome.list.label.strainZeroAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternative6()}">
                <th><spring:message code="snpchromosome.list.label.strain6Allele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeC()}">
                <th><spring:message code="snpchromosome.list.label.strainCAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/></th>
              </c:if>

              <th><spring:message code="snpchromosome.list.label.aminoAcidSubs"/></th>
              <th><spring:message code="snpchromosome.list.label.predictionCategory"/></th>
              <th><spring:message code="snpchromosome.list.label.scoreProvean"/></th>
              <th><spring:message code="snpchromosome.list.label.scoreSift"/></th>
              <th><spring:message code="snpchromosome.list.label.scoreConservation"/></th>
              <th><spring:message code="snpchromosome.list.label.proteinAlignNumber"/></th>
              <th><spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/></th>
            </tr>

        </thead>

        <tfoot>

            <tr>
              <th><spring:message code="snpchromosome.list.label.chromosomeId"/></th>
              <th><spring:message code="snpchromosome.list.label.position"/></th>
              <th><spring:message code="snpchromosome.list.label.reference"/></th>
              <th><spring:message code="snpchromosome.list.label.alternative"/></th>
              <th><spring:message code="snpchromosome.list.label.region"/></th>
              <th><spring:message code="snpchromosome.list.label.ensemblGene"/></th>
              <th><spring:message code="snpchromosome.list.label.ensemblTranscript"/></th>
              <th><spring:message code="snpchromosome.list.label.ensemblAnnotation"/></th>
              
              <c:if test="${dtoDownload.isSearchReference7()}">
                <th><spring:message code="snpchromosome.list.label.strain7Allele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceP()}">
                <th><spring:message code="snpchromosome.list.label.strainPAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceW()}">
                <th><spring:message code="snpchromosome.list.label.strainWAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceN()}">
                <th><spring:message code="snpchromosome.list.label.strainNAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReference15I()}">
                <th><spring:message code="snpchromosome.list.label.strain15IAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceZero()}">
                <th><spring:message code="snpchromosome.list.label.strainZeroAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReference6()}">
                <th><spring:message code="snpchromosome.list.label.strain6Allele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceC()}">
                <th><spring:message code="snpchromosome.list.label.strainCAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/></th>
              </c:if>

              <c:if test="${dtoDownload.isSearchAlternative7()}">
                <th><spring:message code="snpchromosome.list.label.strain7Allele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeP()}">
                <th><spring:message code="snpchromosome.list.label.strainPAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeW()}">
                <th><spring:message code="snpchromosome.list.label.strainWAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeN()}">
                <th><spring:message code="snpchromosome.list.label.strainNAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternative15I()}">
                <th><spring:message code="snpchromosome.list.label.strain15IAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeZero()}">
                <th><spring:message code="snpchromosome.list.label.strainZeroAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternative6()}">
                <th><spring:message code="snpchromosome.list.label.strain6Allele"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/></th>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeC()}">
                <th><spring:message code="snpchromosome.list.label.strainCAllele"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleFixed"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleRatio"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/></th>
                <th><spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/></th>
              </c:if>

              <th><spring:message code="snpchromosome.list.label.aminoAcidSubs"/></th>
              <th><spring:message code="snpchromosome.list.label.predictionCategory"/></th>
              <th><spring:message code="snpchromosome.list.label.scoreProvean"/></th>
              <th><spring:message code="snpchromosome.list.label.scoreSift"/></th>
              <th><spring:message code="snpchromosome.list.label.scoreConservation"/></th>
              <th><spring:message code="snpchromosome.list.label.proteinAlignNumber"/></th>
              <th><spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/></th>
            </tr>

        </tfoot>

        <tbody>
        
          <c:forEach items="${SNPChromosome}" var="snpchromosome" varStatus="rowStatus">
        
            <tr>
        
              <td><c:out value="${snpchromosome.chromosomeId}"/></td>
              <td><c:out value="${snpchromosome.position}"/></td>
              <td><c:out value="${snpchromosome.reference}"/></td>
              <td><c:out value="${snpchromosome.alternative}"/></td>
              <td><c:out value="${snpchromosome.getRegionMultiLines()}"/></td>
              <td><c:out value="${snpchromosome.getEnsemblGeneMultiLines()}"/></td>
              <td><c:out value="${snpchromosome.getEnsemblTranscriptMultiLines()}"/></td>
              <td><c:out value="${snpchromosome.getEnsemblAnnotationMultiLines()}"/></td>
              
              <c:if test="${dtoDownload.isSearchReference7()}">
                <td><c:out value="${snpchromosome.getStrain7Allele()}"/></td>
                <td><c:out value="${snpchromosome.getStrain7AlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrain7AlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrain7AlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrain7AlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceP()}">
                <td><c:out value="${snpchromosome.getStrainPAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainPAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrainPAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrainPAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrainPAlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceW()}">
                <td><c:out value="${snpchromosome.getStrainWAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainWAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrainWAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrainWAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrainWAlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceN()}">
                <td><c:out value="${snpchromosome.getStrainNAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainNAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrainNAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrainNAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrainNAlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReference15I()}">
                <td><c:out value="${snpchromosome.getStrain15IAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrain15IAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrain15IAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrain15IAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrain15IAlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceZero()}">
                <td><c:out value="${snpchromosome.getStrainZeroAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainZeroAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrainZeroAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrainZeroAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrainZeroAlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReference6()}">
                <td><c:out value="${snpchromosome.getStrain6Allele()}"/></td>
                <td><c:out value="${snpchromosome.getStrain6AlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrain6AlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrain6AlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrain6AlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchReferenceC()}">
                <td><c:out value="${snpchromosome.getStrainCAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainCAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrainCAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrainCAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrainCAlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternative7()}">
                <td><c:out value="${snpchromosome.getStrain7Allele()}"/></td>
                <td><c:out value="${snpchromosome.getStrain7AlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrain7AlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrain7AlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrain7AlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeP()}">
                <td><c:out value="${snpchromosome.getStrainPAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainPAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrainPAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrainPAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrainPAlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeW()}">
                <td><c:out value="${snpchromosome.getStrainWAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainWAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrainWAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrainWAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrainWAlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeN()}">
                <td><c:out value="${snpchromosome.getStrainNAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainNAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrainNAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrainNAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrainNAlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternative15I()}">
                <td><c:out value="${snpchromosome.getStrain15IAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrain15IAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrain15IAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrain15IAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrain15IAlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeZero()}">
                <td><c:out value="${snpchromosome.getStrainZeroAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainZeroAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrainZeroAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrainZeroAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrainZeroAlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternative6()}">
                <td><c:out value="${snpchromosome.getStrain6Allele()}"/></td>
                <td><c:out value="${snpchromosome.getStrain6AlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrain6AlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrain6AlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrain6AlleleReferenceCount()}"/></td>
              </c:if>
              
              <c:if test="${dtoDownload.isSearchAlternativeC()}">
                <td><c:out value="${snpchromosome.getStrainCAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainCAlleleFixed()}"/></td>
                <td><c:out value="${snpchromosome.getStrainCAlleleRatio()}"/></td>
                <td><c:out value="${snpchromosome.getStrainCAlleleAlternativeCount()}"/></td>
                <td><c:out value="${snpchromosome.getStrainCAlleleReferenceCount()}"/></td>
              </c:if>
              
              <td><c:out value="${snpchromosome.getAminoAcidSubs()}"/></td>
              <td><c:out value="${snpchromosome.getPredictionCategory()}"/></td>
              <td><c:out value="${snpchromosome.getScoreProvean()}"/></td>
              <td><c:out value="${snpchromosome.getScoreSift()}"/></td>
              <td><c:out value="${snpchromosome.getScoreConservation()}"/></td>
              <td><c:out value="${snpchromosome.getProteinAlignNumber()}"/></td>
              <td><c:out value="${snpchromosome.getTotalAlignSequenceNumber()}"/></td>
              
            </tr>
            
          </c:forEach>
          
        </tbody>
        
      </table>
    
       
    </div>
    <!-- close span12 -->
  </div>
  <!-- close row spacer -->
</c:if>
