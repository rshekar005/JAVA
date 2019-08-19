package com.encapsulation;

public class Test {

	public static void main(String[] args) {
     Student s = new Student();
      s.setSname("Rajashekar");
      s.setSid(101);
      
      Student s2= new Student();
      s2.setSid(90);
      s2.setSname("Ramesh");
      System.out.println(s.getSid()+"  "+s.getSname());
      System.out.println(s2.getSid()+"  "+s2.getSname());
	}

}
