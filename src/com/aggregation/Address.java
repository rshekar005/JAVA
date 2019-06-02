package com.aggregation;
/**
 * 
 * @author Shekhar
 * Aggregation -- Aggregation maintains HAS-A relationship.
 *                If a class as an entity is called aggregation.
 * Why Aggregation -- Code re-usability.
 * 
 */
public class Address 
{
	String State,City,Country;

	Address(String City,String State, String Country)
	{
		this.City=City;
		this.State=State;
		this.Country=Country;
	}

}
