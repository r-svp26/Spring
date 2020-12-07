package org.jsp.controller;

import org.jsp.dependency.Cosmetic;
import org.jsp.dependency.Electronic;
import org.jsp.dependency.Furniture;
import org.springframework.beans.factory.annotation.Autowired;

public class Flipkart {

	@Autowired
	private Electronic ec;
	@Autowired
	private Furniture fr;
	@Autowired
	private Cosmetic cos;

	public Electronic getEc() {
		return ec;
	}

	public void setEc(Electronic ec) {
		this.ec = ec;
	}

	public Furniture getFr() {
		return fr;
	}

	public void setFr(Furniture fr) {
		this.fr = fr;
	}

	public Cosmetic getCos() {
		return cos;
	}

	public void setCos(Cosmetic cos) {
		this.cos = cos;
	}

	public void purchase() {
		System.out.println("Purchase is confirmed by Flipkart!");
		ec.mobile();
		fr.sofa();
		cos.lipstick();
	}

}
