package day5_abstraction;

public class Rectangle extends Shape{
	@Override
	public void draw()
	{
		System.out.println("Draw rectangle by 4 edges, use color"+getColor());
	}
}