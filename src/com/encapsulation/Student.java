package com.encapsulation;
/**
 * 
 * @author Shekhar
 * Encapsulation:  Encapsulation is a process wrapping data(fields/variables) and code(Method) together into a single unit.
                   In Encapsulation we declare data members as private variable and need to create getters and setters methods to access over that private data members.
                   It is also known as data hiding
            Use :  It provides control over the data. Suppose if we want access only to get data members then use getters method.
                   For Exmaple , if we want to set 100 as a value for a particular data member then we can write a logic in a setter method.
 */
public class Student 
{
	private String sname;
	private int sid;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		if(sid>=100)// Written own logic that integer value cannot exceed greater than 100 
		{
			System.out.println("Limit only upto 100");
		}
		else
		{
			this.sid = sid;	
		}
		
	}
	
	

}
