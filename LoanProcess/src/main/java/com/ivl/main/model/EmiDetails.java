package com.ivl.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EmiDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int emiId;
	private String emiDate;
	private long amount;
	private String loanamountDeduction;
	@ManyToOne
	private LoanDetails loanDetailsId;
	
	public LoanDetails getLoanDetailsId() {
		return loanDetailsId;
	}
	public void setLoanDetailsId(LoanDetails loanDetailsId) {
		this.loanDetailsId = loanDetailsId;
	}
	private double emiPaidNot;
	public double getEmiPaidNot() {
		return emiPaidNot;
	}
	public void setEmiPaidNot(double emiPaidNot) {
		this.emiPaidNot = emiPaidNot;
	}
	public int getEmiId() {
		return emiId;
	}
	public void setEmiId(int emiId) {
		this.emiId = emiId;
	}
	public String getEmiDate() {
		return emiDate;
	}
	public void setEmiDate(String emiDate) {
		this.emiDate = emiDate;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getLoanamountDeduction() {
		return loanamountDeduction;
	}
	public void setLoanamountDeduction(String loanamountDeduction) {
		this.loanamountDeduction = loanamountDeduction;
	}
	
	
	

}
