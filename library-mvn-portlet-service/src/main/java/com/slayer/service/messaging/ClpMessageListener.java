package com.slayer.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.slayer.service.ClpSerializer;
import com.slayer.service.LMSBookLocalServiceUtil;
import com.slayer.service.LMSBorrowingLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            LMSBookLocalServiceUtil.clearService();

            LMSBorrowingLocalServiceUtil.clearService();
        }
    }
}
