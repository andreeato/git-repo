package parent.factory;

import plugin.factory.implementation.ShapeType;

public class ShapeFactoryMain {

	public static void main(String args[]) {
		ShapeFactory shapeFactory = new ShapeFactory();
		shapeFactory.buidlFactory(ShapeType.CIRCLE);
		shapeFactory.buidlFactory(ShapeType.RECTANGLE);
		shapeFactory.buidlFactory(ShapeType.SQUARE);
	}
}
