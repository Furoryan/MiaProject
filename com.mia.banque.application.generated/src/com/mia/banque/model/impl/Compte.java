package com.mia.banque.model.impl;

import com.mia.banque.model.*;

import java.util.List;
import java.util.ArrayList;

public class Compte implements ICompte {
	protected String Numero;

	public String getNumero(){
		return this.Numero;
	}
	public void setNumero(String newValue){
		this.Numero = newValue;
	}


	protected List<IOperation> listOperation;



	public List<IOperation> getOperations(){
		if (this.listOperation == null){
			this.listOperation = new ArrayList<IOperation>();
		}
		return this.listOperation;
	}
	public void setOperations(List<IOperation> newValue){
		this.listOperation = newValue;
	}

}