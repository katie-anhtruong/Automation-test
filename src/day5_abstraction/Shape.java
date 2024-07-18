package day5_abstraction;

public abstract class Shape {
	private String color = "Red";
	public String getColor() {
		return color;
	}
	public abstract void draw();
}