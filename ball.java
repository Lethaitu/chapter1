package chap1;

public class ball {
   private float x;
   private float y;
   private int radius;
   private float xDelta;
   private float yDelta;
   public ball(float x, float y,int radius, float xDelta, float yDelta) {
	   this.x=x;
	   this.y=y;
	   this.radius=radius;
	   this.xDelta=xDelta;
	   this.yDelta=yDelta;
   }
   public float getx() {
	   return x;
   }
   public void setx(float x) {
	   this.x=x;
   }
   public float gety() {
	   return y;
   }
   public void sety(float y) {
	   this.y=y;
   }
   public int radius() {
	   return radius;
   }
   public void setradius(int radius) {
	   this.radius=radius;
   }
   public void setxDelta(float xDelta) {
	   this.xDelta=xDelta;
   }
   public void setyDelta(float yDelta) {
	   this.yDelta=yDelta;
   }
   public float getxDelta() {
	   return xDelta;
   }
   public float getyDelta() {
	   return yDelta;
   }
   public void move(double xDelta, double yDelta) {
	   this.x+=xDelta;
	   this.y+=yDelta;
   }
   public void reflecthorizontal() {
	   this.xDelta=-xDelta;
   }
   public void reflecvertical() {
	   this.yDelta=-yDelta;
   }
   public String toString() {
	   return "ball("+"x="+x+"y"+y+')';
	  
   }
}
