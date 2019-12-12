package com.ivl.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

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

}
