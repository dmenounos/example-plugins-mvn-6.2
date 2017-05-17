<%@ include file="/html/test-ckeditor/init.jsp" %>

<portlet:actionURL var="submitPageURL" name="<%=TestCKEditorConstants.ACTION_SUBMIT_PAGE%>" />

<%-- <portlet:resourceURL var="popupURL" id="popupURL" /> --%>

<portlet:renderURL var="popupURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="jspPage" value="<%=TestCKEditorConstants.PAGE_POPUP%>" />
</portlet:renderURL>

<aui:form action="${submitPageURL}">

	<liferay-ui:input-editor name="pageContent" initMethod="initPageEditor" resizable="true"
		editorImpl="<%=TestCKEditorConstants.EDITOR_WYSIWYG_IMPL_KEY%>"
		toolbarSet="<%=TestCKEditorConstants.EDITOR_TOOLBAR_SET%>" />

	<aui:button type="submit" value="Submit" />
	<aui:button type="button" value="Open popup" cssClass="popup-button" />

</aui:form>

<script>
function <portlet:namespace />initPageEditor() {
	return "Page content ...";
}

$(function() {
	testCKEditorPortlet = new TestCKEditorPortlet({
		ns: '${ns}', popupURL: '${popupURL}'
	});
});
</script>
