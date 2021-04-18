package shape;

import shape.ShapesInterface.Polygon;

public class square implements Polygon{
	float side;
	public square(float side) {
		this.side = side;
	}
	public void setside(float side){
		this.side = side;
	}
	public float getside(){
		return side;
	}
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println(side*side);
	}
	@Override
	public void CalcPeri() {
		// TODO Auto-generated method stub
		System.out.println(4*side);	
	}	
}
