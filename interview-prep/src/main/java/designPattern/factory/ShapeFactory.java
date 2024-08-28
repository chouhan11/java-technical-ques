package designPattern.factory;

public class ShapeFactory {

	public Shape getShape(ShapeConstant shapeType) {
		if (shapeType == null)
			return null;

		switch (shapeType) {
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();
		case TRIANGLE:
			return new Triangle();

		}
		return null;
	}
}