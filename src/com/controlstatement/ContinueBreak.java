package com.controlstatement;

import java.util.Arrays;
import java.util.List;

public class ContinueBreak
{
	public static void main(String args[])
	{
		for(int i=1;i<10;i++)
		{
			if(i==5)
			{
				//break;//It Contition matches then it will skip next statements. It will break the loop.
				continue;//It contition matches then it removes that value and exceute remaining statements. It will break next statment.
			}
			System.out.println(i);
		}
	}

}
