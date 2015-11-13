package com.mia.banque.ui.view.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

import com.mia.banque.ui.controler.IOperationControler;
import com.mia.banque.ui.view.IOperationView;
import com.mia.banque.model.IOperation;
import com.mia.banque.model.impl.Operation;

public class OperationView extends Shell implements IOperationView {
	private IOperationControler controler;
	private IOperation model;
	
	public OperationView(Display d, IOperationControler ctrl, IOperation mdl){
		super(d);
		this.controler = ctrl;
		this.model = mdl;
		this.createContents();
	}
	
	private Button quitterButton;
	
	public void quitter(){
		this.controler.quitter();
	}


	private void createContents(){
		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
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