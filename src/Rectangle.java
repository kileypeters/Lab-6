/**
 * Lab 6
 * 
 * Class representing a Rectangle
 * 
 * @author Kiley
 *
 */
public class Rectangle extends Polygon {

	/**
	 * Height of the rectangle.
	 */
	private double height;
	
	/**
	 * Width of the rectangle
	 */
	private double width;
	
	/**
	 * Rectangle constructor.
	 * 
	 * @param id The shape's name identifier, as defined in Shape.java.
	 * @param height The height of the rectangle.
	 * @param width The width of the rectangle.
	 */
	public Rectangle(String id, double height, double width) 
	{
		super(id);
		
		this.height = height;
		this.width = width;
		
	}
	
	/**
	 * Calculates and returns area of the rectangle.
	 * 
	 * @return Area of the rectangle.
	 */
	public double getArea()
	{
		
		double area = height * width;
		
		return area;
	}
	
	/**
	 * Gets the type of shape.
	 * 
	 * @return The string "Rectangle".
	 */
	public String getShapeType()
	{
		return "Rectangle";
	}

}
