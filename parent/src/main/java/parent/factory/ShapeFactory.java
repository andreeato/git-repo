package parent.factory;

import plugin.factory.implementation.Circle;
import plugin.factory.implementation.Rectangle;
import plugin.factory.implementation.ShapeType;
import plugin.factory.implementation.Square;
import plugin.git.factory.IShape;

public class ShapeFactory {
	
	public IShape buidlFactory(ShapeType shapeType) {
		IShape shape = null;
		switch (shapeType) {
		case CIRCLE:
			System.out.println("Create a circle");
			shape = new Circle();
			shape.draw();
			return shape;
		case SQUARE:
			System.out.println("Create a square");
			shape = new Square();
			shape.draw();
			return shape;
		case RECTANGLE:
			System.out.println("Create a rectangle");
			shape = new Rectangle();
			shape.draw();
			return shape;
		default:
			return null;
		}
		
	}

}
