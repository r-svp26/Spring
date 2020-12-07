package org.jsp.si;

public class AudiImpl implements ICar {

	public AudiImpl() {
		System.out.println("Audi Implementation Object has Created!");
	}

	@Override
	public void drive() {
		System.out.println("Audi driving Happily...");
	}

}
