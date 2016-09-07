<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:if test="${SNPChromosome != null && totalPages != 0}">
  <div class="row spacer">
    <div class="span12">
      <table class="table table-bordered table-condensed">
        <thead>

          <c:if test="${dtoDownload.isDownloadSortFieldPosition() || dtoDownload.isDownloadSortFieldNone()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>                
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.position"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.position"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldReference()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>                
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>

              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.reference"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.reference"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldAlternative()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
<br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>

              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.alternative"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.alternative"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/></a>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldRegion()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.region"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.region"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                 <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldEnsemblGene()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.ensemblGene"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.ensemblGene"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldEnsemblTranscript()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/></a>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
              <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=desc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </c:if>
              <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldEnsemblAnnotation()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/></a>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldAminoAcidSubs()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldPredictionCategory()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/></a>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.predictionCategory"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.predictionCategory"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldScoreSift()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/></a>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.scoreSift"/>
                    <br />
                  </a>
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.scoreSift"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldScoreConservation()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/></a>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.scoreConservation"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.scoreConservation"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldProteinAlignNumber()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=desc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.reference"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.reference"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/></a>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldTotalAlignSequenceNumber()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/></a>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreProvean"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
            </tr>
          </c:if>
          
          <c:if test="${dtoDownload.isDownloadSortFieldScoreProvean()}">
            <tr>
              <td>
                <spring:message code="snpchromosome.list.label.chromosomeId"/>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#chromosomeIdentifier" target="_blank" data-toggle="tooltip" data-placement="right" title="Chromosome Id">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.position"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#position" target="_blank" data-toggle="tooltip" data-placement="right" title="Position">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.reference"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#referenceAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Reference Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.alternative"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#alternativeAllele" target="_blank" data-toggle="tooltip" data-placement="right" title="Alternative Allele">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.region"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#region" target="_blank" data-toggle="tooltip" data-placement="right" title="Region">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblGene"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblGeneName" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblTranscript"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblTranscript" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.ensemblAnnotation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#ensemblCodingPredictions" target="_blank" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain7Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain7AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 7 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainPAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain P ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainWAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain W ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainNAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain N ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain15IAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 15I ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainZeroAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain Zero ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strain6Allele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strain6AlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain 6 ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAllele"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainX" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXFixed" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleRatio"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXRatio" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C Ratio">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleAlternativeCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXAlternativeCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C AlternativeCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
                <td>
                  <spring:message code="snpchromosome.list.label.strainCAlleleReferenceCount"/>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#strainXReferenceCount" target="_blank" data-toggle="tooltip" data-placement="right" title="Strain C ReferenceCount">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </td>
              </c:if>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.aminoAcidSubs"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#aminoAcidSubsInfo" target="_blank" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.predictionCategory"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#predictionCategory" target="_blank" data-toggle="tooltip" data-placement="right" title="Prediction Category">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=desc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="DOWN" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.scoreProvean"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
                <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
                  <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                    <spring:message code="snpchromosome.list.label.scoreProvean"/>
                  </a>
                  <br />
                  <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proveanScore" target="_blank" data-toggle="tooltip" data-placement="right" title="PROVEAN Score">
                    <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                  </a>
                </c:if>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreSift"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.scoreConservation"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#siftConsScore" target="_blank" data-toggle="tooltip" data-placement="right" title="SIFT Conservation Score">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.proteinAlignNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#proteinAlignNum" target="_blank" data-toggle="tooltip" data-placement="right" title="Protein Alignment Number">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
              <td>
                <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="UP" height="15" width="15">
                  <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/>
                </a>
                <br />
                <a style="color:#5a5a5a;" href="${pageContext.request.contextPath}/search_results_help#totNumSeqAligned" target="_blank" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned">
                  <img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15">
                </a>
              </td>
            </tr>
          </c:if>
        </thead>
        
        <tbody>
          <c:forEach items="${SNPChromosome}" var="snpchromosome" varStatus="rowStatus">
            <tr>
              <td>
                <c:out value="${snpchromosome.chromosomeId}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.position}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.reference}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.alternative}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getRegionMultiLines()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getEnsemblGeneMultiLines()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getEnsemblTranscriptMultiLines()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getEnsemblAnnotationMultiLines()}"/>
              </td>
              <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td>
                  <c:out value="${snpchromosome.getStrain7Allele()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain7AlleleFixed()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain7AlleleRatio()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain7AlleleAlternativeCount()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain7AlleleReferenceCount()}"/>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td>
                  <c:out value="${snpchromosome.getStrainPAllele()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainPAlleleFixed()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainPAlleleRatio()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainPAlleleAlternativeCount()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainPAlleleReferenceCount()}"/>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td>
                  <c:out value="${snpchromosome.getStrainWAllele()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainWAlleleFixed()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainWAlleleRatio()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainWAlleleAlternativeCount()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainWAlleleReferenceCount()}"/>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td>
                  <c:out value="${snpchromosome.getStrainNAllele()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainNAlleleFixed()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainNAlleleRatio()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainNAlleleAlternativeCount()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainNAlleleReferenceCount()}"/>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td>
                  <c:out value="${snpchromosome.getStrain15IAllele()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain15IAlleleFixed()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain15IAlleleRatio()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain15IAlleleAlternativeCount()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain15IAlleleReferenceCount()}"/>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td>
                  <c:out value="${snpchromosome.getStrainZeroAllele()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainZeroAlleleFixed()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainZeroAlleleRatio()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainZeroAlleleAlternativeCount()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainZeroAlleleReferenceCount()}"/>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td>
                  <c:out value="${snpchromosome.getStrain6Allele()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain6AlleleFixed()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain6AlleleRatio()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain6AlleleAlternativeCount()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrain6AlleleReferenceCount()}"/>
                </td>
              </c:if>
              <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td>
                  <c:out value="${snpchromosome.getStrainCAllele()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainCAlleleFixed()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainCAlleleRatio()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainCAlleleAlternativeCount()}"/>
                </td>
                <td>
                  <c:out value="${snpchromosome.getStrainCAlleleReferenceCount()}"/>
                </td>
              </c:if>
              <td>
                <c:out value="${snpchromosome.getAminoAcidSubs()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getPredictionCategory()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getScoreProvean()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getScoreSift()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getScoreConservation()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getProteinAlignNumber()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getTotalAlignSequenceNumber()}"/>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
    <!-- close span12 -->
  </div>
  <!-- close row spacer -->
</c:if>
