package com.d2h.model;

import java.time.LocalDate;

public class Transaction {
	private int txnId;
	private double amount;
	private LocalDate dateOfTxn;
	private TxnType txnType;
	private String description;

	public int getTxnId() {
		return txnId;
	}

	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDateOfTxn() {
		return dateOfTxn;
	}

	public void setDateOfTxn(LocalDate dateOfTxn) {
		this.dateOfTxn = dateOfTxn;
	}

	public TxnType getTxnType() {
		return txnType;
	}

	public void setTxnType(TxnType txnType) {
		this.txnType = txnType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
