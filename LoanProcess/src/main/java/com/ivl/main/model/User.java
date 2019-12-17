package com.ivl.main.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String address;
	private String contactNo;
	private String enquiryDescription;
	private String email;
	private String panNo;
	private long adharNo;
	private double loanAmount;
	private String password;
	private int missingEmi;
	@OneToMany
	private List<LoanDetails> loanId;
	@OneToOne
	private Cibil cid;
	@OneToOne
	UserDocument userDocument;
	public UserDocument getUserDocument() {
		return userDocument;
	}

	public void setUserDocument(UserDocument userDocument) {
		this.userDocument = userDocument;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getMissingEmi() {
		return missingEmi;
	}

	public void setMissingEmi(int missingEmi) {
		this.missingEmi = missingEmi;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEnquiryDescription() {
		return enquiryDescription;
	}

	public void setEnquiryDescription(String enquiryDescription) {
		this.enquiryDescription = enquiryDescription;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public List<LoanDetails> getLoanId() {
		return loanId;
	}

	public void setLoanId(List<LoanDetails> loanId) {
		this.loanId = loanId;
	}

	public Cibil getCid() {
		return cid;
	}

	public void setCid(Cibil cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", address=" + address + ", contactNo=" + contactNo + ", enquiryDescription="
				+ enquiryDescription + ", email=" + email + ", panNo=" + panNo + ", adharNo=" + adharNo
				+ ", loanAmount=" + loanAmount + ", password=" + password + ", missingEmi=" + missingEmi + ", loanId="
				+ loanId + ", cid=" + cid + "]";
	}

}
