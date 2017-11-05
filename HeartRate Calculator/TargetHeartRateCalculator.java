package par1;

import java.util.*;


public class HeartRates {
	
	
	
	String first_name,last_name;
	int birth_day, birth_month, birth_year, this_year;
	
	
	
	public HeartRates(String first_name, String last_name, int birth_day, int birth_month, int birth_year, int this_year) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.birth_day = birth_day;
		this.birth_month = birth_month;
		this.birth_year = birth_year;
		this.this_year = this_year;
		
	}
		
		
		public String getFirst() {
			return first_name;
		}
		
		public String getLast()
		{
		return last_name;
		}
		
		public int getBirthDay()
		{
		return birth_day;
		}
		
		public int getBirthMonth()
		{
		return birth_month;
		}
		
		public int getBirthYear()
		{
		return birth_year;
		}
		
		public int getCurrentYear()
		{
		return this_year;
		}
		
		public void setFirst(String first_name)
		{
		this.first_name = first_name;
		}
		
		public void setLast(String last_name)
		{
		this.last_name = last_name;
		}
		
		public void setBirthYDay(int bd)
		{
		this.birth_day = bd;
		}
		
		public void setBirthMonth(int bm)
		{
		this.birth_month = bm;
		}
		
		public void setBirthYear(int by)
		{
		this.birth_year = by;
		}
		
		public void setCurrentYear(int cy)
		{
		this.this_year = cy;
		}
		
		public int calcAge()
		{
		return this_year - birth_year;
		}
		
		public int calcMaxHR()
		{
		return 220-calcAge();
		}
		
		public double targetMinHR()
		{
		return calcMaxHR()*.5;
		}
		
		public double targetMaxHR()
		{
		return calcMaxHR()*.85;
		}

}


public class TargetHeartRateCalculator {
	
	public static void main(String[] args) {
		
		String first_name,last_name;
		int birth_day, birth_month, birth_year, this_year;
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Your First Name: ");
		first_name = user_input.next();
		
		System.out.print("Your Last Name: ");
		last_name = user_input.next();
		
		System.out.print("Enter the day you were born, range 1 to 31: ");
		birth_day = user_input.nextInt();
		
		System.out.print("Enter the month you were born, range 1 to 12: ");
		birth_month = user_input.nextInt();
		
		System.out.print("Enter the year you were born, range 1900 to 2017: ");
		birth_year = user_input.nextInt();
		
		System.out.print("Which year is this: ");
		this_year = user_input.nextInt();
		
		HeartRates heart_rate = new HeartRates(first_name,last_name,birth_day,birth_month,birth_year,this_year);
		
		System.out.println("\n" + heart_rate.getFirst()+ " " + heart_rate.getLast() + "'s heart rate information: ");
		System.out.println("Birth Date: " + birth_month + "-" + birth_day + "-" + birth_year);
		System.out.println("So your age is: " + heart_rate.calcAge() + " years");
		System.out.println("You should not cross your heart rate beyond " + heart_rate.calcMaxHR() + " beats per minute.");
		System.out.println("Target Heart Rate for you is in the range of " + heart_rate.targetMinHR()+ " and " + heart_rate.targetMaxHR() + " beats per minute.");
	}
}

