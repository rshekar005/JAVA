package com.interfacedemo;

public class BMW implements Car
{

	@Override
	public void start() {
      System.out.println("BMW -- Start");		
	}

	@Override
	public void stop() {
		System.out.println("BMW -- Stop");
		
	}

	@Override
	public void refuel() {
      System.out.println("BMW -- Refuel");		
	}
	//Own method of BMW class -- Non Overriden method
	public void threadSafety()
	{
		System.out.println("BMW -- Thread Safety");
	}
	}

