package Entities01;

public class Rectangle {
	
	public double Width; //largura
	public double Height; //Altura

	public double AREA() {
		return Width*Height;
	}
	public double PERIMETER() {
		return 2 * (Width + Height);
	}
	public double DIAGONAL() {
		return Math.sqrt(Width * Width + Height * Height);

	}
	 
}
