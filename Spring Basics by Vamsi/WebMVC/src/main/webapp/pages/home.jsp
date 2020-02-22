<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<section>
	<h1>JSP Page</h1>
	<h2>${pageTitle }</h2>
	<h2>developers</h2>
	<ol>
		<c:forEach var="d" items="${developers }">
			<li>${d }</li>
			</c:forEach>
	</ol>
</section>
