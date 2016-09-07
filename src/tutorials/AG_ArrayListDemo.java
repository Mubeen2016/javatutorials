package tutorials;
import java.util.ArrayList;


public class AG_ArrayListDemo {

	public static void main(String[] args) {
		
		//Defining ArrayList and adding elements
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Banana");
		list1.add("apple");
		list1.add("cucumber");
		list1.add("dryfruits");
		
		System.out.println(list1);
		//output: [Banana, apple, cucumber, dryfruits]
		
		for(String l:list1){
			System.out.println(":: " + l);
		}
		
		//Usage of Arraylist to add two arrays
		String[] string1 = {"HIE","Dogiie","Rock"};
		String[] string2 = {"Blackboard","Testing"};
		

		ArrayList<String> m = mergeString(string1,string2);
		
		System.out.println(m);
		
	}
	
	public static ArrayList<String> mergeString(String[] s1, String[] s2){
		ArrayList<String> myList = new ArrayList<String>();
		
		for(String s:s1) myList.add(s);
		for(String s:s2) myList.add(s);
		
		return myList;
		
	}

}
