
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private String date;
	
	public MyDate() {
	}
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.date = getStrDate();
	}
	
	private String getStrDate() {
		String[] strMonth = {" ", "January", "February", "March", "April", "May", "June",
				"July", "Augoust", "September", "Ocotbor", "November", "December"};
		String[] order = {" ", "st", "nd", "rd", "th"};
		
		return strMonth[month] + " " + day + order[Math.min(4, day)] + " " + year;
	}
	
	public void accept() {
		System.out.print("Dien ngay, thang, nam (dd/mm/yyyy):");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] splited = str.split("/");
		
		setDay(Integer.valueOf(splited[0]));
		setMonth(Integer.valueOf(splited[1]));
		setYear(Integer.valueOf(splited[2]));
		setDate(getStrDate());
		
	}
	
	public static void print(MyDate myList[], int length) {
		for(int i = 0; i < length; i++) {
			myList[i].print();
		}
	}
	
	public void print(int format) {
		String dateFormat;
		switch(format) {
			case 1:
				dateFormat = this.day + " / " + this.month + " / " + this.year;
				System.out.println("dd/mm/yyyy: " + dateFormat);
				break;

			case 2:
				dateFormat = this.year%100 + " / " + this.month + " / " + this.day;
				System.out.println("yy/mm/dd: " + dateFormat);
				break;
				
			default:
				System.out.println("ERROR!");
				break;
		}
	}
	
	public void print() {
		System.out.println(date);
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}