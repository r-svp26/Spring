package org.jsp.controller;

import org.jsp.dependency.Cosmetic;
import org.jsp.dependency.Electronic;
import org.jsp.dependency.Furniture;

public class Flipkart {

	private Electronic ec;
	private Furniture fr;
	private Cosmetic cos;

	public Flipkart(Electronic ec, Furniture fr, Cosmetic cos) {
		super();
		this.ec = ec;
		this.fr = fr;
		this.cos = cos;
	}
	
	public void purchase(){
		System.out.println("Purchase is confirmed by Flipkart!");
		ec.mobile();
		fr.sofa();
		cos.lipstick();
	}

}
