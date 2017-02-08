package com.slayer.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.slayer.model.LMSBorrowing;

/**
 * The persistence interface for the l m s borrowing service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dmen
 * @see LMSBorrowingPersistenceImpl
 * @see LMSBorrowingUtil
 * @generated
 */
public interface LMSBorrowingPersistence extends BasePersistence<LMSBorrowing> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LMSBorrowingUtil} to access the l m s borrowing persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the l m s borrowings where bookId = &#63;.
    *
    * @param bookId the book ID
    * @return the matching l m s borrowings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.slayer.model.LMSBorrowing> findByBookId(
        long bookId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l m s borrowings where bookId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBorrowingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bookId the book ID
    * @param start the lower bound of the range of l m s borrowings
    * @param end the upper bound of the range of l m s borrowings (not inclusive)
    * @return the range of matching l m s borrowings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.slayer.model.LMSBorrowing> findByBookId(
        long bookId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l m s borrowings where bookId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBorrowingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bookId the book ID
    * @param start the lower bound of the range of l m s borrowings
    * @param end the upper bound of the range of l m s borrowings (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l m s borrowings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.slayer.model.LMSBorrowing> findByBookId(
        long bookId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l m s borrowing in the ordered set where bookId = &#63;.
    *
    * @param bookId the book ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l m s borrowing
    * @throws com.slayer.NoSuchBorrowingException if a matching l m s borrowing could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.slayer.model.LMSBorrowing findByBookId_First(long bookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.slayer.NoSuchBorrowingException;

    /**
    * Returns the first l m s borrowing in the ordered set where bookId = &#63;.
    *
    * @param bookId the book ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l m s borrowing, or <code>null</code> if a matching l m s borrowing could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.slayer.model.LMSBorrowing fetchByBookId_First(long bookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l m s borrowing in the ordered set where bookId = &#63;.
    *
    * @param bookId the book ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l m s borrowing
    * @throws com.slayer.NoSuchBorrowingException if a matching l m s borrowing could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.slayer.model.LMSBorrowing findByBookId_Last(long bookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.slayer.NoSuchBorrowingException;

    /**
    * Returns the last l m s borrowing in the ordered set where bookId = &#63;.
    *
    * @param bookId the book ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l m s borrowing, or <code>null</code> if a matching l m s borrowing could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.slayer.model.LMSBorrowing fetchByBookId_Last(long bookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l m s borrowings before and after the current l m s borrowing in the ordered set where bookId = &#63;.
    *
    * @param borrowingId the primary key of the current l m s borrowing
    * @param bookId the book ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l m s borrowing
    * @throws com.slayer.NoSuchBorrowingException if a l m s borrowing with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.slayer.model.LMSBorrowing[] findByBookId_PrevAndNext(
        long borrowingId, long bookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.slayer.NoSuchBorrowingException;

    /**
    * Removes all the l m s borrowings where bookId = &#63; from the database.
    *
    * @param bookId the book ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByBookId(long bookId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l m s borrowings where bookId = &#63;.
    *
    * @param bookId the book ID
    * @return the number of matching l m s borrowings
    * @throws SystemException if a system exception occurred
    */
    public int countByBookId(long bookId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the l m s borrowing in the entity cache if it is enabled.
    *
    * @param lmsBorrowing the l m s borrowing
    */
    public void cacheResult(com.slayer.model.LMSBorrowing lmsBorrowing);

    /**
    * Caches the l m s borrowings in the entity cache if it is enabled.
    *
    * @param lmsBorrowings the l m s borrowings
    */
    public void cacheResult(
        java.util.List<com.slayer.model.LMSBorrowing> lmsBorrowings);

    /**
    * Creates a new l m s borrowing with the primary key. Does not add the l m s borrowing to the database.
    *
    * @param borrowingId the primary key for the new l m s borrowing
    * @return the new l m s borrowing
    */
    public com.slayer.model.LMSBorrowing create(long borrowingId);

    /**
    * Removes the l m s borrowing with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param borrowingId the primary key of the l m s borrowing
    * @return the l m s borrowing that was removed
    * @throws com.slayer.NoSuchBorrowingException if a l m s borrowing with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.slayer.model.LMSBorrowing remove(long borrowingId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.slayer.NoSuchBorrowingException;

    public com.slayer.model.LMSBorrowing updateImpl(
        com.slayer.model.LMSBorrowing lmsBorrowing)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l m s borrowing with the primary key or throws a {@link com.slayer.NoSuchBorrowingException} if it could not be found.
    *
    * @param borrowingId the primary key of the l m s borrowing
    * @return the l m s borrowing
    * @throws com.slayer.NoSuchBorrowingException if a l m s borrowing with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.slayer.model.LMSBorrowing findByPrimaryKey(long borrowingId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.slayer.NoSuchBorrowingException;

    /**
    * Returns the l m s borrowing with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param borrowingId the primary key of the l m s borrowing
    * @return the l m s borrowing, or <code>null</code> if a l m s borrowing with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.slayer.model.LMSBorrowing fetchByPrimaryKey(long borrowingId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l m s borrowings.
    *
    * @return the l m s borrowings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.slayer.model.LMSBorrowing> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l m s borrowings.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBorrowingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l m s borrowings
    * @param end the upper bound of the range of l m s borrowings (not inclusive)
    * @return the range of l m s borrowings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.slayer.model.LMSBorrowing> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l m s borrowings.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBorrowingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l m s borrowings
    * @param end the upper bound of the range of l m s borrowings (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l m s borrowings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.slayer.model.LMSBorrowing> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l m s borrowings from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l m s borrowings.
    *
    * @return the number of l m s borrowings
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
