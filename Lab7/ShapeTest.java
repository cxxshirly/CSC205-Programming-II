import java.util.*;
import java.awt.*;

public class ShapeTest
{
	public static void main(String[] args)
	{	
		Color testColor = new Color(10, 20, 30);
//		Shape testShape = new Shape(10,10,testColor);
		Circle testCircle = new Circle(0, 0, testColor, 5);
		Rectangle testRect = new Rectangle(0, 0, testColor, 2, 3);
		System.out.println(testCircle);
		System.out.println(testRect);
		testCircle.scale(5.0);
		testRect.scale(5.0);
		System.out.println(testCircle);
		System.out.println(testRect);
		System.out.println(testCircle.area());
		System.out.println(testRect.area());
	}
}
