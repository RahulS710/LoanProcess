package com.ivl.main.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int loanId;
	private int loanNo;
	private String LoanType;
	private double emi;
	private double roi;
	private String LoanPassDate;
	private double loanAmount;
	private double totalLoanAmount;
	private int  bankId;
	@ManyToOne
	private User userId;
	
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	@OneToMany
	private List<EmiDetails> emiId;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public String getLoanType() {
		return LoanType;
	}
	public void setLoanType(String loanType) {
		LoanType = loanType;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public String getLoanPassDate() {
		return LoanPassDate;
	}
	public void setLoanPassDate(String loanPassDate) {
		LoanPassDate = loanPassDate;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getTotalLoanAmount() {
		return totalLoanAmount;
	}
	public void setTotalLoanAmount(double totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public List<EmiDetails> getEmiId() {
		return emiId;
	}
	public void setEmiId(List<EmiDetails> emiId) {
		this.emiId = emiId;
	}
	
	
	
	

}
