package NaveenLinkedListConcepts;

import java.util.Vector;

public class Vector2DClass {

	public static void main(String[] args) {
		Vector<String> v= new Vector<>();
		v.add("Java");
		v.add("python");
		v.add("Ruby");
		v.add("C#");
		
		Vector osVector= new Vector<>();
		osVector.add(v); //0
		
		for(int i=0; i<v.size();i++){
			String str= (String)((Vector)osVector.get(0)).get(i);
			System.out.println(str);
		}

	}

}
