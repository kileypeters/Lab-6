/**
 * Lab 6
 * 
 * Class representing a square.
 * 
 * @author Kiley
 *
 */
public class Square extends Rectangle{
	
	/**
	 *  Constructor for sqaures.
	 *  
	 * @param id The shape's name identifier, as defined in Shape.java.
	 * @param size The side of the square.
	 */
	public Square(String id, double size) 
	{
		super(id, size, size);
		
		sideLengths.add(size);
		
		
	}
	
	/**
	 * Get the type of shape.
	 * 
	 * @return The string "Square".
	 */
	public String getShapeType()
	{
		return "Square";
	}

}
