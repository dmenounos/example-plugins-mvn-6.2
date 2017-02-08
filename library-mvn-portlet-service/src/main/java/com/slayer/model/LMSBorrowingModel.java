package com.slayer.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LMSBorrowing service. Represents a row in the &quot;LMS_LMSBorrowing&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.slayer.model.impl.LMSBorrowingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.slayer.model.impl.LMSBorrowingImpl}.
 * </p>
 *
 * @author dmen
 * @see LMSBorrowing
 * @see com.slayer.model.impl.LMSBorrowingImpl
 * @see com.slayer.model.impl.LMSBorrowingModelImpl
 * @generated
 */
public interface LMSBorrowingModel extends BaseModel<LMSBorrowing> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a l m s borrowing model instance should use the {@link LMSBorrowing} interface instead.
     */

    /**
     * Returns the primary key of this l m s borrowing.
     *
     * @return the primary key of this l m s borrowing
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this l m s borrowing.
     *
     * @param primaryKey the primary key of this l m s borrowing
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the borrowing ID of this l m s borrowing.
     *
     * @return the borrowing ID of this l m s borrowing
     */
    public long getBorrowingId();

    /**
     * Sets the borrowing ID of this l m s borrowing.
     *
     * @param borrowingId the borrowing ID of this l m s borrowing
     */
    public void setBorrowingId(long borrowingId);

    /**
     * Returns the book ID of this l m s borrowing.
     *
     * @return the book ID of this l m s borrowing
     */
    public long getBookId();

    /**
     * Sets the book ID of this l m s borrowing.
     *
     * @param bookId the book ID of this l m s borrowing
     */
    public void setBookId(long bookId);

    /**
     * Returns the member ID of this l m s borrowing.
     *
     * @return the member ID of this l m s borrowing
     */
    public long getMemberId();

    /**
     * Sets the member ID of this l m s borrowing.
     *
     * @param memberId the member ID of this l m s borrowing
     */
    public void setMemberId(long memberId);

    /**
     * Returns the date borrowed of this l m s borrowing.
     *
     * @return the date borrowed of this l m s borrowing
     */
    public Date getDateBorrowed();

    /**
     * Sets the date borrowed of this l m s borrowing.
     *
     * @param dateBorrowed the date borrowed of this l m s borrowing
     */
    public void setDateBorrowed(Date dateBorrowed);

    /**
     * Returns the date returned of this l m s borrowing.
     *
     * @return the date returned of this l m s borrowing
     */
    public Date getDateReturned();

    /**
     * Sets the date returned of this l m s borrowing.
     *
     * @param dateReturned the date returned of this l m s borrowing
     */
    public void setDateReturned(Date dateReturned);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.slayer.model.LMSBorrowing lmsBorrowing);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.slayer.model.LMSBorrowing> toCacheModel();

    @Override
    public com.slayer.model.LMSBorrowing toEscapedModel();

    @Override
    public com.slayer.model.LMSBorrowing toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
