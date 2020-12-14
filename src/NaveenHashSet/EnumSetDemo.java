package NaveenHashSet;

import java.util.EnumSet;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * 
 * @author rajasekhar
 * 1. It not synchronized
 * 2. It is fater than HasSet
 * 3. all methods are implemented with bitwise operator
 */
public class EnumSetDemo {

	enum lang{
		JAVA,
		JAVASCRIPT,
		CSHARP,
		PYHTON
	}
	public static void main(String[] args) {
		EnumSet<lang> langs= EnumSet.allOf(lang.class);
		System.out.println(langs);
		
		//empty enum
		EnumSet<lang> emptyenum= EnumSet.noneOf(lang.class);
		System.out.println(emptyenum);
		
		//Range
		EnumSet<lang> range= EnumSet.range(lang.JAVA,lang.CSHARP);
		System.out.println(range);
		
		//Of
		EnumSet<lang> singleLang= EnumSet.of(lang.CSHARP);
		System.out.println(singleLang);//[CSHARP]
		
		//Multiple lang selections
		EnumSet<lang> multiplelang= EnumSet.of(lang.CSHARP,lang.JAVASCRIPT);
		System.out.println(multiplelang); //[JAVASCRIPT, CSHARP]
		
		
		//and and addAll()
		EnumSet<lang> all= EnumSet.allOf(lang.class);
		EnumSet<lang> none= EnumSet.allOf(lang.class);
		none.add(lang.JAVASCRIPT);
		none.addAll(all);
		System.out.println(none);
		
		Iterator<lang> itr= none.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next());
			System.out.print(",");
		}
		
		//remove and removeall
		EnumSet<lang> newlang= EnumSet.allOf(lang.class);
		System.out.println(newlang);
		
		boolean b= newlang.remove(lang.JAVA);
		System.out.println(b);
		System.out.println(newlang);
		
		boolean b1=newlang.removeAll(langs);
		System.out.println(b1);
		System.out.println(newlang);
	}

}
