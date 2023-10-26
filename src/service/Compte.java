package service;

import java.util.Date;

public class Compte {
	private int code;
	private Date dateCreation;
	private double solde;
	
	public Compte(int code, Date dateCreation, double solde) {
		super();
		this.code = code;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public Date getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
