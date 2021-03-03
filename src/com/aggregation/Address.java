package com.aggregation;

import com.accessmodifiers.Access;

/**
 * 
 * @author Shekhar
 * Aggregation -- Aggregation maintains HAS-A relationship.Nothing but composition
 *                If a class as an entity is called aggregation.
 * Why Aggregation -- Code re-usability.
 * 
 */
public class Address extends Access
{
	String State,City,Country;

	Address(String City,String State, String Country)
	{
		this.City=City;
		this.State=State;
		this.Country=Country;
	}
	
	public static void main(String args[]) {
		Access a = new Access();
		System.out.println(a.getA());
		//System.out.println(a.def);
	}

}
