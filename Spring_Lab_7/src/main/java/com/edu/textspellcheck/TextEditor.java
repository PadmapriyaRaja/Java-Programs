package com.edu.textspellcheck;

public class TextEditor {
	private SpellCheck spellcheck;
	public TextEditor (SpellCheck spellcheck){
		this.spellcheck = spellcheck;
	}
	
	public void spellcheckEnabled() {
		if(spellcheck!=null) {
			spellcheck.displaySpellCheck();
		}else {
			System.out.println("Spell check is not enabled");
		}
	}
}
