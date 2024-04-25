package eoy_project;

public class Box {
	private String pic;
	private int x;
	private int y;
	private int dx;
	private int dy;
	private int width;
	private int height;
	public Box() {
		pic="";
		x=0;
		y=0;
		dx=0;
		dy=0;
		width=0;
		height=0;
	}
	public Box(String s, int x1, int y1, int dx1, int dy1) {
		pic=s;
		x=x1;
		y=y1;
		dx=dx1;
		dy=dy1;
	}
	public Box(String s, int x1, int y1, int dx1, int dy1,int w,int h) {
		pic=s;
		x=x1;
		y=y1;
		dx=dx1;
		dy=dy1;
		width=w;
		height=h;
	}
	public String getPic() {
		return pic;
	}
	public int getW() {
		return width;
	}
	
	public int getH() {
		return height;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	
	}
	
	public boolean collision(Box b) {
		return this.getX()+this.getW()>=b.getX()&&
				this.getX()<=b.getX()+b.getW()&&
				this.getY()+this.getH()>=b.getY()&&
				this.getY()<=b.getY()+b.getH();
				
	}
	public int getDX() {
		return dx;
	}
	public int getDY() {
		return dy;
	}
public void move(int w1, int h1) {
	x+=dx;
	y+=dy;
	if(x<0)
		x=0;
	if(x+width>w1)
		x=w1-width;	
	if(y<0)
		y=0;
	if(y+height>h1)
		y=h1-height;
}
public void setDX(int i) {
	this.dx=i;
	
}
public void setDY(int i) {
	this.dy=i;
}
public void clearDx() {
	this.dx=0;
}
public void clearDy() {
	this.dy=0;
}
public void bounce(int width2, int height2) {
	x+=dx;
	y+=dy;
	if(x<0||x+width>width2) {
		dx*=-1;
	}
	if(y<0||y+height>height2)
		dy*=-1;
	
}
}
