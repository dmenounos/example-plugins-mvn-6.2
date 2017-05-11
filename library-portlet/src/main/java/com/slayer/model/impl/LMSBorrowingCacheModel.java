package com.slayer.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.slayer.model.LMSBorrowing;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LMSBorrowing in entity cache.
 *
 * @author dmen
 * @see LMSBorrowing
 * @generated
 */
public class LMSBorrowingCacheModel implements CacheModel<LMSBorrowing>,
    Externalizable {
    public long borrowingId;
    public long bookId;
    public long memberId;
    public long dateBorrowed;
    public long dateReturned;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{borrowingId=");
        sb.append(borrowingId);
        sb.append(", bookId=");
        sb.append(bookId);
        sb.append(", memberId=");
        sb.append(memberId);
        sb.append(", dateBorrowed=");
        sb.append(dateBorrowed);
        sb.append(", dateReturned=");
        sb.append(dateReturned);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public LMSBorrowing toEntityModel() {
        LMSBorrowingImpl lmsBorrowingImpl = new LMSBorrowingImpl();

        lmsBorrowingImpl.setBorrowingId(borrowingId);
        lmsBorrowingImpl.setBookId(bookId);
        lmsBorrowingImpl.setMemberId(memberId);

        if (dateBorrowed == Long.MIN_VALUE) {
            lmsBorrowingImpl.setDateBorrowed(null);
        } else {
            lmsBorrowingImpl.setDateBorrowed(new Date(dateBorrowed));
        }

        if (dateReturned == Long.MIN_VALUE) {
            lmsBorrowingImpl.setDateReturned(null);
        } else {
            lmsBorrowingImpl.setDateReturned(new Date(dateReturned));
        }

        lmsBorrowingImpl.resetOriginalValues();

        return lmsBorrowingImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        borrowingId = objectInput.readLong();
        bookId = objectInput.readLong();
        memberId = objectInput.readLong();
        dateBorrowed = objectInput.readLong();
        dateReturned = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(borrowingId);
        objectOutput.writeLong(bookId);
        objectOutput.writeLong(memberId);
        objectOutput.writeLong(dateBorrowed);
        objectOutput.writeLong(dateReturned);
    }
}
