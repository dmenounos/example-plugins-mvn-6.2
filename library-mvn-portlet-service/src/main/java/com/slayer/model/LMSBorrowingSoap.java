package com.slayer.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author dmen
 * @generated
 */
public class LMSBorrowingSoap implements Serializable {
    private long _borrowingId;
    private long _bookId;
    private long _memberId;
    private Date _dateBorrowed;
    private Date _dateReturned;

    public LMSBorrowingSoap() {
    }

    public static LMSBorrowingSoap toSoapModel(LMSBorrowing model) {
        LMSBorrowingSoap soapModel = new LMSBorrowingSoap();

        soapModel.setBorrowingId(model.getBorrowingId());
        soapModel.setBookId(model.getBookId());
        soapModel.setMemberId(model.getMemberId());
        soapModel.setDateBorrowed(model.getDateBorrowed());
        soapModel.setDateReturned(model.getDateReturned());

        return soapModel;
    }

    public static LMSBorrowingSoap[] toSoapModels(LMSBorrowing[] models) {
        LMSBorrowingSoap[] soapModels = new LMSBorrowingSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LMSBorrowingSoap[][] toSoapModels(LMSBorrowing[][] models) {
        LMSBorrowingSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LMSBorrowingSoap[models.length][models[0].length];
        } else {
            soapModels = new LMSBorrowingSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LMSBorrowingSoap[] toSoapModels(List<LMSBorrowing> models) {
        List<LMSBorrowingSoap> soapModels = new ArrayList<LMSBorrowingSoap>(models.size());

        for (LMSBorrowing model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LMSBorrowingSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _borrowingId;
    }

    public void setPrimaryKey(long pk) {
        setBorrowingId(pk);
    }

    public long getBorrowingId() {
        return _borrowingId;
    }

    public void setBorrowingId(long borrowingId) {
        _borrowingId = borrowingId;
    }

    public long getBookId() {
        return _bookId;
    }

    public void setBookId(long bookId) {
        _bookId = bookId;
    }

    public long getMemberId() {
        return _memberId;
    }

    public void setMemberId(long memberId) {
        _memberId = memberId;
    }

    public Date getDateBorrowed() {
        return _dateBorrowed;
    }

    public void setDateBorrowed(Date dateBorrowed) {
        _dateBorrowed = dateBorrowed;
    }

    public Date getDateReturned() {
        return _dateReturned;
    }

    public void setDateReturned(Date dateReturned) {
        _dateReturned = dateReturned;
    }
}
