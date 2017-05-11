<%@ include file="/html/library/init.jsp" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
LMSBook book = (LMSBook) row.getObject();

PortletURL bookViewURL = renderResponse.createRenderURL();
bookViewURL.setWindowState(LiferayWindowState.EXCLUSIVE);
bookViewURL.setParameter("bookId", Long.toString(book.getBookId()));
bookViewURL.setParameter("hideHeader", Boolean.toString(true));
bookViewURL.setParameter("jspPage", LibraryConstants.PAGE_BOOK_VIEW);

PortletURL bookFormURL = renderResponse.createRenderURL();
bookFormURL.setWindowState(LiferayWindowState.NORMAL);
bookFormURL.setParameter("bookId", Long.toString(book.getBookId()));
bookFormURL.setParameter("jspPage", LibraryConstants.PAGE_BOOK_FORM);
bookFormURL.setParameter("backURL", currentURL.toString());

PortletURL deleteBookURL = renderResponse.createActionURL();
deleteBookURL.setWindowState(LiferayWindowState.NORMAL);
deleteBookURL.setParameter(ActionRequest.ACTION_NAME, LibraryConstants.ACTION_DELETE_BOOK);
deleteBookURL.setParameter("bookId", Long.toString(book.getBookId()));
deleteBookURL.setParameter("redirectURL", currentURL.toString());
%>

<liferay-ui:icon-menu>
	<% String bookPopupJS = "javascript:bookList.bookPopup('" + bookViewURL + "');"; %>
	<liferay-ui:icon image="view"   message="View Book"   url="<%=bookPopupJS.toString()%>" />
	<liferay-ui:icon image="edit"   message="Edit Book"   url="<%=bookFormURL.toString()%>" />
	<liferay-ui:icon image="delete" message="Delete Book" url="<%=deleteBookURL.toString()%>" />
</liferay-ui:icon-menu>
