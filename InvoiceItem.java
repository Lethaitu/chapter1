package chap1;

public class InvoiceItem {
private String id;
private String desc;
private int qty;
private double unitprice;
  
public InvoiceItem(String id, String desc, int qty, double unitprice) { 
	this.id=id;
	this.desc=desc;
	this.qty=qty;
	this.unitprice=unitprice;
	}
public String getid() {
	return id;
}
public String getdesc() {
    return desc; 
}
public int qty() {
	return qty;
}
public void setqty(int qty) {
	this.qty=qty;
}
public double unitprice() {
	return unitprice;
}
public void setuniprice(double unitprice) {
	this.unitprice=unitprice;
}
public double total() {
	return qty*unitprice;
}
public String toString() {
	return "InvoiceItem("+"id="+id+"desc="+desc+"qty"+qty+"unitprice"+unitprice+')';
}
}

