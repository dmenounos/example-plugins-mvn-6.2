package com.slayer.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class LMSBookFinderUtil {
    private static LMSBookFinder _finder;

    public static java.util.List<com.slayer.model.LMSBook> findBooks(
        java.lang.String bookTitle)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findBooks(bookTitle);
    }

    public static LMSBookFinder getFinder() {
        if (_finder == null) {
            _finder = (LMSBookFinder) PortletBeanLocatorUtil.locate(com.slayer.service.ClpSerializer.getServletContextName(),
                    LMSBookFinder.class.getName());

            ReferenceRegistry.registerReference(LMSBookFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(LMSBookFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(LMSBookFinderUtil.class, "_finder");
    }
}
