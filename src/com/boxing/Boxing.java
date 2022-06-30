package com.boxing;

/**
 * @author Rajashekar.p
 *
 * The automatic conversion of primitive data types into its
 * equivalent Wrapper type is known as boxing and opposite operation is known as unboxing.
 */
public class Boxing {
    public static void main(String[] args) {
        int a = 50; //primitive type
        Integer i= new Integer(a);  // Converion of primitive to Wrapper is nothing but boxing (Can be called as Unboxing)
         System.out.println(i);
    }
}
