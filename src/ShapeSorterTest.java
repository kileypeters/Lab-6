import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape s1 = new Square("A", 4.0);
		Shape s2 = new Rectangle("B", 4.0, 1.0);
		Shape s3 = new Rectangle("C", 3.0, 4.0);
		Shape s4 = new Rectangle("D", 16.0, 1.0);
		
		sorter.addShape(s1);
		sorter.addShape(s2);
		sorter.addShape(s3);
		sorter.addShape(s4);
		
		sorter.sortShapes();
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), s1);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), s2);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(2), s3);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(3), s4);
		
		
		
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape s1 = new Square("A", 4.0);
		Shape s2 = new Rectangle("B", 4.0, 1.0);
		
		sorter.addShape(s1);
		sorter.addShape(s2);
		
		sorter.sortShapes(new ShapeAreaComparator());
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), s2);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), s1);
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape s1 = new Square("A", 4.0);
		Shape s2 = new Rectangle("B", 4.0, 1.0);
		
		sorter.addShape(s1);
		sorter.addShape(s2);
		
		sorter.sortShapes(new ShapePerimeterComparator());
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), s2);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), s1);
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape s1 = new Square("A", 4.0);
		Shape s2 = new Rectangle("B", 4.0, 1.0);
		Shape s3 = new Trapezoid("C", 20, 15, 30, 55);
		Shape s4 = new EquilateralTriangle("D", 1.0);
		
		sorter.addShape(s1);
		sorter.addShape(s2);
		sorter.addShape(s3);
		sorter.addShape(s4);
	
		Assert.assertEquals("toString incorrect.", sorter.shapes.toString(), "[<<Square>>:	 ID = <<A>>	 area = <<16.000>>	 perimeter = <<16.000>>, <<Rectangle>>:	 ID = <<B>>	 area = <<4.000>>	 perimeter = <<9.000>>, <<Trapezoid>>:	"
				+ " ID = <<C>>	 area = <<510.000>>	 perimeter = <<65.000>>, <<EquilateralTriangle>>:	 ID = <<D>>	 area = <<0.433>>	 perimeter = <<2.000>>]");
		Assert.assertEquals("toString incorrect.", sorter.toString(), "[<<Square>>:	 ID = <<A>>	 area = <<16.000>>	 perimeter = <<16.000>>, <<Rectangle>>:	 ID = <<B>>	 area = <<4.000>>	"
				+ " perimeter = <<9.000>>, <<Trapezoid>>:	 ID = <<C>>	 area = <<510.000>>	 perimeter = <<65.000>>, <<EquilateralTriangle>>:	 ID = <<D>>	 area = <<0.433>>	 perimeter = <<2.000>>]");
	}
}
