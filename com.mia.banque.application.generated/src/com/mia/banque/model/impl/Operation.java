package com.mia.banque.model.impl;

import com.mia.banque.model.*;

import java.util.List;
import java.util.ArrayList;

class Operation implements IOperation {
	protected String Numero;
	protected String Montant;

	public String getNumero(){
		return this.Numero;
	}
	public void setNumero(String newValue){
		this.Numero = newValue;
	}
	public String getMontant(){
		return this.Montant;
	}
	public void setMontant(String newValue){
		this.Montant = newValue;
	}





}