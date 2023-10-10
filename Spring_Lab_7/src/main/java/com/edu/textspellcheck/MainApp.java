package com.edu.textspellcheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		TextEditor text = (TextEditor) context.getBean("texteditor");
		text.spellcheckEnabled();
	}

}
