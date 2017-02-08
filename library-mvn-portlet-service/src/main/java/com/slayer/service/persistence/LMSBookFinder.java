package com.slayer.service.persistence;

public interface LMSBookFinder {
    public java.util.List<com.slayer.model.LMSBook> findBooks(
        java.lang.String bookTitle)
        throws com.liferay.portal.kernel.exception.SystemException;
}
