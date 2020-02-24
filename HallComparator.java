package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class HallComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		String a[]=new String[3];
		a=s1.split(",");
		String b[]=new String[3];
		b=s2.split(",");
		String c[]=new String[3];
		c=s3.split(",");
		
ArrayList<Hall> al=new ArrayList<Hall>();
al.add(new Hall(a[0],Double.parseDouble(a[1]),Integer.parseInt(a[2])));
al.add(new Hall(b[0],Double.parseDouble(b[1]),Integer.parseInt(b[2])));
al.add(new Hall(c[0],Double.parseDouble(c[1]),Integer.parseInt(c[2])));


Collections.sort(al);
System.out.format("%-15s %-15s %s\n","name","costperday","capacity");

for(Hall h:al){
	System.out.format("%-15s %-15s %s\n",h.getName(),h.getCostperday(),h.getCapacity() );
}
	}

	

}
