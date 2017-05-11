<%@ include file="/html/test-ckeditor/init.jsp" %>

<portlet:actionURL var="submitPopupURL" name="<%=TestCKEditorConstants.ACTION_SUBMIT_POPUP%>" />

<aui:form action="${submitPopupURL}">

	<liferay-ui:input-editor name="popupContent" initMethod="initPopupEditor" resizable="true"
		editorImpl="<%=TestCKEditorConstants.EDITOR_WYSIWYG_IMPL_KEY%>"
		toolbarSet="<%=TestCKEditorConstants.EDITOR_TOOLBAR_SET%>" />

	<aui:button type="submit" value="Submit" />

</aui:form>

<script>
//window['_testckeditor_WAR_libraryportlet_popupContent'];
//CKEDITOR.instances['_testckeditor_WAR_libraryportlet_popupContent'];

function <portlet:namespace />initPopupEditor() {
	return "Popup content ...";
	alert('lala');
}
</script>
