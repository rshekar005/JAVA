package com.aggregation;
//Here Employee has an object Address
public class Employee 
{
  int id;
  String name;
  Address address;
  
  Employee(int id,String name, Address address)
  {
	  this.id=id;
	  this.name=name;
	  this.address=address;
	  
  }
  public void display()
  {
	  System.out.println(id +" " +name);
	  System.out.println(address.City +" " +address.State + " "+ address.Country);
  }
  public static void main(String args[])
  {
	  Address add= new Address("Hyderabad", "telangana", "INDIA");
	  Employee emp= new Employee(1, "Rajashekar", add);
	  
	 emp.display();
  }

}
