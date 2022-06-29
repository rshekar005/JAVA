
package com.constructor;

public class ConstructorOverloading {
    /**
     * Constructor overloading is same as method overloading with no return type. But in method we can decalre return type.
     * Constructor vs Methods
     * ==========================
     * 1. Constructor is used to initialize objects where as Method is used how an object is behaviour.
     * 2. Constructor does not have any return type whereas for method we can write return type.
     * 3. Java compiler provided default constructor, if you don't have any constructor. Where as Method is not provided at the time of compiler in any case.
     * 4. Constructor name must be class name where as Method name can be any name but meaningfull name.
     */

    int id;
    String name;
    int age;

    public ConstructorOverloading(int i, String n) {
        id = i;
        name = n;
    }

    public ConstructorOverloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        ConstructorOverloading c1 = new ConstructorOverloading(50, "Shekar");
        c1.display();
        ConstructorOverloading c2 = new ConstructorOverloading(20, "Rajendar", 30);
        c2.display();
    }

}
