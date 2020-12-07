package org.jsp.ci.impl;

import java.util.List;
import org.jsp.ci.entity.Engine;
import org.jsp.ci.service.ICar;

public class BMWImpl implements ICar {

	private int id;
	private String color; // Primitive DataType
	private Engine engine; // Class Type
	private List<String> wheel; // Collection Type

	public BMWImpl(int id, String color, Engine engine, List<String> wheel) {
		
		super();
		this.id = id;
		this.color = color;
		this.engine = engine;
		this.wheel = wheel;
	}

	@Override
	public void drive() {
		System.out.println("BMW Car Details");
		System.out.println("BMW ID:" + id);
		System.out.println("BMW Color:" + color);
		System.out.println("BMW Engine:" + engine);
		System.out.println("BMW Wheel:" + wheel);
		System.out.println("BMW driving happily...");
	}

}
