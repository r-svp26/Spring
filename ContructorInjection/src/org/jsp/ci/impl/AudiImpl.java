package org.jsp.ci.impl;

import org.jsp.ci.service.ICar;

public class AudiImpl implements ICar {

	public AudiImpl() {
		System.out.println("Audi Implementation Object has Created!");
	}

	@Override
	public void drive() {
		System.out.println("Driving Audi Car happily...");
	}

}
