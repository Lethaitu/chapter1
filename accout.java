package chap1;

public class accout {
    private String id;
    private String name;
    private int balance=0;
    public accout(String id, String name) {
    	this.id=id;
    	this.name=name;
    }
    public accout(String id, String name, int balance) {
    	this.id=id;
    	this.name=name;
    	this.balance=balance;
    }
    public String getid() {
    	return id;
    }
    public String getname() {
    	return name;
    }
    public int getbalance() {
    	return balance;
    }    
    public void credit(int amout) {
    	if (amout > 0) {
    		balance += amout;
    	}else {
    		System.out.println();
    
    	}
    }
    
}
