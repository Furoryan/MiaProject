package com.mia.banque.ui.view.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

import com.mia.banque.ui.controler.IBanqueControler;
import com.mia.banque.ui.view.IBanqueView;
import com.mia.banque.model.IBanque;
import com.mia.banque.model.impl.Banque;

public class BanqueView extends Shell implements IBanqueView {
	private IBanqueControler controler;
	private IBanque model;
	
	public BanqueView(Display d, IBanqueControler ctrl, IBanque mdl){
		super(d);
		this.controler = ctrl;
		this.model = mdl;
		this.createContents();
	}
	
	private Button afficherClientButton;
	
	public void afficherClient(){
		this.controler.afficherClient();
	}
	private Button quitterButton;
	
	public void quitter(){
		this.controler.quitter();
	}


	private void createContents(){
		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		this.afficherClientButton = new Button(grpButtons, SWT.NONE);
		this.afficherClientButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		this.afficherClientButton.setText("afficherClient");
		this.afficherClientButton.addSelectionListener(new SelectionAdapter(){
		        public void widgetSelected(SelectionEvent event)
		        {
		          afficherClient();
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