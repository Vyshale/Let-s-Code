package com.letscode;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ToWorkWithRobotClass {

	public static void main(String[] args) throws AWTException {
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		
		System.out.println("Key Event happends");
		

	}

}
