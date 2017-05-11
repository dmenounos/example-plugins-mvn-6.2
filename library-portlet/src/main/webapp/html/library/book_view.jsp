<%@ include file="/html/library/init.jsp" %>

<c:if test="${not param.hideHeader}">
	<liferay-ui:header title="Book Details" 
		 backLabel="Back to List" backURL="${param.backURL}" />
</c:if>

<c:if test="${not empty book}">
	<table border="1">
		<tr>
			<td>Book Title</td>
			<td>${book.bookTitle}</td>
		</tr>
		<tr>
			<td>Author</td>
			<td>${book.author}</td>
		</tr>
		<tr>
			<td>Date Added</td>
			<td>${book.createDate}</td>
		</tr>
		<tr>
			<td>Last Modified</td>
			<td>${book.modifiedDate}</td>
		</tr>
	</table>
</c:if>
