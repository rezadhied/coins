import src.main.java.Shape;
import java.util.logging.Logger;

public class Driver {

	private static final Logger logger = Logger.getLogger(Driver.class.getName()); // Declare logger statically
	
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		
		logger.info("10x10 Square Area: " + shape.squareArea(10));
	        logger.info("12x15 Rectangle Area: " + shape.rectangleArea(12, 15));
	        logger.info("7 Radius Circle Area: " + shape.circleArea(7));
		
	}

}
