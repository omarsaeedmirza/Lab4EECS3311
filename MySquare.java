
//package shape;


import java.awt.Color;
import java.awt.Graphics;


public class MySquare implements Comparable <MySquare>{

	protected int upperX; 
	protected int upperY;
	protected int length;
	protected Color shapeColor;
	
	/**
	 * Class's constructor
	 * @param upperX
	 * @param upperY
	 * @param width
	 * @param height
	 * @param shapeColor
	 */
	public MySquare (int upperX, int upperY, int length, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.length = length;
		this.shapeColor = shapeColor;
	}
	


	@Override
	public int compareTo(MySquare o) {
		// TODO write the right Java code here to support the comparison
		return 0;
	}
	
	/**
	 * Method to draw a rectangle
	 * @param form
	 */
	public  void drawShape(Graphics	form) {
		form.fillRect(upperX, upperY, length, length);
	}
	
    
    //getters
    public Color getColor() {
		return shapeColor;
	}
    
    
    public int getLength() {
    	return length;
    }
    
	public int getUpperX() {
		return upperX;
	}
	
	public int getUpperY() {
		return upperY;
	}
	
	//setters
	 public void setColor(Color aShapeColor) {
		 this.shapeColor = aShapeColor;
	 }
	 
	    
	 public void setLength(int lengths) {
		 this.length = length;
	 }
	 
	 public void setUpperX(int upperX) {
		 this.upperX = upperX;
	 }
		
	 public void setUpperY(int upperY) {
		 this.upperY = upperY;
	 }


}

