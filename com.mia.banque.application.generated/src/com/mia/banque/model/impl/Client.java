package com.mia.banque.model.impl;

import com.mia.banque.model.*;

import java.util.List;
import java.util.ArrayList;

public class Client implements IClient {
	protected String Nom;
	protected String Prenom;
	protected String Adresse;

	public String getNom(){
		return this.Nom;
	}
	public void setNom(String newValue){
		this.Nom = newValue;
	}
	public String getPrenom(){
		return this.Prenom;
	}
	public void setPrenom(String newValue){
		this.Prenom = newValue;
	}
	public String getAdresse(){
		return this.Adresse;
	}
	public void setAdresse(String newValue){
		this.Adresse = newValue;
	}


	protected List<ICompte> listCompte;



	public List<ICompte> getComptes(){
		if (this.listCompte == null){
			this.listCompte = new ArrayList<ICompte>();
		}
		return this.listCompte;
	}
	public void setComptes(List<ICompte> newValue){
		this.listCompte = newValue;
	}

}