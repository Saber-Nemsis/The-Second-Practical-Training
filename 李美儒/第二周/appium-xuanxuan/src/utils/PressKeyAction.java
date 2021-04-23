package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventMetaModifier;

public class PressKeyAction {
	public AndroidDriver<AndroidElement> driver;
	public KeyEvent keyEvent;
	public PressKeyAction(AndroidDriver<AndroidElement> driver,KeyEvent keyEvent) {
		this.driver=driver;
		keyEvent=new KeyEvent();
	}
	/*
	 * 模拟键盘操作
	 * 输入数字
	 */
	public void pressDigit(char c) {
		KeyEvent keyEvent=new KeyEvent();
		switch(c) {
		case '0':
			driver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_0));
			break;
		case '1':
			driver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_1));
			break;
		case '2':
			driver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_2));
			break;
		case '3':
			driver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_3));
			break;
		case '4':
			driver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_4));
			break;
		case '5':
			driver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_5));
			break;
		case '6':
			driver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_6));
			break;
		case '7':
			driver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_7));
			break;
		case '8':
			driver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_8));
			break;
		case '9':
			driver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_9));
			break;
		}
	}
	/*
	 * 模拟键盘操作
	 * 输入小写字母
	 */
	public void pressLowerCaseKey(char c) {
		KeyEvent keyEvent=new KeyEvent();
		switch (c) {
		case 'a':
			driver.pressKey(keyEvent.withKey(AndroidKey.A));
			break;
		case 'b':
			driver.pressKey(keyEvent.withKey(AndroidKey.B));
			break;
		case 'c':
			driver.pressKey(keyEvent.withKey(AndroidKey.C));
			break;
		case 'd':
			driver.pressKey(keyEvent.withKey(AndroidKey.D));
			break;
		case 'e':
			driver.pressKey(keyEvent.withKey(AndroidKey.E));
			break;
		case 'f':
			driver.pressKey(keyEvent.withKey(AndroidKey.F));
			break;
		case 'g':
			driver.pressKey(keyEvent.withKey(AndroidKey.G));
			break;
		case 'h':
			driver.pressKey(keyEvent.withKey(AndroidKey.H));
			break;
		case 'i':
			driver.pressKey(keyEvent.withKey(AndroidKey.I));
			break;
		case 'j':
			driver.pressKey(keyEvent.withKey(AndroidKey.J));
			break;
		case 'k':
			driver.pressKey(keyEvent.withKey(AndroidKey.K));
			break;
		case 'l':
			driver.pressKey(keyEvent.withKey(AndroidKey.L));
			break;
		case 'm':
			driver.pressKey(keyEvent.withKey(AndroidKey.M));
			break;
		case 'n':
			driver.pressKey(keyEvent.withKey(AndroidKey.N));
			break;
		case 'o':
			driver.pressKey(keyEvent.withKey(AndroidKey.O));
			break;
		case 'p':
			driver.pressKey(keyEvent.withKey(AndroidKey.P));
			break;
		case 'q':
			driver.pressKey(keyEvent.withKey(AndroidKey.Q));
			break;
		case 'r':
			driver.pressKey(keyEvent.withKey(AndroidKey.R));
			break;
		case 's':
			driver.pressKey(keyEvent.withKey(AndroidKey.S));
			break;
		case 't':
			driver.pressKey(keyEvent.withKey(AndroidKey.T));
			break;
		case 'u':
			driver.pressKey(keyEvent.withKey(AndroidKey.U));
			break;
		case 'v':
			driver.pressKey(keyEvent.withKey(AndroidKey.V));
			break;
		case 'w':
			driver.pressKey(keyEvent.withKey(AndroidKey.W));
			break;
		case 'x':
			driver.pressKey(keyEvent.withKey(AndroidKey.X));
			break;
		case 'y':
			driver.pressKey(keyEvent.withKey(AndroidKey.Y));
			break;
		case 'z':
			driver.pressKey(keyEvent.withKey(AndroidKey.Z));
			break;
		}
	}
	/*
	 * 模拟键盘操作
	 * 输入特殊字符
	 */
	public void pressSpecialKey(char c) {
		KeyEvent keyEvent=new KeyEvent();
		switch (c) {
		case ':':
			driver.pressKey(keyEvent.withKey(AndroidKey.SEMICOLON).withMetaModifier(KeyEventMetaModifier.SHIFT_LEFT_ON));
			break;

		case '.':
			driver.pressKey(keyEvent.withKey(AndroidKey.PERIOD));
			break;
		}
	}

}
