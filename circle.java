package chap1;

public class circle {
    private double radius;
    private String color;
public circle() {
	radius=1.0;
	color="red";
}
public double getradius() {
	return radius;
}
public double getArea() {
	return radius*radius*Math.PI;
}
   }
