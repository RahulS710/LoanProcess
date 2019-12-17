package com.ivl.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cibil {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cid;
private long cibilScore;
@OneToOne
private User userId;

public User getUserId() {
	return userId;
}
public void setUserId(User userId) {
	this.userId = userId;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public long getCibilScore() {
	return cibilScore;
}
public void setCibilScore(long cibilScore) {
	this.cibilScore = cibilScore;
}

}
