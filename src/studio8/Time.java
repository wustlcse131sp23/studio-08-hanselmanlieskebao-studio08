package studio8;

import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute;
	private boolean twelve;
	private boolean meridiem;

	public Time (int h, int m, boolean i) {
		hour = h;
		minute = m;
		twelve=i;
		meridiem=false;
	}
	
	public String toString( ) {
		if(twelve) {
			if(hour==0) {
				hour=12;
			}else if(hour>12) {
				meridiem = true;
				hour=hour-12;
			}
			if(hour==12) {
				meridiem=true;
			}
			if (meridiem) {
				if(minute<10) {
					return hour + ":0" + minute+" pm";
					} else {
						return hour + ":" + minute+" pm";
					}
			}else {
				if(minute<10) {
					return hour + ":0" + minute+" am";
					} else {
						return hour + ":" + minute+" am";
					}
			}
		}
		
		
		
		if(minute<10) {
		return hour + ":0" + minute;
		} else {
			return hour + ":" + minute;
		}
	}
	public static void main(String[] args) {
		Time midnight = new Time (12, 00,true);
    	System.out.println(midnight.toString());
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}