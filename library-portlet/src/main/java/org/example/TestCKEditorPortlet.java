package org.example;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class TestCKEditorPortlet extends MVCPortlet {

	public void submitPage(ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortletException, IOException {

		String pageContent = ParamUtil.getString(actionRequest, TestCKEditorConstants.PAGE_CONTENT_ATTR);

		System.out.println("pageContent: " + pageContent);

		actionRequest.setAttribute(TestCKEditorConstants.PAGE_CONTENT_ATTR, pageContent);
	}

	public void submitPopup(ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortletException, IOException {

		String popupContent = ParamUtil.getString(actionRequest, TestCKEditorConstants.POPUP_CONTENT_ATTR);

		System.out.println("popupContent: " + popupContent);

		actionRequest.setAttribute(TestCKEditorConstants.POPUP_CONTENT_ATTR, popupContent);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws PortletException, IOException {

		String resourceID = GetterUtil.getString(resourceRequest.getResourceID());

		if (resourceID.equals("popupURL")) {
			servePopupPage(resourceRequest, resourceResponse);
		}
		else {
			super.serveResource(resourceRequest, resourceResponse);
		}
	}

	protected void servePopupPage(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws PortletException, IOException {

		PortletRequestDispatcher dispatcher = resourceRequest.getPortletSession().getPortletContext().getRequestDispatcher(TestCKEditorConstants.PAGE_POPUP);

		if (dispatcher != null) {
			dispatcher.include(resourceRequest, resourceResponse);
		}
	}
}
