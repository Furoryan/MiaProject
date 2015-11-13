package com.mia.banque.ui.view.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

import com.mia.banque.ui.controler.ICompteControler;
import com.mia.banque.ui.view.ICompteView;
import com.mia.banque.model.ICompte;
import com.mia.banque.model.impl.Compte;

public class CompteView extends Shell implements ICompteView {
	private ICompteControler controler;
	private ICompte model;
	
	public CompteView(Display d, ICompteControler ctrl, ICompte mdl){
		super(d);
		this.controler = ctrl;
		this.model = mdl;
		this.createContents();
	}
	
	private Button afficherOperationButton;
	
	public void afficherOperation(){
		this.controler.afficherOperation();
	}
	private Button quitterButton;
	
	public void quitter(){
		this.controler.quitter();
	}


	private void createContents(){
		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		this.afficherOperationButton = new Button(grpButtons, SWT.NONE);
		this.afficherOperationButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		this.afficherOperationButton.setText("afficherOperation");
		this.afficherOperationButton.addSelectionListener(new SelectionAdapter(){
		        public void widgetSelected(SelectionEvent event)
		        {
		          afficherOperation();
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