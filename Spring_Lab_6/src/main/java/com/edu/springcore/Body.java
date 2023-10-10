package com.edu.springcore;

public class Body {
	private Heart heart;
	public Body(Heart heart) {
		this.heart = heart;
	}
	
	public void humanAlive() {
		if(heart!=null) {
			heart.heartBeat();
		}else {
			System.out.println("Human is not alive");
		}
	}

}
