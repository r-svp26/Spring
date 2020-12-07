package org.jsp.si;

import java.util.List;

public class BMWImpl implements ICar {

	private int id;
	private String color; // Primitive DataType
	private Engine engine; // Class Type
	private List<String> wheel; // Collection Type

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<String> getWheel() {
		return wheel;
	}

	public void setWheel(List<String> wheel) {
		this.wheel = wheel;
	}

	@Override
	public void drive() {
		
		System.out.println("BMW Car Details");
		System.out.println("BMW Id:" + getId());
		System.out.println("BMW Color:" + getColor());
		System.out.println("BMW Engine:" + getEngine());
		System.out.println("BMW Wheel:" + getWheel());
		System.out.println("BMW driving happily...");
	}

}
