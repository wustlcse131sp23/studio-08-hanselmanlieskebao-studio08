package studio8;

import java.util.Objects;

public class Appointment {
	
	private Date a;
	private Time b;
	
	public Appointment(Date d, Time t) {
		a=d;
		b=t;
	}
	
	public static void main(String args[]) {
	    Date c = new Date(1,1,1,true);
	    Time d = new Time(1,1,true);
	    Date e = new Date(1,2,1,false);
	    Time f = new Time(1,1,false);
	    
		Appointment one = new Appointment(c,d);
		Appointment two = new Appointment(e,f);
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(a, other.a) && Objects.equals(b, other.b);
	}
	
	

}
