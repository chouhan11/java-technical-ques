package designPattern.factory;

public class FactoryDPDriver {

	public static void main(String[] args) {

		ShapeFactory sf = new ShapeFactory();
		Shape triangle = sf.getShape(ShapeConstant.TRIANGLE);
		triangle.draw();

		StaticShapeFactory.getShape(ShapeConstant.CIRCLE).draw();

	}

}
