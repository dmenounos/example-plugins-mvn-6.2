<%@ include file="/html/init.jsp" %>

<%-- We pass up the componentId as a parameter to the urls that will render with ajax. --%>
<%-- This componentId will have to be passed down as an attribute from the controller. --%>

<%-- Single request direct render url with ajax. --%>
<portlet:renderURL var="bookListURL" windowState="${windowStateNormal}">
	<portlet:param name="jspPage" value="<%=LibraryConstants.PAGE_BOOK_LIST%>" />
	<portlet:param name="componentId" value="${componentId}" />
</portlet:renderURL>

<%-- Single request direct render url with ajax. --%>
<portlet:actionURL var="searchBooksURL" name="<%=LibraryConstants.ACTION_SEARCH_BOOKS%>" windowState="${windowStateNormal}">
	<portlet:param name="jspPage" value="<%=LibraryConstants.PAGE_BOOK_LIST%>" />
	<portlet:param name="componentId" value="${componentId}" />
</portlet:actionURL>

<%-- Multi request indirect render url with ajax. --%>
<portlet:actionURL var="deleteBooksURL" name="<%=LibraryConstants.ACTION_DELETE_BOOKS%>" windowState="${windowStateNormal}">
	<portlet:param name="redirectURL" value="<%=bookListURL.toString()%>" />
</portlet:actionURL>

<%-- Multi request indirect render url without ajax. --%>
<portlet:renderURL var="bookFormURL" windowState="${windowStateNormal}">
	<portlet:param name="jspPage" value="<%=LibraryConstants.PAGE_BOOK_FORM%>" />
	<portlet:param name="backURL" value="<%=currentURL.toString()%>" />
</portlet:renderURL>

<%-- We set the componentId to root element. --%>

<div id="${componentId}" class="book-list">

	<aui:button-row cssClass="action-buttons">
		<aui:button value="create-book" href="${bookFormURL}" cssClass="create-book-button" />
		<c:if test="${not empty searchResults}">
			<aui:button value="delete-books" disabled="true" cssClass="delete-books-button disabled" />
		</c:if>
		<form name="searchForm" action="${searchBooksURL}" method="post" class="search-form">
			<aui:input label="" placeholder="search-term" name="searchTerm" value="${searchTerm}" />
			<aui:button type="submit" value="Search" cssClass="search-form-button" />
		</form>
	</aui:button-row>

	<form name="searchResultsForm" action="${deleteBooksURL}" method="post">
		<aui:input name="bookIds" type="hidden" />

		<liferay-ui:search-container delta="50" iteratorURL="${currentURL}" 
			orderByCol="${orderByCol}" orderByType="${orderByType}" 
			rowChecker="<%=new RowChecker(renderResponse)%>" 
			emptyResultsMessage="Sorry. There are no items to display.">

			<%
			List<LMSBook> searchResults = (List<LMSBook>) renderRequest.getAttribute(LibraryConstants.SEARCH_RESULTS_ATTR);
			searchResults = ListUtil.subList(searchResults, searchContainer.getStart(), searchContainer.getEnd());
			renderRequest.setAttribute(LibraryConstants.SEARCH_RESULTS_ATTR, searchResults);
			%>

			<liferay-ui:search-container-results results="${searchResults}" total="${searchResultsTotal}" />

			<liferay-ui:search-container-row modelVar="book" className="LMSBook" keyProperty="bookId">

				<portlet:renderURL var="bookViewURL">
					<portlet:param name="jspPage" value="<%=LibraryConstants.PAGE_BOOK_VIEW%>" />
					<portlet:param name="backURL" value="<%=currentURL.toString()%>" />
					<portlet:param name="bookId"  value="<%=Long.toString(book.getBookId())%>" />
				</portlet:renderURL>

				<liferay-ui:search-container-column-text name="Book Title" property="bookTitle" href="<%=bookViewURL.toString()%>" 
					orderable="true" orderableProperty="bookTitle" />

				<liferay-ui:search-container-column-text name="Author" property="author" 
					orderable="true" orderableProperty="author" />

				<liferay-ui:search-container-column-text name="Date Added">
					<fmt:formatDate value="<%=book.getCreateDate()%>" pattern="dd/MMM/yyyy" />
				</liferay-ui:search-container-column-text>

				<liferay-ui:search-container-column-jsp name="Actions" path="<%=LibraryConstants.PAGE_BOOK_LIST_ACTIONS%>" />

			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
		</liferay-ui:search-container>
	</form>

	<script>
	$(function() {
		bookList = new BookList({
			ns: '${ns}',
			componentId: '${componentId}',
			'confirm-delete-selected-books' : '<%=UnicodeLanguageUtil.get(pageContext, "confirm-delete-selected-books")%>'
		});
	});
	</script>

</div>
