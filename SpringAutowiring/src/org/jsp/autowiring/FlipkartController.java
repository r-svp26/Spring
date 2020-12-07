package org.jsp.autowiring;

public class FlipkartController {

	/* Spring AutoWiring only deals with ClassType */
	private Electronic ec;
	private Furniture fr;
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
		System.out.println("Purchase confirmed by Flipkart!");
		ec.mobile();
		fr.sofa();
		cos.lipstic();
	}

}
