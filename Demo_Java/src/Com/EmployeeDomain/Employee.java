package Com.EmployeeDomain;

import java.io.Serializable;

public class Employee implements Serializable{

	transient int eid; // not going to serialize
	String ename;
	double esal;
	
	public Employee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
}
