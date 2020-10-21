import java.util.Scanner;

public class Date {

	private int day, month, year;
	
	
	private Date( int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	private Date( String day, String month, String year) {
		

		this.day = Integer.parseInt(day);
		
		switch(month) {
		case "January":
			this.month = 1;
			break;
		case "February":
			this.month = 2;
			break;
		case "March":
			this.month = 3;
			break;
		case "April":
			this.month = 4;
			break;
		case "May":
			this.month = 5;
			break;
		case "June":
			this.month = 6;
			break;
		case "July":
			this.month = 7;
			break;
		case "August":
			this.month = 8;
			break;
		case "September":
			this.month = 9;
			break;
		case "October":
			this.month = 10;
			break;
		case "November":
			this.month = 11;
			break;
		case "December":
			this.month = 12;
			break;
			//
		case "january":
			this.month = 1;
			break;
		case "february":
			this.month = 2;
			break;
		case "march":
			this.month = 3;
			break;
		case "april":
			this.month = 4;
			break;
		case "may":
			this.month = 5;
			break;
		case "june":
			this.month = 6;
			break;
		case "july":
			this.month = 7;
			break;
		case "august":
			this.month = 8;
			break;
		case "september":
			this.month = 9;
			break;
		case "october":
			this.month = 10;
			break;
		case "november":
			this.month = 11;
			break;
		case "december":
			this.month = 12;
			break;
			//
		case "Jan":
			this.month = 1;
			break;
		case "Feb":
			this.month = 2;
			break;
		case "Mar":
			this.month = 3;
			break;
		case "Apr":
			this.month = 4;
			break;
		case "Jun":
			this.month = 6;
			break;
		case "Jul":
			this.month = 7;
			break;
		case "Aug":
			this.month = 8;
			break;
		case "Sept":
			this.month = 9;
			break;
		case "Oct":
			this.month = 10;
			break;
		case "Nov":
			this.month = 11;
			break;
		case "Dec":
			this.month = 12;
			break;
			//
		case "jan":
			this.month = 1;
			break;
		case "feb":
			this.month = 2;
			break;
		case "mar":
			this.month = 3;
			break;
		case "apr":
			this.month = 4;
			break;
		case "jun":
			this.month = 6;
			break;
		case "jul":
			this.month = 7;
			break;
		case "aug":
			this.month = 8;
			break;
		case "sept":
			this.month = 9;
			break;
		case "oct":
			this.month = 10;
			break;
		case "nov":
			this.month = 11;
			break;
		case "dec":
			this.month = 12;
			break;
		default:
			this.month = Integer.parseInt(month);
			break;
		}
		
		this.year = Integer.parseInt(year);
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public int setDay(int day) {
		this.day = day;
		return day;
	}
	
	public int setMonth(int month) {
		this.month = month;
		return month;
	}
	
	public String setMonth(String month) {
		this.month = Integer.parseInt(month);
		return month;
	}

	public int setYear(int year) {
		this.year = year;
		return year;
	}
	
	public String toString(int month, boolean x) {
		String sMonth = "";
		String months [] = {"January","February","March","April","May","June","July","August","September","November", "December"};
		
		sMonth = months[month-1];
		
		if (x) {
			return day + " " + sMonth + " of " + year;
		}
		
		return sMonth;
	}

	public int compareTo(Date fecha) {
 
		if (( day == fecha.getDay() ) &&  ( month == fecha.getMonth() ) && ( year == fecha.getYear() ) ) {
			return 0;
		}else if ( ( day < fecha.getDay() || day > fecha.getDay() ) && ( month < fecha.getMonth() || month > fecha.getMonth() ) && ( year < fecha.getYear() ) ) {
			return -1;
		}else {
			return 1;
		}
	}
	
	 int getMonthDays(int month) {
		 
		 int months [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		 return (months[month-1]);
	 }
	
	 int getMonthDays(String month) {
		 int monthint = Integer.parseInt(month);
		 int months [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		 return (months[monthint-1]);
	 }
	 
	 public static void main(String arg[]) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Input your birthday (dd|mm|aaaa) could be month numbers or letters: ");
		 Date borndate = new Date(input.next(), input.next(), input.next());
		 System.out.print("Input any date could be actual or old (format dd|mm|aaaa): ");
		 Date actualdate = new Date(input.next(), input.next(), input.next());
		 
		//actualdate.setDay(input.nextInt());
		System.out.println(actualdate.getDay() + " " + actualdate.getMonth() + " " + actualdate.getYear());
		System.out.println(borndate.compareTo(actualdate));
		System.out.println(borndate.toString(borndate.getMonth(), true) + " has " + borndate.getMonthDays(borndate.getMonth()) + " days." );
		input.close();
	 }
	
}
