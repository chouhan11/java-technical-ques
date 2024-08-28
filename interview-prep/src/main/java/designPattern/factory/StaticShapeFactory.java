package designPattern.factory;

public class StaticShapeFactory {
	
	public static Shape getShape(ShapeConstant shapeType){
		if(shapeType==null)
			return null;
		
		switch(shapeType) {
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