package com.mia.formation.generation.ui;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.SWT;

public class ClientView extends Shell {

	private Button btnafficherCompte;

	
	public void afficherCompte(){
// Start of user code for afficherCompte
// End of user code
	}
	public void quitter(){
// Start of user code for quitter
// End of user code
	}

	/**
	 * Create the shell.
	 * @param display
	 */
	public ClientView(Display display) {
		super(display, SWT.SHELL_TRIM);
		createContents();
	}
	
	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Vue du client");
		setSize(450, 300);
	}
}
