package day5_abstraction;

public class Circle extends Shape{
	@Override
	public void draw()
	{
		System.out.println("Draw rectangle by 4 circle, use color "+getColor());
	}
}