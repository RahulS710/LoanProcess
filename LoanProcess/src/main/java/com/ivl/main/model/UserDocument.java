package com.ivl.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserDocument {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String documentName;
	private String documentType;
	private boolean isDocumentApproved;
	@Lob
	private byte[] document;
	private long userId;
	@OneToOne
	private User user;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isDocumentApproved() {
		return isDocumentApproved;
	}

	public void setDocumentApproved(boolean isDocumentApproved) {
		this.isDocumentApproved = isDocumentApproved;
	}
//
//@OneToMany
//	@JoinColumn(name = "user_id", nullable = false)
//	private User user;

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public byte[] getDocument() {
		return document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
