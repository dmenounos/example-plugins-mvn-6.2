<%@ include file="/html/init.jsp" %>

<h1>Add / Edit Form</h1>

<portlet:actionURL var="updateBookURL" name="<%=LibraryConstants.ACTION_UPDATE_BOOK%>">
	<portlet:param name="redirectURL" value="${param.backURL}" />
</portlet:actionURL>

<aui:form name="fm" method="post" action="${updateBookURL}">
	<aui:input name="bookId" type="hidden" value="${book.bookId}" />
	<aui:input label="book-title" name="bookTitle" value="${book.bookTitle}">
		<aui:validator name="required" errorMessage="The book title is required." />
	</aui:input>
	<aui:input label="book-author" name="author" value="${book.author}" />
	<aui:button type="submit" value="Save" />
</aui:form>

<a href="${param.backURL}">Go Back</a>

<script>
Liferay.Util.focusFormField(document['${ns}fm']['${ns}bookTitle']);
</script>
