package com.examples.mesc;

import java.awt.Adjustable;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JScrollBar;

public class MyJframeMain {

	private static final MyJframe myJframe = new MyJframe();
	public static void main(String[] args) {
		
		
		myJframe.setVisible(true);
		myJframe.setTitle("KANCHAN");
		myJframe.setBounds(20, 20, 300, 300);
		
		JScrollBar jScrollBar = new JScrollBar(Adjustable.HORIZONTAL, 10, 10, 1, 50);
		myJframe.add(jScrollBar, 10);
		myJframe.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				myJframe.setVisible(false);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				
			}
		});

	}

}
