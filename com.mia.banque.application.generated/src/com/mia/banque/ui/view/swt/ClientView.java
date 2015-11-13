package com.mia.banque.ui.view.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

import com.mia.banque.ui.controler.IClientControler;
import com.mia.banque.ui.view.IClientView;
import com.mia.banque.model.IClient;
import com.mia.banque.model.impl.Client;

public class ClientView extends Shell implements IClientView {
	private IClientControler controler;
	private IClient model;
	
	public ClientView(Display d, IClientControler ctrl, IClient mdl){
		super(d);
		this.controler = ctrl;
		this.model = mdl;
		this.createContents();
	}
	
	private Button afficherCompteButton;
	
	public void afficherCompte(){
		this.controler.afficherCompte();
	}
	private Button quitterButton;
	
	public void quitter(){
		this.controler.quitter();
	}


	private void createContents(){
		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		this.afficherCompteButton = new Button(grpButtons, SWT.NONE);
		this.afficherCompteButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		this.afficherCompteButton.setText("afficherCompte");
		this.afficherCompteButton.addSelectionListener(new SelectionAdapter(){
		        public void widgetSelected(SelectionEvent event)
		        {
		          afficherCompte();
		        }
		      });
 		this.quitterButton = new Button(grpButtons, SWT.NONE);
		this.quitterButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		this.quitterButton.setText("quitter");
		this.quitterButton.addSelectionListener(new SelectionAdapter(){
		        public void widgetSelected(SelectionEvent event)
		        {
		          quitter();
		        }
		      });
 
	}
}