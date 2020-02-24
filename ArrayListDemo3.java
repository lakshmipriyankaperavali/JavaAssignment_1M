package collections;
import java.util.*;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="12-345-678";
		String s2="ab-cd-efgh";
		ArrayList al=new ArrayList();
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='-'){
				al.add(i);
			}
		}
		
		ArrayList al1=new ArrayList();
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)=='-'){
				al1.add(i);
			}
		}
		System.out.println(al);
		System.out.println(al1);
		if(al.equals(al1)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}

}
