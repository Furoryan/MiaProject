package com.mia.banque.model.impl;

import com.mia.banque.model.*;

import java.util.List;
import java.util.ArrayList;

public class Banque implements IBanque {

	protected List<IClient> listClient;



	public List<IClient> getClients(){
		if (this.listClient == null){
			this.listClient = new ArrayList<IClient>();
		}
		return this.listClient;
	}
	public void setClients(List<IClient> newValue){
		this.listClient = newValue;
	}

}