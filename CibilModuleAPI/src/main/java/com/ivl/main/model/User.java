package com.ivl.main.model;

public class User {
	
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

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	private String password;
	private int missingEmi;
	
	private Cibil cid;

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

	

	public Cibil getCid() {
		return cid;
	}

	public void setCid(Cibil cid) {
		this.cid = cid;
	}

	

}
