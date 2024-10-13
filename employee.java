package chap1;

public class employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
public employee(int id, String firstname, String lastname, int salary) {
	this.id=id;
	this.firstname=firstname;
	this.lastname=lastname;
	this.salary=salary;
}
public int getid() { 
	return id;
}
public String getfirstname() {
	return firstname;
} 
public String getlastname() {
	return lastname;
}
public int getsalary() {
	return salary;
}
public void setsalary(int salary) {
	this.salary= salary;
}
public int raisesalary(int percent) {
	return salary;
}
public String toString() { 
	return "employee("+"id="+id+"firstname"+firstname+"salary"+salary+')';
}

}
