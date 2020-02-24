package collections;

public class Hall implements Comparable<Hall> {
	private String name;
	private double costperday;
	private int capacity;
	@Override
	public String toString() {
		return "Hall [name=" + name + ", costperday=" + costperday + ", capacity=" + capacity + "]";
	}
	public String getName() {
		return name;
	}
	
	public double getCostperday() {
		return costperday;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public Hall(String name,double costperday,int capacity){
		this.name=name;
		this.costperday=costperday;
		this.capacity=capacity;	
	}
	/*@Override
	public int compareTo(Hall o) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	public int compareTo(Hall ob){
		double comcostperday=((Hall)ob).getCostperday();
		return (int) (comcostperday-this.costperday);
	}
	

}
