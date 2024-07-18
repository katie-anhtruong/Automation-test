package day5_abstraction;


public class ShapeApplication {
	public static void main(String[] args) {
		Shape rectangle1 = new Rectangle();
		rectangle1.draw();
		System.out.println();
		System.out.println("============");
		
		Shape circle1 = new Circle();
		circle1.draw();
	}
}