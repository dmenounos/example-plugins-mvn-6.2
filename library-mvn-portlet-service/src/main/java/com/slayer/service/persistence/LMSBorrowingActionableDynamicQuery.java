package com.slayer.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.slayer.model.LMSBorrowing;

import com.slayer.service.LMSBorrowingLocalServiceUtil;

/**
 * @author dmen
 * @generated
 */
public abstract class LMSBorrowingActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LMSBorrowingActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LMSBorrowingLocalServiceUtil.getService());
        setClass(LMSBorrowing.class);

        setClassLoader(com.slayer.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("borrowingId");
    }
}
