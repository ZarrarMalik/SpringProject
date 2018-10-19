package com.example.demo;

public class Employee {
int eId;
String eName;
Address address;

public Employee() {
	System.out.println("----Employee object constructed----- ");
}


//constructor injection
public Employee(Address address) {
	this.address = address;
}

public int geteId() {
	return eId;
}

public void seteId(int eId) {
	this.eId = eId;
}

public String geteName() {
	return eName;
}

public void seteName(String eName) {
	this.eName = eName;
}

public Address getAddress() {
	return address;
}

//Setter injection
public void setAddress(Address address) {
	this.address = address;
}

public void myInitialization() {
System.out.println("-----Object is initialized--------");	
}

public void myDestroy() {
System.out.println("-----Object is Destroyed--------");	
}


@Override
public String toString() {
	return "Employee [eId=" + eId + ", eName=" + eName + ", address=" + address + "]";
}


	
}
