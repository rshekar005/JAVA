package com.Abstraction;

public class Test {

	public static void main(String[] args) {
        HDFC hb = new HDFC();
        hb.debit();
        hb.credit();
        hb.loan();//overriden method abstract
        System.out.println(hb.a);
        System.out.println(hb.b);
        System.out.println();
        System.out.println("***************************************");
        //Runtime Polymorphism
        Bank b=new HDFC();
        b.loan();
        b.debit();
        b.credit();
	}

}
