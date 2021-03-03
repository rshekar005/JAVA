package com.accessmodifiers;
/**
 * 
 * @author Shekhar
 * 
 * It defines the scope of the fields, method. constructor or class
 * Private AccessModifiers --> The access level of a private modifier is only within the class. 
 * It cannot be accessed from outside the class, outside of package.
 * It can be access with the help of getters and setters method inside the package and outside the package
 *   Please check {@link com.aggregation.Address.java}
 * Default Access Modifiers --> The access level of a default access modifier is within the class and 
 * 								outside the class of same package. It cannot be accessed outside the package.
 * 								Please check {@link com.aggregation.Address.java}
 * 
 * Protected Access Modifiers --> The access level of Protected access modifier is within the class, outside the class , 
 *                                outside the package but using inheritance concept.
 *                                The protected access modifier can be applied on the data member, method and constructor.
 *                                
 * Public --> The access level of a public modifier is everywhere. It can be accessed from within the class, 
 *            outside the class, within the package and outside the package.
 */
public class Access 
{
	private int a=100;
	private void msg()
	{
		System.out.println("Hello");
	}
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getDef() {
		return def;
	}

	public void setDef(String def) {
		this.def = def;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}
	String def= "Shekar";// Default access modifiers
	
	protected String used="Raja";

}
