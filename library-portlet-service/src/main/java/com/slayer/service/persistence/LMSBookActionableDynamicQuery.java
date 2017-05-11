package com.slayer.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.slayer.model.LMSBook;

import com.slayer.service.LMSBookLocalServiceUtil;

/**
 * @author dmen
 * @generated
 */
public abstract class LMSBookActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LMSBookActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LMSBookLocalServiceUtil.getService());
        setClass(LMSBook.class);

        setClassLoader(com.slayer.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bookId");
    }
}
