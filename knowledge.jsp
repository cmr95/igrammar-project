<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="well" uri="/WEB-INF/tag/my-taglib.tld"%>

<c:if test="${empty chapterList }">
	<c:set var="chapterList" value="${well:getChapterList() }"
		scope="application"></c:set>
</c:if>

<c:set var="KNOW_PAGE" value="/personal/knowledge.jsp"></c:set>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Knowledge content</title>
<link rel="stylesheet" href="../css/bootstrap-theme.css" type="text/css"></link>
<link rel="stylesheet" href="../css/bootstrap.css" type="text/css"></link>
</head>
<body>
	<nav class="navbar navbar-inverse" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">iGrammar</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-9">
				<ul class="nav navbar-nav">
					<li><a href="/eLearning/personal/userhome.jsp">学习中心</a>
					</li>
					<li class="active"><a href="/eLearning/personal/knowledge.jsp">知识体系</a>
					</li>
					<li><a href="#">个人测评</a>
					</li>
					<li><a href="#">资料大全</a>
					</li>
					<li><a href="#">个人中心</a>
					</li>
				</ul>
			</div>
		</div>
	</nav><!-- header -->
	
	<div class="container"><!-- content-body-start -->
		<div class="container bs-docs-container col-md-2">
			<h4>语法点目录</h4>
			<div class="bs_sidebar hidden-print" role="complementary">
					<ul class="nav bs-sidenav">
						<c:forEach var="ch" items="${chapterList}">
							<c:url value="${KNOW_PAGE }" var="localURL">
								<c:param name="cid" value="${ch.chapterNum}" />
							</c:url>
							<li><a href="${localURL}">${ch.chapterLabel}:${ch.chapterTitle}</a>
							</li>
						</c:forEach>
					</ul>
			</div><!-- bs_sidebar -->
		</div><!--left: chapter list -->
		
		<div class="container bs-docs-container col-md-7">
			<div class="row"><!-- section-list-start -->
				<table class="table table-hover">
						<tr>
							<th>#</th>
							<th>Section</th>
						</tr>
							<c:set var="selectedChap" value="${param.cid }" />
							<c:if test="${empty selectedChap }">
								<c:set var="selectedChap" value="ch01" />
							</c:if>
								
							<c:forEach var="curItem" items="${well:getSections(selectedChap) }">
								<c:url value="${KNOW_PAGE}" var="localURL">
									<c:param name="cid" value="${selectedChap}"></c:param>
									<c:param name="sid" value="${curItem.sectionNum}"></c:param>
								</c:url>
							<tr>
								<td>${curItem.sectionNum}</td>
								<td><a href="${localURL}">${curItem.sectionLabel}</a></td>
							</tr>
							
							
							
							</c:forEach>
				</table>
			</div><!-- section-list-end -->
			<div class="row"><!-- section-content-start -->
			
			<p>点击知识点进入相应习题练习</p>
			
			<table class="table table-hover">
						<tr>
							<th>#</th>
							<th>Points</th>
						</tr>
							<c:set var="selectedSec" value="${param.sid }"></c:set>
							<c:if test="${empty selectedSec }">
								<c:set var="selectedSec" value="sec0101" />
							</c:if>
								
							<c:forEach var="curItem" items="${well:getKnowledgePoints(selectedSec)}">
								<c:url value="${KNOW_PAGE}" var="localURL">
									<c:param name="kid" value="${curItem.knowledgeNum}"></c:param>
								</c:url>
							<tr>
								<td>${curItem.knowledgeNum}</td>
								<td><a href="${localURL}">${curItem.knowledgeLabel}</a></td>
							</tr>
							
							</c:forEach>
				</table>
				
				<table class="table table-hover">
						<tr>
							<th>#</th>
							<th>Detail</th>
						</tr>
							<c:set var="selectedKnowledgePoint" value="${param.kid }"></c:set>
							<c:if test="${empty selectedKnowledgePoint }">
								<c:set var="selectedKnowledgePoint" value="k010101" />
							</c:if>
								
							<c:forEach var="detailItem" items="${well:getDetail(selectedKnowledgePoint)}">
								<c:url value="${KNOW_PAGE}" var="localURL">
									<c:param name="did" value="${detailItem.detailNum}"></c:param>
								</c:url>
							<tr>
								<td>${detailItem.detailNum}</td>
								<td><a href="${localURL}">${detailItem.detailLabel}</a></td>
							</tr>
							<c:forEach var="egItem" items="${detailItem.detailEg}">
							    <tr>
								<td>例句： </td>
								<td><a href="${localURL}">${egItem}</a></td>
							    </tr>
							</c:forEach>
							
							</c:forEach>
				</table>
			</div><!-- section-content-end -->
		</div><!--right: section list AND content  -->
		
		
		
	</div><!-- content-body-end -->
	
	<div>
		FOOTER
	</div><!-- footer -->
</body>
</html>
