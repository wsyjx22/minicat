package com.mcxiaoke.fanfouapp.app;

import android.os.Bundle;
import com.mcxiaoke.fanfouapp.controller.UIController;

/**
 * @author mcxiaoke
 * @version 1.0 2011.10.25
 * @version 1.1 2011.11.02
 * @version 1.2 2011.11.03
 * @version 1.3 2011.11.11
 * @version 1.4 2011.12.05
 * @version 1.5 2012.02.27
 * 
 */
public class UIStart extends UIBaseSupport {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		checkLogin();

	}

	private void checkLogin() {
		if (AppContext.isVerified()) {
			UIController.showHome(this);
		} else {
			UIController.showLogin(this);
		}
		finish();
	}

}