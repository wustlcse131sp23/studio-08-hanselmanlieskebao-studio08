package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;

	
	public Date(int m, int d, int y, boolean hol) {
		month = m;
		day = d;
		year = y;
		holiday= hol;
	}
	
	public String toString() {
		return month + "/" + day+ "/" + year+ " " + holiday;
	}
	
    public static void main(String[] args) {
    	Date jan = new Date(1,1,2023,true);
    	Date feb = new Date(1,1,2023,false);
    	Date jul = new Date(7,4,2003,true);
    	Date sep = new Date(9,15,1354, false);
    	Date dec = new Date(10,10,10,true);
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(jan);
    	list.add(jan);
    	list.add(jan);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(jan);
    	set.add(jan);
    	set.add(feb);
    	
    	System.out.println(jan.toString());
    	System.out.println(set);
    }

   
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
