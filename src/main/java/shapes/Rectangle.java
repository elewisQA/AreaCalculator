package shapes;

public class Rectangle implements Shape{
	//---[ Class Variables ]---
	private int length, width;
	
	//---[ Class Constructor(s) ]---
	public Rectangle() {
		length = 1;
		width = 1;
	}
	
	//---[ Class Methods ]---
	public int calculateArea() {
		return length * width;
	}

	//---[ Getters & Setters ]---
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
