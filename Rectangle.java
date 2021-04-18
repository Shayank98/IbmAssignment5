package shape;

import shape.ShapesInterface.Polygon;

public class Rectangle implements Polygon{
	float length;
	float breadth;
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public void setlength(float length){
		this.length = length;
	}
	public float getlength(){
		return length;
	}
	public void setbreadth(float breadth){
		this.breadth = breadth;
	}
	public float getbreadth(){
		return breadth;
	}
	
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println(length * breadth);
	}
	@Override
	public void CalcPeri() {
		// TODO Auto-generated method stub
		System.out.println(2*(length + breadth));
	}
}
