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
public class LMSBookSoap implements Serializable {
    private long _bookId;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _bookTitle;
    private String _author;

    public LMSBookSoap() {
    }

    public static LMSBookSoap toSoapModel(LMSBook model) {
        LMSBookSoap soapModel = new LMSBookSoap();

        soapModel.setBookId(model.getBookId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setBookTitle(model.getBookTitle());
        soapModel.setAuthor(model.getAuthor());

        return soapModel;
    }

    public static LMSBookSoap[] toSoapModels(LMSBook[] models) {
        LMSBookSoap[] soapModels = new LMSBookSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LMSBookSoap[][] toSoapModels(LMSBook[][] models) {
        LMSBookSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LMSBookSoap[models.length][models[0].length];
        } else {
            soapModels = new LMSBookSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LMSBookSoap[] toSoapModels(List<LMSBook> models) {
        List<LMSBookSoap> soapModels = new ArrayList<LMSBookSoap>(models.size());

        for (LMSBook model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LMSBookSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _bookId;
    }

    public void setPrimaryKey(long pk) {
        setBookId(pk);
    }

    public long getBookId() {
        return _bookId;
    }

    public void setBookId(long bookId) {
        _bookId = bookId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getBookTitle() {
        return _bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        _bookTitle = bookTitle;
    }

    public String getAuthor() {
        return _author;
    }

    public void setAuthor(String author) {
        _author = author;
    }
}
