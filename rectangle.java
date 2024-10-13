package chap1;

public class rectangle {
   private double width;
   private double length;
public rectangle(double width, double length) {
	this.width=width;
	this.length=length;
}
public double getwidth() {
	return width;
}
public void setwidth(double width) { 
	this.width= width;
}
public double getlength() { 
	return length;
}
public void setlength(double length) {
	this.length= length;
}
public double area() {
	return width*length;
}
public double perimeter() {
	return 2 * (width + length);
}
public String toString() {
	return "rectangle("+"width="+width+"length="+length+')';
}
}
