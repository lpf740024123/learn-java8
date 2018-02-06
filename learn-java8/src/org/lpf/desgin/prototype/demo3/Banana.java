package org.lpf.desgin.prototype.demo3;

public class Banana {

	private int weight;
	private int height;
	private double price;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Banana [weight=" + weight + ", height=" + height + ", price="
				+ price + "]";
	}
	
	
}
